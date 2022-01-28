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
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseStroke(stroke18, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer21.setItemLabelAnchorOffset((-1.0d));
        boolean boolean24 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer21);
        int int25 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        int int30 = statisticalBarRenderer26.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer26.getNegativeItemLabelPositionFallback();
        boolean boolean34 = statisticalBarRenderer26.getItemVisible((int) (byte) 0, 1);
        java.awt.Paint paint36 = statisticalBarRenderer26.lookupSeriesFillPaint((int) 'a');
        statisticalBarRenderer0.setBaseItemLabelPaint(paint36, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(itemLabelPosition31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        boolean boolean15 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation14);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke7);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.removeAnnotations();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = statisticalBarRenderer23.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = statisticalBarRenderer23.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer32);
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(1, categoryURLGenerator39);
        statisticalBarRenderer0.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        java.awt.Paint paint47 = statisticalBarRenderer0.getItemLabelPaint((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertNotNull(gradientPaintTransformer32);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseStroke(stroke18, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer21.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = statisticalBarRenderer21.hasListener(eventListener24);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke28 = statisticalBarRenderer26.getSeriesOutlineStroke((int) (byte) 10);
        int int29 = statisticalBarRenderer26.getPassCount();
        java.awt.Font font31 = statisticalBarRenderer26.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer26.getBasePositiveItemLabelPosition();
        statisticalBarRenderer21.setNegativeItemLabelPositionFallback(itemLabelPosition32);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition32);
        boolean boolean35 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator37);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(stroke28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(font31);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        int int17 = statisticalBarRenderer14.getPassCount();
        boolean boolean18 = statisticalBarRenderer14.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer14.setBaseSeriesVisible(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = statisticalBarRenderer22.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer22.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29, false);
        int int32 = statisticalBarRenderer28.getColumnCount();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer28.setErrorIndicatorPaint(paint33);
        statisticalBarRenderer22.setBaseItemLabelPaint(paint33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = statisticalBarRenderer36.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke40 = statisticalBarRenderer36.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer22.setBaseStroke(stroke40, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer43.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener46 = null;
        boolean boolean47 = statisticalBarRenderer43.hasListener(eventListener46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke50 = statisticalBarRenderer48.getSeriesOutlineStroke((int) (byte) 10);
        int int51 = statisticalBarRenderer48.getPassCount();
        java.awt.Font font53 = statisticalBarRenderer48.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer48.getBasePositiveItemLabelPosition();
        statisticalBarRenderer43.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer22.setPositiveItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer14.setBaseNegativeItemLabelPosition(itemLabelPosition54);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition54);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 100, 10);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(stroke50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(font53);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 100);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setItemMargin(0.2d);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer11 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator17, false);
        java.awt.Stroke stroke20 = null;
        statisticalBarRenderer13.setErrorIndicatorStroke(stroke20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer13.setItemLabelAnchorOffset((double) (-1.0f));
        statisticalBarRenderer13.setBaseSeriesVisible(true, true);
        java.awt.Stroke stroke30 = statisticalBarRenderer13.getBaseStroke();
        statisticalBarRenderer0.setSeriesStroke(10, stroke30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(gradientPaintTransformer11);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 100);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesVisible((int) (short) -1);
        double double11 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Shape shape8 = statisticalBarRenderer0.getItemShape((int) 'a', (int) (byte) -1);
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) ' ');
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemFillPaint((-1), (int) '#');
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator3);
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.plot.Marker marker8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D5, categoryPlot6, valueAxis7, marker8, rectangle2D9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = statisticalBarRenderer0.hasListener(eventListener17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        double double24 = statisticalBarRenderer20.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        double double26 = statisticalBarRenderer20.getBase();
        java.awt.Stroke stroke27 = statisticalBarRenderer20.getErrorIndicatorStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke(100, stroke27);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 1, (int) ' ');
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer13.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke18 = statisticalBarRenderer13.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer13.setBaseItemLabelGenerator(categoryItemLabelGenerator19);
        java.awt.Stroke stroke23 = statisticalBarRenderer13.getItemStroke((int) (byte) -1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(false);
        int int29 = statisticalBarRenderer24.getRowCount();
        java.awt.Shape shape30 = statisticalBarRenderer24.getBaseShape();
        statisticalBarRenderer13.setBaseShape(shape30);
        java.awt.Paint paint32 = statisticalBarRenderer13.getBasePaint();
        statisticalBarRenderer0.setErrorIndicatorPaint(paint32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = statisticalBarRenderer0.getSeriesItemLabelGenerator(10);
        boolean boolean37 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator41);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = statisticalBarRenderer10.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer10.setBaseCreateEntities(true, false);
        boolean boolean17 = statisticalBarRenderer10.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer10.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator19);
        double double21 = statisticalBarRenderer10.getLowerClip();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        boolean boolean23 = statisticalBarRenderer10.removeAnnotation(categoryAnnotation22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        statisticalBarRenderer10.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator25, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer29.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = null;
        statisticalBarRenderer29.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator35, true);
        java.awt.Paint paint38 = statisticalBarRenderer29.getErrorIndicatorPaint();
        java.awt.Paint paint39 = statisticalBarRenderer29.getErrorIndicatorPaint();
        statisticalBarRenderer10.setSeriesPaint((int) ' ', paint39);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) ' ', paint39);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint9 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, (int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean16 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer17.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator21, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer24.setBaseCreateEntities(true, false);
        java.awt.Font font31 = null;
        statisticalBarRenderer24.setSeriesItemLabelFont((int) '4', font31);
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseStroke(stroke33);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer24.getBasePositiveItemLabelPosition();
        statisticalBarRenderer17.setBaseNegativeItemLabelPosition(itemLabelPosition35, false);
        java.awt.Paint paint39 = statisticalBarRenderer17.lookupSeriesPaint((int) '4');
        statisticalBarRenderer0.setBaseItemLabelPaint(paint39, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) ' ');
        double double7 = statisticalBarRenderer0.getLowerClip();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) 10, itemLabelPosition10);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Paint paint16 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 1, (int) (short) 10);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        int int9 = statisticalBarRenderer6.getPassCount();
        statisticalBarRenderer6.setMinimumBarLength(10.0d);
        java.lang.Boolean boolean13 = statisticalBarRenderer6.getSeriesVisible((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer6.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer14);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        double double21 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator22);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke5 = statisticalBarRenderer3.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer3.setAutoPopulateSeriesOutlinePaint(false);
        int int8 = statisticalBarRenderer3.getRowCount();
        java.awt.Shape shape9 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape9);
        double double11 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        java.awt.Paint paint19 = null;
        statisticalBarRenderer12.setSeriesOutlinePaint((int) '4', paint19);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = statisticalBarRenderer12.getBaseToolTipGenerator();
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = statisticalBarRenderer25.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke29 = statisticalBarRenderer25.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer12.setSeriesStroke((int) (byte) 0, stroke29);
        statisticalBarRenderer12.setItemLabelAnchorOffset((double) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer12.getNegativeItemLabelPosition(10, 1);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition35, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.awt.Stroke stroke40 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNull(stroke5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint9 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 1);
        statisticalBarRenderer0.setDrawBarOutline(false);
        double double12 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer14.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer14.getLegendItemToolTipGenerator();
        statisticalBarRenderer14.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        double double21 = statisticalBarRenderer14.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = statisticalBarRenderer22.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer22.setBaseCreateEntities(true, false);
        boolean boolean29 = statisticalBarRenderer22.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape31 = statisticalBarRenderer22.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean33 = statisticalBarRenderer22.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35, false);
        int int38 = statisticalBarRenderer34.getColumnCount();
        java.awt.Paint paint39 = statisticalBarRenderer34.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem42 = statisticalBarRenderer34.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer34.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = statisticalBarRenderer34.getLegendItemLabelGenerator();
        statisticalBarRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator45);
        statisticalBarRenderer14.setLegendItemToolTipGenerator(categorySeriesLabelGenerator45);
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator45);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = statisticalBarRenderer0.getURLGenerator((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(legendItem42);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator45);
        org.junit.Assert.assertNull(categoryURLGenerator51);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setBaseCreateEntities(true, false);
        java.awt.Font font13 = null;
        statisticalBarRenderer6.setSeriesItemLabelFont((int) '4', font13);
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseStroke(stroke15);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer6.getBasePositiveItemLabelPosition();
        statisticalBarRenderer6.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        statisticalBarRenderer6.setSeriesToolTipGenerator((int) (short) 0, categoryToolTipGenerator23);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer25 = statisticalBarRenderer6.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer25);
        boolean boolean27 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryURLGenerator4);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(gradientPaintTransformer25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint7 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Shape shape11 = statisticalBarRenderer0.getSeriesShape((int) '4');
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesOutlinePaint(100);
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        java.lang.Object obj15 = statisticalBarRenderer0.clone();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 1);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(categoryURLGenerator17);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer8.setBaseURLGenerator(categoryURLGenerator9, false);
        int int12 = statisticalBarRenderer8.getColumnCount();
        int int13 = statisticalBarRenderer8.getColumnCount();
        java.awt.Paint paint15 = statisticalBarRenderer8.getSeriesItemLabelPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer8.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20, false);
        int int23 = statisticalBarRenderer19.getColumnCount();
        int int24 = statisticalBarRenderer19.getColumnCount();
        java.awt.Paint paint25 = statisticalBarRenderer19.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke28 = statisticalBarRenderer26.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer26.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = statisticalBarRenderer26.hasListener(eventListener32);
        java.awt.Shape shape36 = statisticalBarRenderer26.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer19.setBaseShape(shape36, true);
        statisticalBarRenderer8.setBaseShape(shape36, true);
        statisticalBarRenderer0.setBaseShape(shape36);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        int int25 = statisticalBarRenderer21.getColumnCount();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint26);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint26, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Stroke stroke34 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer38.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer38.setBaseFillPaint(paint41);
        boolean boolean43 = statisticalBarRenderer38.getAutoPopulateSeriesStroke();
        java.awt.Paint paint45 = statisticalBarRenderer38.lookupSeriesOutlinePaint(0);
        java.awt.Paint paint46 = statisticalBarRenderer38.getBaseItemLabelPaint();
        boolean boolean47 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer38);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer48 = statisticalBarRenderer38.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke51 = statisticalBarRenderer49.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer49.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        statisticalBarRenderer55.setBaseURLGenerator(categoryURLGenerator56, false);
        int int59 = statisticalBarRenderer55.getColumnCount();
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer55.setErrorIndicatorPaint(paint60);
        statisticalBarRenderer49.setBaseItemLabelPaint(paint60);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation63 = null;
        boolean boolean64 = statisticalBarRenderer49.removeAnnotation(categoryAnnotation63);
        java.awt.Stroke stroke65 = statisticalBarRenderer49.getBaseStroke();
        statisticalBarRenderer38.setBaseStroke(stroke65);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer48);
        org.junit.Assert.assertNull(stroke51);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(stroke65);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(itemLabelPosition14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 0);
        boolean boolean8 = statisticalBarRenderer0.getItemCreateEntity((-1), 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = statisticalBarRenderer10.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer10.setBaseCreateEntities(true, false);
        java.awt.Font font17 = null;
        statisticalBarRenderer10.setSeriesItemLabelFont((int) '4', font17);
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseStroke(stroke19);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer10.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer10.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = statisticalBarRenderer25.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer25.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32, false);
        int int35 = statisticalBarRenderer31.getColumnCount();
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setErrorIndicatorPaint(paint36);
        statisticalBarRenderer25.setBaseItemLabelPaint(paint36);
        statisticalBarRenderer10.setSeriesFillPaint((int) (byte) 10, paint36, true);
        statisticalBarRenderer0.setSeriesOutlinePaint(1, paint36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43, false);
        int int46 = statisticalBarRenderer42.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke49 = statisticalBarRenderer47.getSeriesOutlineStroke((int) (byte) 10);
        int int50 = statisticalBarRenderer47.getPassCount();
        double double51 = statisticalBarRenderer47.getUpperClip();
        double double52 = statisticalBarRenderer47.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer54.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer54.setBaseFillPaint(paint57);
        statisticalBarRenderer47.setSeriesPaint(1, paint57);
        statisticalBarRenderer42.setBaseFillPaint(paint57, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator62 = statisticalBarRenderer42.getBaseToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer64 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke66 = statisticalBarRenderer64.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer64.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer70 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator71 = null;
        statisticalBarRenderer70.setBaseURLGenerator(categoryURLGenerator71, false);
        int int74 = statisticalBarRenderer70.getColumnCount();
        java.awt.Paint paint75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer70.setErrorIndicatorPaint(paint75);
        statisticalBarRenderer64.setBaseItemLabelPaint(paint75);
        statisticalBarRenderer42.setSeriesItemLabelPaint((int) (short) 0, paint75, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition82 = statisticalBarRenderer42.getPositiveItemLabelPosition((int) (byte) -1, (int) (byte) 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition82);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(stroke49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.2d + "'", double52 == 0.2d);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(categoryToolTipGenerator62);
        org.junit.Assert.assertNull(stroke66);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNotNull(itemLabelPosition82);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        java.awt.Paint paint30 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer0.getPlot();
        boolean boolean32 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) 'a');
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener47 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true, true);
        double double14 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer15.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator19, false);
        java.awt.Stroke stroke22 = null;
        statisticalBarRenderer15.setErrorIndicatorStroke(stroke22);
        boolean boolean24 = statisticalBarRenderer15.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer15.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint28 = statisticalBarRenderer15.lookupSeriesPaint(0);
        boolean boolean31 = statisticalBarRenderer15.getItemVisible((int) 'a', (int) (byte) 10);
        java.awt.Paint paint32 = statisticalBarRenderer15.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint32);
        boolean boolean34 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer14.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer14.setDrawBarOutline(false);
        statisticalBarRenderer14.removeAnnotations();
        java.awt.Stroke stroke21 = statisticalBarRenderer14.lookupSeriesStroke((int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer14.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition23);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        java.lang.Boolean boolean13 = statisticalBarRenderer0.getSeriesVisible((int) '4');
        boolean boolean14 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        boolean boolean22 = statisticalBarRenderer15.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer15.getBaseToolTipGenerator();
        boolean boolean24 = statisticalBarRenderer15.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean26 = statisticalBarRenderer15.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint27 = statisticalBarRenderer15.getBasePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = statisticalBarRenderer15.getSeriesItemLabelGenerator(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer30.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer30.setBaseFillPaint(paint33);
        boolean boolean35 = statisticalBarRenderer30.getAutoPopulateSeriesStroke();
        java.awt.Paint paint37 = statisticalBarRenderer30.lookupSeriesOutlinePaint(0);
        java.awt.Paint paint39 = statisticalBarRenderer30.lookupSeriesFillPaint((int) (byte) 100);
        java.awt.Stroke stroke42 = statisticalBarRenderer30.getItemStroke((int) (short) 100, (int) (short) 0);
        java.awt.Font font45 = statisticalBarRenderer30.getItemLabelFont((int) '4', (int) (byte) 10);
        statisticalBarRenderer15.setBaseItemLabelFont(font45, false);
        statisticalBarRenderer0.setBaseItemLabelFont(font45, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(font45);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator9);
        double double11 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        boolean boolean13 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation12);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator15, true);
        java.awt.Shape shape19 = statisticalBarRenderer0.getSeriesShape(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        int int24 = statisticalBarRenderer20.getColumnCount();
        java.awt.Paint paint25 = statisticalBarRenderer20.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem28 = statisticalBarRenderer20.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer20.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer32.setItemLabelAnchorOffset((-1.0d));
        double double35 = statisticalBarRenderer32.getBase();
        java.awt.Paint paint36 = statisticalBarRenderer32.getErrorIndicatorPaint();
        java.awt.Stroke stroke39 = statisticalBarRenderer32.getItemStroke((int) (short) -1, (int) (byte) 1);
        statisticalBarRenderer20.setSeriesStroke((int) (short) 100, stroke39, true);
        java.awt.Shape shape44 = statisticalBarRenderer20.getItemShape((int) (short) 100, 1);
        statisticalBarRenderer0.setBaseShape(shape44);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(legendItem28);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator9);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = statisticalBarRenderer11.getSeriesOutlineStroke((int) (byte) 10);
        int int14 = statisticalBarRenderer11.getPassCount();
        double double15 = statisticalBarRenderer11.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition(1);
        java.awt.Shape shape19 = statisticalBarRenderer11.lookupSeriesShape((int) (short) 0);
        statisticalBarRenderer0.setBaseShape(shape19);
        boolean boolean23 = statisticalBarRenderer0.isItemLabelVisible(0, (int) (byte) 10);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.lookupSeriesOutlineStroke(1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator17);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(itemLabelPosition16);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer12.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator16, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = statisticalBarRenderer12.getBaseToolTipGenerator();
        java.awt.Paint paint20 = statisticalBarRenderer12.getBaseOutlinePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint20);
        java.awt.Font font24 = statisticalBarRenderer0.getItemLabelFont(100, (int) '#');
        int int25 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        int int9 = statisticalBarRenderer6.getPassCount();
        statisticalBarRenderer6.setMinimumBarLength(10.0d);
        java.lang.Boolean boolean13 = statisticalBarRenderer6.getSeriesVisible((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer6.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer14);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        double double21 = statisticalBarRenderer0.getBase();
        java.awt.Shape shape23 = statisticalBarRenderer0.lookupSeriesShape(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator12, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(itemLabelPosition16);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Paint paint11 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        boolean boolean12 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState18 = statisticalBarRenderer0.initialise(graphics2D13, rectangle2D14, categoryPlot15, (-1), plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        boolean boolean28 = statisticalBarRenderer0.isSeriesVisible((int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator29, false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) true, true);
        java.awt.Paint paint36 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        boolean boolean14 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Font font18 = statisticalBarRenderer0.getItemLabelFont(100, 100);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) true, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        java.awt.Font font19 = null;
        statisticalBarRenderer12.setSeriesItemLabelFont((int) '4', font19);
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseStroke(stroke21);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer12.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer12.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = statisticalBarRenderer27.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer27.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer33.setBaseURLGenerator(categoryURLGenerator34, false);
        int int37 = statisticalBarRenderer33.getColumnCount();
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setErrorIndicatorPaint(paint38);
        statisticalBarRenderer27.setBaseItemLabelPaint(paint38);
        statisticalBarRenderer12.setSeriesFillPaint((int) (byte) 10, paint38, true);
        statisticalBarRenderer0.setBaseOutlinePaint(paint38);
        boolean boolean44 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator9, true);
        boolean boolean12 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) false, true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer17 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean19 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gradientPaintTransformer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.removeAnnotations();
        java.lang.Object obj10 = statisticalBarRenderer0.clone();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer13.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20, false);
        int int23 = statisticalBarRenderer19.getColumnCount();
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer19.setErrorIndicatorPaint(paint24);
        statisticalBarRenderer13.setBaseItemLabelPaint(paint24);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer13.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint29 = statisticalBarRenderer13.getSeriesPaint((int) 'a');
        java.lang.Boolean boolean31 = statisticalBarRenderer13.getSeriesItemLabelsVisible((int) ' ');
        statisticalBarRenderer13.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true, true);
        java.awt.Paint paint36 = statisticalBarRenderer13.getBaseFillPaint();
        java.awt.Stroke stroke37 = statisticalBarRenderer13.getBaseStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke37, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(itemLabelPosition27);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        int int11 = statisticalBarRenderer6.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer12.hasListener(eventListener15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        int int20 = statisticalBarRenderer17.getPassCount();
        java.awt.Font font22 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer17.getBasePositiveItemLabelPosition();
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition23);
        statisticalBarRenderer6.setBaseNegativeItemLabelPosition(itemLabelPosition23, false);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation33 = null;
        boolean boolean34 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(itemLabelPosition28);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getSeriesStroke((int) (short) 0);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible(1);
        double double11 = statisticalBarRenderer0.getItemMargin();
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((int) (byte) 1, (-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer16.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer16.setDrawBarOutline(false);
        statisticalBarRenderer16.removeAnnotations();
        boolean boolean22 = statisticalBarRenderer16.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer16.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = statisticalBarRenderer16.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        statisticalBarRenderer16.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator28, false);
        java.awt.Paint paint33 = statisticalBarRenderer16.getItemLabelPaint(1, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke36 = statisticalBarRenderer34.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer34.setBaseCreateEntities(true, false);
        java.awt.Font font41 = null;
        statisticalBarRenderer34.setSeriesItemLabelFont((int) '4', font41);
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer34.setBaseStroke(stroke43);
        statisticalBarRenderer16.setBaseStroke(stroke43);
        statisticalBarRenderer0.setSeriesOutlineStroke(10, stroke43, false);
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.plot.Marker marker51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D48, categoryPlot49, valueAxis50, marker51, rectangle2D52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryURLGenerator26);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke3 = statisticalBarRenderer1.getSeriesOutlineStroke((int) (byte) 10);
        int int4 = statisticalBarRenderer1.getPassCount();
        double double5 = statisticalBarRenderer1.getUpperClip();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer1.setSeriesPaint(100, paint7);
        statisticalBarRenderer0.setBasePaint(paint7);
        boolean boolean10 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.Marker marker14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D11, categoryPlot12, valueAxis13, marker14, rectangle2D15);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(stroke3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 0, (java.lang.Boolean) true);
        java.awt.Paint paint17 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont(0, 0);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (short) -1);
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.plot.Marker marker26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D23, categoryPlot24, valueAxis25, marker26, rectangle2D27);
        double double29 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer30.setBaseToolTipGenerator(categoryToolTipGenerator31);
        boolean boolean35 = statisticalBarRenderer30.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        statisticalBarRenderer30.setBaseItemLabelGenerator(categoryItemLabelGenerator36, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        int int44 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint45 = statisticalBarRenderer39.getErrorIndicatorPaint();
        statisticalBarRenderer30.setBaseFillPaint(paint45, false);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer48 = statisticalBarRenderer30.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer48);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(gradientPaintTransformer48);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (-1L));
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Shape shape6 = null;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 100, shape6, true);
        boolean boolean9 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setItemMargin((double) (-1.0f));
        org.jfree.chart.LegendItemCollection legendItemCollection12 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        double double4 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        double double6 = statisticalBarRenderer0.getBase();
        statisticalBarRenderer0.setMaximumBarWidth((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem8 = statisticalBarRenderer0.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        double double15 = statisticalBarRenderer12.getBase();
        java.awt.Paint paint16 = statisticalBarRenderer12.getErrorIndicatorPaint();
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getItemStroke((int) (short) -1, (int) (byte) 1);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke19, true);
        double double22 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(legendItem8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        int int25 = statisticalBarRenderer21.getColumnCount();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint26);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint26, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Stroke stroke34 = statisticalBarRenderer0.getErrorIndicatorStroke();
        statisticalBarRenderer0.setBase((double) (short) 0);
        boolean boolean37 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator38);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) false);
        java.awt.Shape shape16 = statisticalBarRenderer0.getSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 1);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint7 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint7);
        org.jfree.chart.LegendItem legendItem11 = statisticalBarRenderer0.getLegendItem((int) (byte) -1, (int) (byte) 1);
        boolean boolean12 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        boolean boolean15 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 100, (int) '#');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) -1, categoryURLGenerator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 100);
        java.lang.Boolean boolean32 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 100);
        boolean boolean34 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getURLGenerator(1, (int) (short) 0);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) false);
        double double11 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean14 = statisticalBarRenderer0.getItemCreateEntity(100, (int) '4');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '#', true);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = statisticalBarRenderer0.findRangeBounds(categoryDataset18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setMaximumBarWidth((double) (-1L));
        double double8 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Stroke stroke10 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 1, stroke10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D12, categoryPlot13, valueAxis14, rectangle2D15, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getSeriesStroke((int) (short) 0);
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 100);
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 0);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        int int11 = statisticalBarRenderer6.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer12.hasListener(eventListener15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        int int20 = statisticalBarRenderer17.getPassCount();
        java.awt.Font font22 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer17.getBasePositiveItemLabelPosition();
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition23);
        statisticalBarRenderer6.setBaseNegativeItemLabelPosition(itemLabelPosition23, false);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition23);
        boolean boolean28 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        java.lang.Boolean boolean32 = statisticalBarRenderer0.getSeriesVisibleInLegend(10);
        java.awt.Paint paint33 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke40 = statisticalBarRenderer38.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer38.setBaseCreateEntities(true, false);
        java.awt.Font font45 = null;
        statisticalBarRenderer38.setSeriesItemLabelFont((int) '4', font45);
        java.awt.Stroke stroke47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer38.setBaseStroke(stroke47);
        statisticalBarRenderer38.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = null;
        statisticalBarRenderer38.setSeriesToolTipGenerator(100, categoryToolTipGenerator53);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer55.setItemLabelAnchorOffset((-1.0d));
        double double58 = statisticalBarRenderer55.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer55.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke61 = statisticalBarRenderer55.lookupSeriesStroke((int) 'a');
        statisticalBarRenderer38.setErrorIndicatorStroke(stroke61);
        java.awt.Stroke stroke64 = statisticalBarRenderer38.lookupSeriesOutlineStroke((int) (byte) 1);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 0, stroke64, true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(stroke40);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) ' ', (int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent23 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 100);
        java.awt.Shape shape30 = statisticalBarRenderer0.getSeriesShape(0);
        statisticalBarRenderer0.setMinimumBarLength(1.0d);
        java.awt.Stroke stroke33 = statisticalBarRenderer0.getErrorIndicatorStroke();
        statisticalBarRenderer0.setSeriesCreateEntities((int) '4', (java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Shape shape6 = null;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 100, shape6, true);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator11, true);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) true, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = statisticalBarRenderer16.getSeriesOutlineStroke((int) (byte) 10);
        int int19 = statisticalBarRenderer16.getPassCount();
        double double20 = statisticalBarRenderer16.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer16.getSeriesPositiveItemLabelPosition(1);
        double double23 = statisticalBarRenderer16.getUpperClip();
        statisticalBarRenderer16.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer16.getPositiveItemLabelPosition((int) (byte) 10, (int) '4');
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(10, itemLabelPosition28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = statisticalBarRenderer31.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer31.setBaseCreateEntities(true, false);
        java.awt.Paint paint38 = null;
        statisticalBarRenderer31.setSeriesOutlinePaint((int) '4', paint38);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = statisticalBarRenderer31.getBaseToolTipGenerator();
        java.awt.Font font43 = statisticalBarRenderer31.getItemLabelFont((int) (short) 100, (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) 'a', font43);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        statisticalBarRenderer0.setMinimumBarLength(10.0d);
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisible((int) 'a');
        int int8 = statisticalBarRenderer0.getPassCount();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawOutline(graphics2D9, categoryPlot10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesPaint((-1));
        statisticalBarRenderer0.setBaseSeriesVisible(false, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(drawingSupplier20);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setMaximumBarWidth(3.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14, false);
        int int17 = statisticalBarRenderer13.getColumnCount();
        int int18 = statisticalBarRenderer13.getColumnCount();
        java.awt.Paint paint19 = statisticalBarRenderer13.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = statisticalBarRenderer20.hasListener(eventListener26);
        java.awt.Shape shape30 = statisticalBarRenderer20.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer13.setBaseShape(shape30, true);
        statisticalBarRenderer0.setBaseShape(shape30);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer6.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer15 = statisticalBarRenderer6.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke18);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.awt.Paint paint23 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(gradientPaintTransformer15);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean1 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer10.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        statisticalBarRenderer10.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator16, true);
        statisticalBarRenderer10.setSeriesItemLabelsVisible(0, true);
        java.lang.Object obj22 = statisticalBarRenderer10.clone();
        java.awt.Shape shape23 = statisticalBarRenderer10.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape23, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        double double7 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        boolean boolean15 = statisticalBarRenderer8.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape17 = statisticalBarRenderer8.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean19 = statisticalBarRenderer8.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        int int24 = statisticalBarRenderer20.getColumnCount();
        java.awt.Paint paint25 = statisticalBarRenderer20.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem28 = statisticalBarRenderer20.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer20.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator31);
        java.lang.Boolean boolean35 = statisticalBarRenderer0.getSeriesCreateEntities((int) ' ');
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(legendItem28);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNull(boolean35);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.lookupSeriesStroke((int) 'a');
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        boolean boolean15 = statisticalBarRenderer8.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = statisticalBarRenderer8.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer8.getSeriesItemLabelGenerator((int) (byte) 100);
        java.awt.Paint paint19 = statisticalBarRenderer8.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint19, true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6, false);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Shape shape15 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 100);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseFillPaint(paint12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getURLGenerator(1, (int) (short) 0);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) false);
        double double11 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean14 = statisticalBarRenderer0.getItemCreateEntity(100, (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        statisticalBarRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator16);
        boolean boolean20 = statisticalBarRenderer15.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer15.setBaseItemLabelGenerator(categoryItemLabelGenerator21, false);
        java.awt.Stroke stroke24 = statisticalBarRenderer15.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = statisticalBarRenderer15.removeAnnotation(categoryAnnotation25);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer15.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator29);
        java.awt.Paint paint32 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (byte) 1);
        java.awt.Stroke stroke33 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Paint paint11 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        double double12 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15, false);
        int int18 = statisticalBarRenderer14.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer19.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer19.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer14.setBasePositiveItemLabelPosition(itemLabelPosition25, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer29.setBaseFillPaint(paint32);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke36 = statisticalBarRenderer34.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer34.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font39 = statisticalBarRenderer34.getBaseItemLabelFont();
        statisticalBarRenderer29.setBaseItemLabelFont(font39);
        statisticalBarRenderer14.setSeriesItemLabelFont((int) '#', font39, false);
        java.awt.Paint paint44 = statisticalBarRenderer14.getSeriesFillPaint((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = statisticalBarRenderer14.getPlot();
        statisticalBarRenderer14.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        statisticalBarRenderer49.setBaseURLGenerator(categoryURLGenerator50, false);
        int int53 = statisticalBarRenderer49.getColumnCount();
        java.awt.Paint paint54 = statisticalBarRenderer49.getBaseFillPaint();
        java.awt.Paint paint57 = statisticalBarRenderer49.getItemLabelPaint((int) '#', (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke60 = statisticalBarRenderer58.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer58.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer64 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator65 = null;
        statisticalBarRenderer64.setBaseURLGenerator(categoryURLGenerator65, false);
        int int68 = statisticalBarRenderer64.getColumnCount();
        java.awt.Paint paint69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer64.setErrorIndicatorPaint(paint69);
        statisticalBarRenderer58.setBaseItemLabelPaint(paint69);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke74 = statisticalBarRenderer72.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke76 = statisticalBarRenderer72.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer58.setBaseStroke(stroke76, false);
        statisticalBarRenderer49.setBaseStroke(stroke76, true);
        java.awt.Stroke stroke81 = statisticalBarRenderer49.getBaseOutlineStroke();
        statisticalBarRenderer14.setSeriesOutlineStroke((int) (byte) 0, stroke81);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesOutlineStroke((-1), stroke81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNull(paint44);
        org.junit.Assert.assertNull(categoryPlot45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(stroke60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(stroke74);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertNotNull(stroke81);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        java.awt.Paint paint9 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator10, true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        boolean boolean15 = statisticalBarRenderer8.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape17 = statisticalBarRenderer8.lookupSeriesShape((int) (short) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape17);
        java.awt.Paint paint20 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 100);
        boolean boolean22 = statisticalBarRenderer0.isSeriesItemLabelsVisible(10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '#', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        int int31 = statisticalBarRenderer27.getColumnCount();
        int int32 = statisticalBarRenderer27.getColumnCount();
        java.awt.Paint paint33 = statisticalBarRenderer27.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke36 = statisticalBarRenderer34.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer34.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = statisticalBarRenderer34.hasListener(eventListener40);
        java.awt.Shape shape44 = statisticalBarRenderer34.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer27.setBaseShape(shape44, true);
        statisticalBarRenderer0.setBaseShape(shape44, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, (int) (short) 0);
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        double double7 = statisticalBarRenderer0.getMaximumBarWidth();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) (byte) 1, 1);
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer8.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke15);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 10);
        int int22 = statisticalBarRenderer19.getPassCount();
        double double23 = statisticalBarRenderer19.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer19.getSeriesPositiveItemLabelPosition(1);
        boolean boolean28 = statisticalBarRenderer19.isItemLabelVisible((int) (byte) 1, (-1));
        java.awt.Font font29 = statisticalBarRenderer19.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont(0, font29);
        statisticalBarRenderer0.setMinimumBarLength((double) (short) 0);
        java.awt.Paint paint34 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 100);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setBaseCreateEntities(false);
        statisticalBarRenderer14.setBaseSeriesVisible(true, true);
        statisticalBarRenderer14.setAutoPopulateSeriesOutlineStroke(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        statisticalBarRenderer14.setBaseItemLabelGenerator(categoryItemLabelGenerator24, false);
        boolean boolean27 = statisticalBarRenderer14.getBaseItemLabelsVisible();
        java.awt.Paint paint30 = statisticalBarRenderer14.getItemPaint((int) (short) 100, 100);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint30);
        java.awt.Stroke stroke32 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 0, (int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.awt.Font font19 = statisticalBarRenderer0.getItemLabelFont((int) (short) 0, 10);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D20, categoryPlot21, categoryAxis22, categoryMarker23, rectangle2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15, false);
        int int18 = statisticalBarRenderer14.getColumnCount();
        java.awt.Paint paint19 = statisticalBarRenderer14.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint19, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((-1));
        java.awt.Shape shape26 = statisticalBarRenderer0.getItemShape((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator9, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        int int16 = statisticalBarRenderer13.getPassCount();
        double double17 = statisticalBarRenderer13.getUpperClip();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setSeriesPaint(100, paint19);
        statisticalBarRenderer12.setBasePaint(paint19);
        statisticalBarRenderer0.setBasePaint(paint19);
        boolean boolean23 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Font font25 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 10);
        java.awt.Paint paint27 = statisticalBarRenderer0.getSeriesItemLabelPaint(100);
        int int28 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(font25);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint21 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean22 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Paint paint24 = statisticalBarRenderer0.lookupSeriesOutlinePaint(10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator26, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        java.awt.Paint paint24 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 10);
        boolean boolean25 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(100, categoryURLGenerator27, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator31, false);
        double double34 = statisticalBarRenderer0.getMaximumBarWidth();
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        int int27 = statisticalBarRenderer24.getPassCount();
        double double28 = statisticalBarRenderer24.getUpperClip();
        double double29 = statisticalBarRenderer24.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke35 = statisticalBarRenderer33.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer33.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint44);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation47 = null;
        boolean boolean48 = statisticalBarRenderer33.removeAnnotation(categoryAnnotation47);
        java.awt.Paint paint49 = statisticalBarRenderer33.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint49, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator52);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = statisticalBarRenderer0.getSeriesURLGenerator((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator59 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator59);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator65 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) -1);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(stroke35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryURLGenerator55);
        org.junit.Assert.assertNull(categoryItemLabelGenerator58);
        org.junit.Assert.assertNotNull(itemLabelPosition61);
        org.junit.Assert.assertNull(categoryToolTipGenerator65);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        double double27 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = statisticalBarRenderer9.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke13 = statisticalBarRenderer9.lookupSeriesOutlineStroke((int) (short) 1);
        boolean boolean14 = statisticalBarRenderer0.equals((java.lang.Object) (short) 1);
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesVisible(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer17.setBaseCreateEntities(true, false);
        java.awt.Paint paint24 = null;
        statisticalBarRenderer17.setSeriesOutlinePaint((int) '4', paint24);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = statisticalBarRenderer17.getBaseToolTipGenerator();
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = statisticalBarRenderer30.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke34 = statisticalBarRenderer30.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer17.setSeriesStroke((int) (byte) 0, stroke34);
        statisticalBarRenderer17.setItemLabelAnchorOffset((double) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = statisticalBarRenderer17.getSeriesToolTipGenerator((int) ' ');
        statisticalBarRenderer17.setAutoPopulateSeriesStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer42.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = null;
        statisticalBarRenderer42.setLegendItemToolTipGenerator(categorySeriesLabelGenerator45);
        java.awt.Graphics2D graphics2D47 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.plot.Marker marker50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        statisticalBarRenderer42.drawRangeMarker(graphics2D47, categoryPlot48, valueAxis49, marker50, rectangle2D51);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = null;
        statisticalBarRenderer42.setBaseToolTipGenerator(categoryToolTipGenerator53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer42.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer42.setAutoPopulateSeriesOutlineStroke(false);
        boolean boolean58 = statisticalBarRenderer42.getAutoPopulateSeriesStroke();
        int int59 = statisticalBarRenderer42.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke62 = statisticalBarRenderer60.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer60.setAutoPopulateSeriesOutlinePaint(false);
        int int65 = statisticalBarRenderer60.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer66.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener69 = null;
        boolean boolean70 = statisticalBarRenderer66.hasListener(eventListener69);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer71 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke73 = statisticalBarRenderer71.getSeriesOutlineStroke((int) (byte) 10);
        int int74 = statisticalBarRenderer71.getPassCount();
        java.awt.Font font76 = statisticalBarRenderer71.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = statisticalBarRenderer71.getBasePositiveItemLabelPosition();
        statisticalBarRenderer66.setNegativeItemLabelPositionFallback(itemLabelPosition77);
        statisticalBarRenderer60.setBaseNegativeItemLabelPosition(itemLabelPosition77, false);
        java.awt.Paint paint83 = statisticalBarRenderer60.getItemOutlinePaint(0, (-1));
        statisticalBarRenderer42.setBasePaint(paint83, true);
        statisticalBarRenderer17.setBaseOutlinePaint(paint83, true);
        java.awt.Stroke stroke88 = statisticalBarRenderer17.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke88);
        java.awt.Paint paint91 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(categoryToolTipGenerator26);
        org.junit.Assert.assertNull(stroke32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNull(categoryToolTipGenerator39);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(stroke62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(stroke73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNull(font76);
        org.junit.Assert.assertNotNull(itemLabelPosition77);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(stroke88);
        org.junit.Assert.assertNull(paint91);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint3);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesOutlinePaint(0);
        boolean boolean9 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        double double10 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape((int) (short) 10, (int) (byte) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11, false);
        java.awt.Shape shape15 = statisticalBarRenderer0.getSeriesShape((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) true);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer14.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer14.getLegendItemToolTipGenerator();
        boolean boolean18 = statisticalBarRenderer14.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint21 = statisticalBarRenderer14.getItemOutlinePaint(10, 0);
        java.awt.Paint paint24 = statisticalBarRenderer14.getItemFillPaint((int) '#', (int) '4');
        statisticalBarRenderer0.setBasePaint(paint24, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer0.getLegendItemURLGenerator();
        boolean boolean8 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Shape shape10 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = statisticalBarRenderer11.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer11.setBaseCreateEntities(true, false);
        java.awt.Font font18 = null;
        statisticalBarRenderer11.setSeriesItemLabelFont((int) '4', font18);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseStroke(stroke20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer11.getBasePositiveItemLabelPosition();
        statisticalBarRenderer11.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer27.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer27.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer27.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator33, true);
        statisticalBarRenderer27.removeAnnotations();
        java.awt.Paint paint37 = statisticalBarRenderer27.getErrorIndicatorPaint();
        statisticalBarRenderer11.setErrorIndicatorPaint(paint37);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint37, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer13.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) '#', (int) (byte) -1);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition20);
        int int22 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean6 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getSeriesURLGenerator(100);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryURLGenerator10);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke28 = statisticalBarRenderer23.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke28);
        java.awt.Paint paint32 = statisticalBarRenderer0.getItemOutlinePaint(100, (-1));
        java.awt.Stroke stroke33 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint34 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        int int17 = statisticalBarRenderer14.getPassCount();
        boolean boolean18 = statisticalBarRenderer14.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer14.setBaseSeriesVisible(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = statisticalBarRenderer22.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer22.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29, false);
        int int32 = statisticalBarRenderer28.getColumnCount();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer28.setErrorIndicatorPaint(paint33);
        statisticalBarRenderer22.setBaseItemLabelPaint(paint33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = statisticalBarRenderer36.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke40 = statisticalBarRenderer36.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer22.setBaseStroke(stroke40, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer43.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener46 = null;
        boolean boolean47 = statisticalBarRenderer43.hasListener(eventListener46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke50 = statisticalBarRenderer48.getSeriesOutlineStroke((int) (byte) 10);
        int int51 = statisticalBarRenderer48.getPassCount();
        java.awt.Font font53 = statisticalBarRenderer48.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer48.getBasePositiveItemLabelPosition();
        statisticalBarRenderer43.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer22.setPositiveItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer14.setBaseNegativeItemLabelPosition(itemLabelPosition54);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition54);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer0.setMinimumBarLength((double) 100.0f);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(stroke50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(font53);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = statisticalBarRenderer21.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer21.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke26 = statisticalBarRenderer21.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer21.setBaseItemLabelGenerator(categoryItemLabelGenerator27);
        java.awt.Stroke stroke31 = statisticalBarRenderer21.getItemStroke((int) (byte) -1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = statisticalBarRenderer32.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(false);
        int int37 = statisticalBarRenderer32.getRowCount();
        java.awt.Shape shape38 = statisticalBarRenderer32.getBaseShape();
        statisticalBarRenderer21.setBaseShape(shape38);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = statisticalBarRenderer41.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer41.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        statisticalBarRenderer47.setBaseURLGenerator(categoryURLGenerator48, false);
        int int51 = statisticalBarRenderer47.getColumnCount();
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer47.setErrorIndicatorPaint(paint52);
        statisticalBarRenderer41.setBaseItemLabelPaint(paint52);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke57 = statisticalBarRenderer55.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke59 = statisticalBarRenderer55.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer41.setBaseStroke(stroke59, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer62 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer62.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener65 = null;
        boolean boolean66 = statisticalBarRenderer62.hasListener(eventListener65);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke69 = statisticalBarRenderer67.getSeriesOutlineStroke((int) (byte) 10);
        int int70 = statisticalBarRenderer67.getPassCount();
        java.awt.Font font72 = statisticalBarRenderer67.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = statisticalBarRenderer67.getBasePositiveItemLabelPosition();
        statisticalBarRenderer62.setNegativeItemLabelPositionFallback(itemLabelPosition73);
        statisticalBarRenderer41.setPositiveItemLabelPositionFallback(itemLabelPosition73);
        statisticalBarRenderer21.setSeriesPositiveItemLabelPosition((int) '4', itemLabelPosition73);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition73);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator78 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(stroke34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNull(stroke43);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNull(stroke57);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(stroke69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNull(font72);
        org.junit.Assert.assertNotNull(itemLabelPosition73);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator78);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke3 = statisticalBarRenderer1.getSeriesOutlineStroke((int) (byte) 10);
        int int4 = statisticalBarRenderer1.getPassCount();
        double double5 = statisticalBarRenderer1.getUpperClip();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer1.setSeriesPaint(100, paint7);
        statisticalBarRenderer0.setBasePaint(paint7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke12 = statisticalBarRenderer0.lookupSeriesStroke(10);
        java.lang.Boolean boolean14 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 10);
        boolean boolean15 = statisticalBarRenderer0.getBaseSeriesVisible();
        boolean boolean17 = statisticalBarRenderer0.isSeriesItemLabelsVisible(1);
        org.junit.Assert.assertNull(stroke3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer6.setItemLabelAnchorOffset((-1.0d));
        double double9 = statisticalBarRenderer6.getBase();
        java.awt.Paint paint10 = statisticalBarRenderer6.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 0, paint10, true);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, false);
        boolean boolean19 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke24 = statisticalBarRenderer20.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke24, true);
        double double27 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Font font29 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 100, font29, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (byte) 1);
        java.awt.Paint paint34 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        java.awt.Font font10 = statisticalBarRenderer5.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = null;
        statisticalBarRenderer13.setBaseToolTipGenerator(categoryToolTipGenerator14);
        boolean boolean18 = statisticalBarRenderer13.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer19.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = statisticalBarRenderer19.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer28 = statisticalBarRenderer19.getGradientPaintTransformer();
        statisticalBarRenderer13.setGradientPaintTransformer(gradientPaintTransformer28);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer13.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer33.setBaseURLGenerator(categoryURLGenerator34, false);
        int int37 = statisticalBarRenderer33.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke40 = statisticalBarRenderer38.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer38.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer38.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer33.setBasePositiveItemLabelPosition(itemLabelPosition44, true);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(gradientPaintTransformer28);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(stroke40);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint7 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke17 = statisticalBarRenderer13.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 0, stroke17);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) '#');
        java.awt.Shape shape22 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator23, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 100, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint9 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 1);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        java.lang.Boolean boolean14 = statisticalBarRenderer0.getSeriesVisible(10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer18.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = statisticalBarRenderer18.hasListener(eventListener21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        int int26 = statisticalBarRenderer23.getPassCount();
        java.awt.Font font28 = statisticalBarRenderer23.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer23.getBasePositiveItemLabelPosition();
        statisticalBarRenderer18.setNegativeItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) ' ', itemLabelPosition29);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesItemLabelPaint(0);
        java.awt.Paint paint34 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(font28);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) -1);
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.plot.Marker marker9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D6, categoryPlot7, valueAxis8, marker9, rectangle2D10);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(paint5);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemOutlinePaint((-1), (int) (short) 0);
        boolean boolean10 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D11, categoryPlot12, categoryAxis13, categoryMarker14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        boolean boolean15 = statisticalBarRenderer8.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape17 = statisticalBarRenderer8.lookupSeriesShape((int) (short) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape17);
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer21.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer21.setDrawBarOutline(false);
        statisticalBarRenderer21.removeAnnotations();
        boolean boolean27 = statisticalBarRenderer21.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer21.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = statisticalBarRenderer21.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer21.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator33, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer21.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator36);
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryURLGenerator31);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator36);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = statisticalBarRenderer0.getURLGenerator(10, 100);
        boolean boolean10 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Font font12 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 100);
        int int13 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categoryURLGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.removeAnnotations();
        java.lang.Object obj10 = statisticalBarRenderer0.clone();
        boolean boolean13 = statisticalBarRenderer0.getItemVisible((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true);
        java.awt.Stroke stroke12 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        boolean boolean5 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer10 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(gradientPaintTransformer10);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        int int25 = statisticalBarRenderer21.getColumnCount();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint26);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint26, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Stroke stroke34 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator36);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = null;
        statisticalBarRenderer43.setBaseToolTipGenerator(categoryToolTipGenerator44);
        boolean boolean48 = statisticalBarRenderer43.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer43.setBaseItemLabelGenerator(categoryItemLabelGenerator49, false);
        statisticalBarRenderer43.setDrawBarOutline(true);
        java.awt.Paint paint56 = statisticalBarRenderer43.getItemOutlinePaint((int) (short) 100, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 10, paint56);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator13);
        boolean boolean15 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint5);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer10.setBaseToolTipGenerator(categoryToolTipGenerator11);
        boolean boolean13 = statisticalBarRenderer10.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer14.getPositiveItemLabelPositionFallback();
        java.awt.Shape shape22 = statisticalBarRenderer14.getItemShape((int) 'a', (int) (byte) -1);
        java.lang.Boolean boolean24 = statisticalBarRenderer14.getSeriesItemLabelsVisible((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = statisticalBarRenderer25.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font30 = statisticalBarRenderer25.getBaseItemLabelFont();
        statisticalBarRenderer14.setBaseItemLabelFont(font30, true);
        statisticalBarRenderer10.setBaseItemLabelFont(font30, true);
        statisticalBarRenderer0.setBaseItemLabelFont(font30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        statisticalBarRenderer36.setBaseURLGenerator(categoryURLGenerator37, false);
        int int40 = statisticalBarRenderer36.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = statisticalBarRenderer41.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer41.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer41.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer36.setBasePositiveItemLabelPosition(itemLabelPosition47, true);
        statisticalBarRenderer36.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, false);
        boolean boolean55 = statisticalBarRenderer36.isSeriesItemLabelsVisible((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke58 = statisticalBarRenderer56.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke60 = statisticalBarRenderer56.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer36.setBaseOutlineStroke(stroke60, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer64 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke66 = statisticalBarRenderer64.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer64.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font69 = statisticalBarRenderer64.getBaseItemLabelFont();
        int int70 = statisticalBarRenderer64.getRowCount();
        java.awt.Paint paint71 = statisticalBarRenderer64.getBaseItemLabelPaint();
        statisticalBarRenderer36.setSeriesItemLabelPaint((int) (short) 100, paint71);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer73 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke75 = statisticalBarRenderer73.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer73.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Stroke stroke78 = statisticalBarRenderer73.getErrorIndicatorStroke();
        statisticalBarRenderer36.setBaseStroke(stroke78);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke78);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(stroke43);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(stroke58);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNull(stroke66);
        org.junit.Assert.assertNotNull(font69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNull(stroke75);
        org.junit.Assert.assertNotNull(stroke78);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Paint paint16 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 1, (int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = statisticalBarRenderer0.getURLGenerator((int) 'a', (int) (byte) 0);
        boolean boolean21 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1.0f);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryURLGenerator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint7 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16, false);
        int int19 = statisticalBarRenderer15.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        int int23 = statisticalBarRenderer20.getPassCount();
        double double24 = statisticalBarRenderer20.getUpperClip();
        double double25 = statisticalBarRenderer20.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer27.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer27.setBaseFillPaint(paint30);
        statisticalBarRenderer20.setSeriesPaint(1, paint30);
        statisticalBarRenderer15.setBaseFillPaint(paint30, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer15.getNegativeItemLabelPosition((int) ' ', (int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent38 = null;
        statisticalBarRenderer15.notifyListeners(rendererChangeEvent38);
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        java.awt.Stroke stroke42 = statisticalBarRenderer15.getBaseOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesOutlineStroke((-1), stroke42, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(gradientPaintTransformer13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean8 = statisticalBarRenderer0.getItemVisible((int) (byte) 0, 1);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(100);
        java.awt.Paint paint17 = statisticalBarRenderer0.getItemLabelPaint((int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.LegendItem legendItem7 = statisticalBarRenderer0.getLegendItem(0, (int) '#');
        java.awt.Font font10 = statisticalBarRenderer0.getItemLabelFont((int) 'a', (int) (byte) -1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(legendItem7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Paint paint27 = statisticalBarRenderer0.getItemFillPaint(1, 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        boolean boolean20 = statisticalBarRenderer15.getAutoPopulateSeriesStroke();
        java.awt.Paint paint22 = statisticalBarRenderer15.lookupSeriesOutlinePaint(0);
        java.awt.Paint paint24 = statisticalBarRenderer15.lookupSeriesFillPaint((int) (byte) 100);
        java.awt.Stroke stroke27 = statisticalBarRenderer15.getItemStroke((int) (short) 100, (int) (short) 0);
        java.awt.Font font30 = statisticalBarRenderer15.getItemLabelFont((int) '4', (int) (byte) 10);
        statisticalBarRenderer0.setBaseItemLabelFont(font30, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint21 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setMaximumBarWidth(2.0d);
        boolean boolean29 = statisticalBarRenderer0.isItemLabelVisible(0, (int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) true, true);
        int int34 = statisticalBarRenderer0.getRowCount();
        java.awt.Stroke stroke35 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        boolean boolean8 = statisticalBarRenderer0.getItemCreateEntity(100, (int) 'a');
        boolean boolean10 = statisticalBarRenderer0.isSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        java.awt.Paint paint19 = statisticalBarRenderer12.getSeriesFillPaint((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer12.getNegativeItemLabelPosition((int) (byte) 10, 10);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '#', itemLabelPosition22, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator22, true);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        java.lang.Object obj12 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) ' ');
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        statisticalBarRenderer0.setMinimumBarLength((double) 0);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesPaint((-1));
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer0.getGradientPaintTransformer();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getItemStroke((int) (short) -1, (int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int10 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.awt.Font font11 = statisticalBarRenderer0.getSeriesItemLabelFont(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        double double15 = statisticalBarRenderer12.getBase();
        boolean boolean16 = statisticalBarRenderer12.getBaseItemLabelsVisible();
        java.awt.Stroke stroke17 = statisticalBarRenderer12.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer12.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator19, true);
        double double22 = statisticalBarRenderer12.getItemMargin();
        java.awt.Font font25 = statisticalBarRenderer12.getItemLabelFont((int) (byte) 10, (-1));
        statisticalBarRenderer0.setBaseItemLabelFont(font25);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true);
        java.awt.Stroke stroke12 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font19 = statisticalBarRenderer14.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont(1, font19);
        java.awt.Paint paint21 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setMaximumBarWidth(0.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        int int11 = statisticalBarRenderer7.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        int int15 = statisticalBarRenderer12.getPassCount();
        double double16 = statisticalBarRenderer12.getUpperClip();
        double double17 = statisticalBarRenderer12.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer19.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer19.setBaseFillPaint(paint22);
        statisticalBarRenderer12.setSeriesPaint(1, paint22);
        statisticalBarRenderer7.setBaseFillPaint(paint22, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer7.getNegativeItemLabelPosition((int) ' ', (int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent30 = null;
        statisticalBarRenderer7.notifyListeners(rendererChangeEvent30);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer7.getSeriesNegativeItemLabelPosition((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = statisticalBarRenderer7.getSeriesToolTipGenerator((int) (short) 100);
        java.awt.Shape shape37 = statisticalBarRenderer7.getSeriesShape(0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer7.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNull(categoryToolTipGenerator35);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator38);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 0);
        boolean boolean8 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(10, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesPaint(0);
        boolean boolean16 = statisticalBarRenderer0.getItemVisible((int) 'a', (int) (byte) 10);
        java.awt.Paint paint17 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 100);
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = statisticalBarRenderer8.hasListener(eventListener11);
        java.awt.Paint paint15 = statisticalBarRenderer8.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator18, true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint25 = statisticalBarRenderer24.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer26.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer26.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        statisticalBarRenderer26.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator32, true);
        statisticalBarRenderer26.removeAnnotations();
        java.awt.Paint paint36 = statisticalBarRenderer26.getErrorIndicatorPaint();
        statisticalBarRenderer24.setBasePaint(paint36, true);
        statisticalBarRenderer0.setSeriesFillPaint(10, paint36, false);
        java.awt.Stroke stroke41 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator12, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint21 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = statisticalBarRenderer0.getBaseToolTipGenerator();
        int int25 = statisticalBarRenderer0.getRowCount();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Stroke stroke28 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Paint paint7 = statisticalBarRenderer0.getBasePaint();
        java.lang.Object obj8 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        java.awt.Paint paint30 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 1);
        boolean boolean33 = statisticalBarRenderer0.getItemVisible((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = statisticalBarRenderer10.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer10.setBaseCreateEntities(true, false);
        java.awt.Paint paint17 = null;
        statisticalBarRenderer10.setSeriesOutlinePaint((int) '4', paint17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = statisticalBarRenderer10.getBaseToolTipGenerator();
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Stroke stroke23 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer26.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer26.setDrawBarOutline(false);
        statisticalBarRenderer26.removeAnnotations();
        statisticalBarRenderer26.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        statisticalBarRenderer26.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = statisticalBarRenderer40.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer40.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font45 = statisticalBarRenderer40.getBaseItemLabelFont();
        int int46 = statisticalBarRenderer40.getRowCount();
        double double47 = statisticalBarRenderer40.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer48.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = statisticalBarRenderer48.hasListener(eventListener51);
        java.awt.Paint paint55 = statisticalBarRenderer48.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer40.setBaseOutlinePaint(paint55, true);
        statisticalBarRenderer38.setSeriesOutlinePaint(10, paint55);
        statisticalBarRenderer26.setErrorIndicatorPaint(paint55);
        statisticalBarRenderer0.setBaseOutlinePaint(paint55, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(stroke42);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        int int11 = statisticalBarRenderer6.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer12.hasListener(eventListener15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        int int20 = statisticalBarRenderer17.getPassCount();
        java.awt.Font font22 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer17.getBasePositiveItemLabelPosition();
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition23);
        statisticalBarRenderer6.setBaseNegativeItemLabelPosition(itemLabelPosition23, false);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator28);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = statisticalBarRenderer0.hasListener(eventListener30);
        java.awt.Shape shape33 = statisticalBarRenderer0.getSeriesShape((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape33);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getToolTipGenerator((int) '#', (int) (short) 1);
        boolean boolean11 = statisticalBarRenderer0.getItemCreateEntity(1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer13.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke18 = statisticalBarRenderer13.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer13.setBaseItemLabelGenerator(categoryItemLabelGenerator19);
        java.awt.Stroke stroke23 = statisticalBarRenderer13.getItemStroke((int) (byte) -1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(false);
        int int29 = statisticalBarRenderer24.getRowCount();
        java.awt.Shape shape30 = statisticalBarRenderer24.getBaseShape();
        statisticalBarRenderer13.setBaseShape(shape30);
        java.awt.Paint paint32 = statisticalBarRenderer13.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint32, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 10, itemLabelPosition39, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        java.awt.Shape shape23 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke24 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Paint paint26 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        int int9 = statisticalBarRenderer6.getPassCount();
        statisticalBarRenderer6.setMinimumBarLength(10.0d);
        java.lang.Boolean boolean13 = statisticalBarRenderer6.getSeriesVisible((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer6.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer14);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        java.awt.Paint paint23 = statisticalBarRenderer0.getItemFillPaint(100, (int) (byte) -1);
        java.awt.Shape shape25 = statisticalBarRenderer0.getSeriesShape(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        int int31 = statisticalBarRenderer27.getColumnCount();
        java.awt.Paint paint32 = statisticalBarRenderer27.getBaseFillPaint();
        java.awt.Paint paint35 = statisticalBarRenderer27.getItemLabelPaint((int) '#', (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = statisticalBarRenderer36.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer36.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43, false);
        int int46 = statisticalBarRenderer42.getColumnCount();
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer42.setErrorIndicatorPaint(paint47);
        statisticalBarRenderer36.setBaseItemLabelPaint(paint47);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke52 = statisticalBarRenderer50.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke54 = statisticalBarRenderer50.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer36.setBaseStroke(stroke54, false);
        statisticalBarRenderer27.setBaseStroke(stroke54, true);
        java.awt.Stroke stroke59 = statisticalBarRenderer27.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke((int) '4', stroke59);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(stroke52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(stroke59);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint(1, 0);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D15, rectangle2D16, categoryAxis17, valueAxis18, layer19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setMaximumBarWidth(3.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14, false);
        int int17 = statisticalBarRenderer13.getColumnCount();
        int int18 = statisticalBarRenderer13.getColumnCount();
        java.awt.Paint paint19 = statisticalBarRenderer13.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = statisticalBarRenderer20.hasListener(eventListener26);
        java.awt.Shape shape30 = statisticalBarRenderer20.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer13.setBaseShape(shape30, true);
        statisticalBarRenderer0.setBaseShape(shape30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer35.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer35.setDrawBarOutline(false);
        java.lang.Boolean boolean41 = statisticalBarRenderer35.getSeriesVisibleInLegend((int) ' ');
        java.awt.Shape shape43 = statisticalBarRenderer35.getSeriesShape((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke46 = statisticalBarRenderer44.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer44.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        statisticalBarRenderer50.setBaseURLGenerator(categoryURLGenerator51, false);
        int int54 = statisticalBarRenderer50.getColumnCount();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer50.setErrorIndicatorPaint(paint55);
        statisticalBarRenderer44.setBaseItemLabelPaint(paint55);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation58 = null;
        boolean boolean59 = statisticalBarRenderer44.removeAnnotation(categoryAnnotation58);
        java.awt.Paint paint60 = statisticalBarRenderer44.getBasePaint();
        statisticalBarRenderer35.setBasePaint(paint60, true);
        java.awt.Paint paint64 = statisticalBarRenderer35.getSeriesPaint((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint66 = statisticalBarRenderer65.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer67.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer67.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator73 = null;
        statisticalBarRenderer67.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator73, true);
        statisticalBarRenderer67.removeAnnotations();
        java.awt.Paint paint77 = statisticalBarRenderer67.getErrorIndicatorPaint();
        statisticalBarRenderer65.setBasePaint(paint77, true);
        statisticalBarRenderer35.setErrorIndicatorPaint(paint77);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) 'a', paint77);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertNull(stroke46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint77);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke28 = statisticalBarRenderer23.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke28);
        java.awt.Paint paint32 = statisticalBarRenderer0.getItemOutlinePaint(100, (-1));
        java.awt.Stroke stroke33 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.lang.Object obj34 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesFillPaint(10);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 1);
        int int5 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 1, (int) (byte) 0);
        java.lang.Object obj9 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        int int11 = statisticalBarRenderer6.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer12.hasListener(eventListener15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        int int20 = statisticalBarRenderer17.getPassCount();
        java.awt.Font font22 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer17.getBasePositiveItemLabelPosition();
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition23);
        statisticalBarRenderer6.setBaseNegativeItemLabelPosition(itemLabelPosition23, false);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator28);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = statisticalBarRenderer0.hasListener(eventListener30);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer32);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 100);
        int int10 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean12 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        double double4 = statisticalBarRenderer0.getBase();
        boolean boolean6 = statisticalBarRenderer0.isSeriesVisibleInLegend((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke9 = statisticalBarRenderer7.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer7.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font12 = statisticalBarRenderer7.getBaseItemLabelFont();
        int int13 = statisticalBarRenderer7.getRowCount();
        double double14 = statisticalBarRenderer7.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = statisticalBarRenderer15.hasListener(eventListener18);
        java.awt.Paint paint22 = statisticalBarRenderer15.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer7.setBaseOutlinePaint(paint22, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = statisticalBarRenderer25.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke29 = statisticalBarRenderer25.lookupSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = statisticalBarRenderer30.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer30.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font35 = statisticalBarRenderer30.getBaseItemLabelFont();
        statisticalBarRenderer25.setBaseItemLabelFont(font35);
        statisticalBarRenderer7.setBaseItemLabelFont(font35, false);
        statisticalBarRenderer0.setBaseItemLabelFont(font35, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawItem(graphics2D43, categoryItemRendererState44, rectangle2D45, categoryPlot46, categoryAxis47, valueAxis48, categoryDataset49, (int) (short) 10, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(stroke32);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false);
        double double8 = statisticalBarRenderer0.getUpperClip();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState14 = statisticalBarRenderer0.initialise(graphics2D9, rectangle2D10, categoryPlot11, 10, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint7 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint7);
        org.jfree.chart.LegendItem legendItem11 = statisticalBarRenderer0.getLegendItem((int) (byte) -1, (int) (byte) 1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, true);
        int int15 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Font font7 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = statisticalBarRenderer0.getLegendItems();
        statisticalBarRenderer0.removeAnnotations();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryURLGenerator4);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        java.awt.Font font4 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator6, true);
        java.awt.Font font9 = statisticalBarRenderer0.getBaseItemLabelFont();
        double double10 = statisticalBarRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        java.lang.Boolean boolean14 = statisticalBarRenderer0.getSeriesVisible(10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer16.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = statisticalBarRenderer16.hasListener(eventListener19);
        statisticalBarRenderer16.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer24.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer24.getLegendItemURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseStroke(stroke31);
        statisticalBarRenderer16.setBaseOutlineStroke(stroke31);
        statisticalBarRenderer0.setBaseStroke(stroke31, false);
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainGridline(graphics2D36, categoryPlot37, rectangle2D38, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(itemLabelPosition15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNull(itemLabelPosition29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        int int13 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font14 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean15 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.lang.Class<?> wildcardClass16 = statisticalBarRenderer0.getClass();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        boolean boolean14 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = statisticalBarRenderer0.getURLGenerator(0, (int) '4');
        java.lang.Object obj19 = statisticalBarRenderer0.clone();
        boolean boolean20 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = statisticalBarRenderer22.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer22.setBaseCreateEntities(true, false);
        boolean boolean29 = statisticalBarRenderer22.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape31 = statisticalBarRenderer22.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean33 = statisticalBarRenderer22.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = statisticalBarRenderer22.getItemLabelGenerator((int) (short) 1, (int) (short) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation37 = null;
        boolean boolean38 = statisticalBarRenderer22.removeAnnotation(categoryAnnotation37);
        java.awt.Paint paint39 = statisticalBarRenderer22.getBaseFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(categoryURLGenerator18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getSeriesStroke((int) (short) 0);
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = statisticalBarRenderer11.getSeriesOutlineStroke((int) (byte) 10);
        int int14 = statisticalBarRenderer11.getPassCount();
        double double15 = statisticalBarRenderer11.getUpperClip();
        double double16 = statisticalBarRenderer11.getItemMargin();
        java.lang.Boolean boolean18 = statisticalBarRenderer11.getSeriesVisibleInLegend((int) (byte) 0);
        boolean boolean19 = statisticalBarRenderer11.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer11.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint24 = statisticalBarRenderer11.getItemOutlinePaint(10, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 10, paint24, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = statisticalBarRenderer27.getSeriesOutlineStroke((int) (byte) 10);
        int int30 = statisticalBarRenderer27.getPassCount();
        boolean boolean31 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer27.setBaseSeriesVisible(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke37 = statisticalBarRenderer35.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer35.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        int int45 = statisticalBarRenderer41.getColumnCount();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer41.setErrorIndicatorPaint(paint46);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke51 = statisticalBarRenderer49.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke53 = statisticalBarRenderer49.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer35.setBaseStroke(stroke53, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer56.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener59 = null;
        boolean boolean60 = statisticalBarRenderer56.hasListener(eventListener59);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke63 = statisticalBarRenderer61.getSeriesOutlineStroke((int) (byte) 10);
        int int64 = statisticalBarRenderer61.getPassCount();
        java.awt.Font font66 = statisticalBarRenderer61.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = statisticalBarRenderer61.getBasePositiveItemLabelPosition();
        statisticalBarRenderer56.setNegativeItemLabelPositionFallback(itemLabelPosition67);
        statisticalBarRenderer35.setPositiveItemLabelPositionFallback(itemLabelPosition67);
        statisticalBarRenderer27.setBaseNegativeItemLabelPosition(itemLabelPosition67);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition67);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke74 = statisticalBarRenderer72.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer72.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer78 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator79 = null;
        statisticalBarRenderer78.setBaseURLGenerator(categoryURLGenerator79, false);
        int int82 = statisticalBarRenderer78.getColumnCount();
        java.awt.Paint paint83 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer78.setErrorIndicatorPaint(paint83);
        statisticalBarRenderer72.setBaseItemLabelPaint(paint83);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation86 = null;
        boolean boolean87 = statisticalBarRenderer72.removeAnnotation(categoryAnnotation86);
        java.awt.Shape shape88 = statisticalBarRenderer72.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape88);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(stroke37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(stroke51);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(stroke63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(font66);
        org.junit.Assert.assertNotNull(itemLabelPosition67);
        org.junit.Assert.assertNull(stroke74);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(shape88);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint21 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean22 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Stroke stroke23 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        boolean boolean9 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer11.setBaseURLGenerator(categoryURLGenerator12, false);
        int int15 = statisticalBarRenderer11.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = statisticalBarRenderer16.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer16.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer16.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer11.setBasePositiveItemLabelPosition(itemLabelPosition22, true);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) 'a', itemLabelPosition22);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean1 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) true);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = statisticalBarRenderer0.getToolTipGenerator((int) 'a', (int) (short) 10);
        int int15 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator16, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 100);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        java.awt.Paint paint13 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer17.setItemLabelAnchorOffset((-1.0d));
        double double20 = statisticalBarRenderer17.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer17.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke23 = statisticalBarRenderer17.lookupSeriesStroke((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font29 = statisticalBarRenderer24.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer30.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer30.setDrawBarOutline(false);
        java.awt.Font font37 = statisticalBarRenderer30.getItemLabelFont((int) (short) -1, 1);
        statisticalBarRenderer24.setBaseItemLabelFont(font37, false);
        statisticalBarRenderer24.setItemLabelAnchorOffset(2.0d);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer24.setSeriesOutlinePaint((int) (byte) 10, paint43, false);
        statisticalBarRenderer17.setBaseFillPaint(paint43, true);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 0);
        boolean boolean8 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(10, (int) (byte) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        double double24 = statisticalBarRenderer20.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator25);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D30, categoryPlot31, categoryAxis32, categoryMarker33, rectangle2D34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator25);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        double double15 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean19 = statisticalBarRenderer0.getItemVisible(0, (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        int int26 = statisticalBarRenderer20.getRowCount();
        double double27 = statisticalBarRenderer20.getBase();
        java.awt.Stroke stroke30 = statisticalBarRenderer20.getItemStroke((int) (byte) 0, (int) (byte) 10);
        statisticalBarRenderer0.setBaseStroke(stroke30, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(itemLabelPosition14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean15 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator20, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator24, false);
        int int27 = statisticalBarRenderer23.getColumnCount();
        int int28 = statisticalBarRenderer23.getColumnCount();
        java.awt.Paint paint30 = statisticalBarRenderer23.getSeriesItemLabelPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer23.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) 100);
        java.awt.Paint paint34 = statisticalBarRenderer23.getBaseOutlinePaint();
        boolean boolean35 = statisticalBarRenderer23.getAutoPopulateSeriesPaint();
        java.awt.Stroke stroke37 = statisticalBarRenderer23.lookupSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setBaseStroke(stroke37, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = statisticalBarRenderer9.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke13 = statisticalBarRenderer9.lookupSeriesOutlineStroke((int) (short) 1);
        boolean boolean14 = statisticalBarRenderer0.equals((java.lang.Object) (short) 1);
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesVisible(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer17.setBaseCreateEntities(true, false);
        java.awt.Paint paint24 = null;
        statisticalBarRenderer17.setSeriesOutlinePaint((int) '4', paint24);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = statisticalBarRenderer17.getBaseToolTipGenerator();
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = statisticalBarRenderer30.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke34 = statisticalBarRenderer30.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer17.setSeriesStroke((int) (byte) 0, stroke34);
        statisticalBarRenderer17.setItemLabelAnchorOffset((double) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = statisticalBarRenderer17.getSeriesToolTipGenerator((int) ' ');
        statisticalBarRenderer17.setAutoPopulateSeriesStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer42.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = null;
        statisticalBarRenderer42.setLegendItemToolTipGenerator(categorySeriesLabelGenerator45);
        java.awt.Graphics2D graphics2D47 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.plot.Marker marker50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        statisticalBarRenderer42.drawRangeMarker(graphics2D47, categoryPlot48, valueAxis49, marker50, rectangle2D51);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = null;
        statisticalBarRenderer42.setBaseToolTipGenerator(categoryToolTipGenerator53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer42.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer42.setAutoPopulateSeriesOutlineStroke(false);
        boolean boolean58 = statisticalBarRenderer42.getAutoPopulateSeriesStroke();
        int int59 = statisticalBarRenderer42.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke62 = statisticalBarRenderer60.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer60.setAutoPopulateSeriesOutlinePaint(false);
        int int65 = statisticalBarRenderer60.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer66.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener69 = null;
        boolean boolean70 = statisticalBarRenderer66.hasListener(eventListener69);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer71 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke73 = statisticalBarRenderer71.getSeriesOutlineStroke((int) (byte) 10);
        int int74 = statisticalBarRenderer71.getPassCount();
        java.awt.Font font76 = statisticalBarRenderer71.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = statisticalBarRenderer71.getBasePositiveItemLabelPosition();
        statisticalBarRenderer66.setNegativeItemLabelPositionFallback(itemLabelPosition77);
        statisticalBarRenderer60.setBaseNegativeItemLabelPosition(itemLabelPosition77, false);
        java.awt.Paint paint83 = statisticalBarRenderer60.getItemOutlinePaint(0, (-1));
        statisticalBarRenderer42.setBasePaint(paint83, true);
        statisticalBarRenderer17.setBaseOutlinePaint(paint83, true);
        java.awt.Stroke stroke88 = statisticalBarRenderer17.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke88);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator90 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator90);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(categoryToolTipGenerator26);
        org.junit.Assert.assertNull(stroke32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNull(categoryToolTipGenerator39);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(stroke62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(stroke73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNull(font76);
        org.junit.Assert.assertNotNull(itemLabelPosition77);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(stroke88);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Stroke stroke15 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke15);
        java.awt.Font font18 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont(100, font18, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        boolean boolean25 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 100);
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.plot.Marker marker34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D31, categoryPlot32, valueAxis33, marker34, rectangle2D35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(100, categoryToolTipGenerator15);
        double double17 = statisticalBarRenderer0.getLowerClip();
        double double18 = statisticalBarRenderer0.getUpperClip();
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) '#');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean6 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(true);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer12.setDrawBarOutline(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer17.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator21, false);
        boolean boolean24 = statisticalBarRenderer12.equals((java.lang.Object) categoryItemLabelGenerator21);
        statisticalBarRenderer12.removeAnnotations();
        java.awt.Paint paint26 = statisticalBarRenderer12.getBaseItemLabelPaint();
        double double27 = statisticalBarRenderer12.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer12.getSeriesNegativeItemLabelPosition(0);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) 'a', itemLabelPosition29, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        int int27 = statisticalBarRenderer24.getPassCount();
        double double28 = statisticalBarRenderer24.getUpperClip();
        double double29 = statisticalBarRenderer24.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke35 = statisticalBarRenderer33.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer33.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint44);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation47 = null;
        boolean boolean48 = statisticalBarRenderer33.removeAnnotation(categoryAnnotation47);
        java.awt.Paint paint49 = statisticalBarRenderer33.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint49, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator52);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = statisticalBarRenderer0.getSeriesURLGenerator((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator59 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator59);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator65 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke68 = statisticalBarRenderer66.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer66.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer66.getPositiveItemLabelPositionFallback();
        java.awt.Shape shape74 = statisticalBarRenderer66.getItemShape((int) 'a', (int) (byte) -1);
        java.lang.Boolean boolean76 = statisticalBarRenderer66.getSeriesItemLabelsVisible((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer77 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke79 = statisticalBarRenderer77.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer77.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font82 = statisticalBarRenderer77.getBaseItemLabelFont();
        statisticalBarRenderer66.setBaseItemLabelFont(font82, true);
        java.awt.Paint paint87 = statisticalBarRenderer66.getItemLabelPaint((int) (byte) 100, (int) (short) 1);
        statisticalBarRenderer0.setBasePaint(paint87);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer89 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer89.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint92 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer89.setBaseFillPaint(paint92);
        boolean boolean94 = statisticalBarRenderer89.getAutoPopulateSeriesStroke();
        java.awt.Paint paint96 = statisticalBarRenderer89.lookupSeriesOutlinePaint(0);
        statisticalBarRenderer0.setBaseOutlinePaint(paint96);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(stroke35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryURLGenerator55);
        org.junit.Assert.assertNull(categoryItemLabelGenerator58);
        org.junit.Assert.assertNotNull(itemLabelPosition61);
        org.junit.Assert.assertNull(categoryToolTipGenerator65);
        org.junit.Assert.assertNull(stroke68);
        org.junit.Assert.assertNull(itemLabelPosition71);
        org.junit.Assert.assertNotNull(shape74);
        org.junit.Assert.assertNull(boolean76);
        org.junit.Assert.assertNull(stroke79);
        org.junit.Assert.assertNotNull(font82);
        org.junit.Assert.assertNotNull(paint87);
        org.junit.Assert.assertNotNull(paint92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(paint96);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator16);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        java.awt.Paint paint9 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setItemLabelAnchorOffset((-1.0d));
        double double13 = statisticalBarRenderer10.getBase();
        java.awt.Paint paint14 = statisticalBarRenderer10.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseFillPaint(paint14);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        boolean boolean23 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint25 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) 100);
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setBaseCreateEntities(true, false);
        boolean boolean21 = statisticalBarRenderer14.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = statisticalBarRenderer14.getBaseToolTipGenerator();
        boolean boolean23 = statisticalBarRenderer14.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean25 = statisticalBarRenderer14.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint26 = statisticalBarRenderer14.getBasePaint();
        java.awt.Stroke stroke27 = statisticalBarRenderer14.getBaseStroke();
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true, true);
        double double14 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer15.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator19, false);
        java.awt.Stroke stroke22 = null;
        statisticalBarRenderer15.setErrorIndicatorStroke(stroke22);
        boolean boolean24 = statisticalBarRenderer15.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer15.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint28 = statisticalBarRenderer15.lookupSeriesPaint(0);
        boolean boolean31 = statisticalBarRenderer15.getItemVisible((int) 'a', (int) (byte) 10);
        java.awt.Paint paint32 = statisticalBarRenderer15.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint32);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke37 = statisticalBarRenderer35.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer35.setBaseCreateEntities(true, false);
        boolean boolean42 = statisticalBarRenderer35.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator43 = statisticalBarRenderer35.getBaseToolTipGenerator();
        boolean boolean44 = statisticalBarRenderer35.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean46 = statisticalBarRenderer35.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint47 = statisticalBarRenderer35.getBasePaint();
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint47);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(stroke37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(categoryItemLabelGenerator51);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = statisticalBarRenderer0.getSeriesURLGenerator(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer17.setBaseCreateEntities(true, false);
        java.awt.Paint paint24 = null;
        statisticalBarRenderer17.setSeriesOutlinePaint((int) '4', paint24);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = statisticalBarRenderer17.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer17.setBaseItemLabelGenerator(categoryItemLabelGenerator27);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator29, false);
        statisticalBarRenderer17.setItemLabelAnchorOffset((double) (short) 0);
        double double34 = statisticalBarRenderer17.getUpperClip();
        boolean boolean35 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer17);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(categoryToolTipGenerator26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator38);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11, false);
        int int14 = statisticalBarRenderer10.getColumnCount();
        java.awt.Shape shape16 = null;
        statisticalBarRenderer10.setSeriesShape((int) (byte) 100, shape16, true);
        java.awt.Stroke stroke20 = statisticalBarRenderer10.lookupSeriesStroke(1);
        statisticalBarRenderer0.setBaseStroke(stroke20, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator29, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (-1));
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = statisticalBarRenderer10.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer10.setBaseCreateEntities(true, false);
        java.awt.Font font17 = null;
        statisticalBarRenderer10.setSeriesItemLabelFont((int) '4', font17);
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseStroke(stroke19);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer10.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer10.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = statisticalBarRenderer25.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer25.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32, false);
        int int35 = statisticalBarRenderer31.getColumnCount();
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setErrorIndicatorPaint(paint36);
        statisticalBarRenderer25.setBaseItemLabelPaint(paint36);
        statisticalBarRenderer10.setSeriesFillPaint((int) (byte) 10, paint36, true);
        statisticalBarRenderer10.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer44.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer44.setBaseFillPaint(paint47);
        boolean boolean49 = statisticalBarRenderer44.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke50 = statisticalBarRenderer44.getBaseStroke();
        statisticalBarRenderer10.setErrorIndicatorStroke(stroke50);
        statisticalBarRenderer0.setBaseStroke(stroke50, true);
        boolean boolean55 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint16 = statisticalBarRenderer0.getSeriesPaint((int) 'a');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean18 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D19, rectangle2D20, categoryAxis21, valueAxis22, layer23, plotRenderingInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(itemLabelPosition14);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) -1);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getSeriesStroke((int) '#');
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator3);
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.plot.Marker marker8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D5, categoryPlot6, valueAxis7, marker8, rectangle2D9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        boolean boolean15 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getItemStroke((int) 'a', 10);
        java.awt.Paint paint20 = statisticalBarRenderer0.getSeriesFillPaint(0);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        boolean boolean15 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation14);
        java.awt.Font font16 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        java.awt.Shape shape23 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke24 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Stroke stroke26 = null;
        statisticalBarRenderer0.setSeriesStroke((int) ' ', stroke26);
        java.awt.Stroke stroke29 = statisticalBarRenderer0.getSeriesStroke((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 1, categoryToolTipGenerator31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(stroke29);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesPaint(100, paint6);
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getItemOutlineStroke(10, (int) (byte) 10);
        java.awt.Paint paint11 = statisticalBarRenderer0.getErrorIndicatorPaint();
        boolean boolean14 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (byte) 100);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, (java.lang.Boolean) false, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator7, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(false);
        int int17 = statisticalBarRenderer12.getRowCount();
        java.awt.Shape shape18 = statisticalBarRenderer12.getBaseShape();
        java.awt.Font font21 = statisticalBarRenderer12.getItemLabelFont((int) (short) 10, 1);
        boolean boolean22 = statisticalBarRenderer12.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseCreateEntities(true, false);
        java.awt.Paint paint30 = null;
        statisticalBarRenderer23.setSeriesOutlinePaint((int) '4', paint30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = statisticalBarRenderer23.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = null;
        statisticalBarRenderer23.setBaseItemLabelGenerator(categoryItemLabelGenerator33);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer23.getLegendItemLabelGenerator();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer36 = statisticalBarRenderer23.getGradientPaintTransformer();
        statisticalBarRenderer12.setGradientPaintTransformer(gradientPaintTransformer36);
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke41 = statisticalBarRenderer39.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer39.setBaseCreateEntities(true, false);
        java.awt.Paint paint46 = null;
        statisticalBarRenderer39.setSeriesOutlinePaint((int) '4', paint46);
        org.jfree.chart.LegendItem legendItem50 = statisticalBarRenderer39.getLegendItem((int) (byte) -1, (int) (byte) 1);
        java.awt.Stroke stroke51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer39.setBaseOutlineStroke(stroke51, false);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke51);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke58 = statisticalBarRenderer56.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer56.setBaseCreateEntities(true, false);
        boolean boolean63 = statisticalBarRenderer56.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator64 = statisticalBarRenderer56.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = statisticalBarRenderer56.getSeriesItemLabelGenerator((int) (byte) 100);
        statisticalBarRenderer56.setAutoPopulateSeriesShape(false);
        java.awt.Paint paint69 = statisticalBarRenderer56.getBasePaint();
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 100, paint69);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNull(categoryToolTipGenerator32);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNotNull(gradientPaintTransformer36);
        org.junit.Assert.assertNull(stroke41);
        org.junit.Assert.assertNull(legendItem50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(stroke58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator64);
        org.junit.Assert.assertNull(categoryItemLabelGenerator66);
        org.junit.Assert.assertNotNull(paint69);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke5 = statisticalBarRenderer3.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer3.setBaseCreateEntities(true, false);
        boolean boolean10 = statisticalBarRenderer3.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer3.getBaseToolTipGenerator();
        java.awt.Paint paint14 = statisticalBarRenderer3.getItemFillPaint((int) (byte) 100, 1);
        java.awt.Shape shape16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer3.setSeriesShape(1, shape16, false);
        statisticalBarRenderer0.setSeriesShape(1, shape16);
        boolean boolean20 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '#', false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke28 = statisticalBarRenderer26.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer26.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33, false);
        int int36 = statisticalBarRenderer32.getColumnCount();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setErrorIndicatorPaint(paint37);
        statisticalBarRenderer26.setBaseItemLabelPaint(paint37);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation40 = null;
        boolean boolean41 = statisticalBarRenderer26.removeAnnotation(categoryAnnotation40);
        java.awt.Shape shape42 = statisticalBarRenderer26.getBaseShape();
        java.awt.Paint paint44 = statisticalBarRenderer26.lookupSeriesFillPaint((int) '4');
        statisticalBarRenderer0.setBasePaint(paint44);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNull(stroke28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        statisticalBarRenderer0.setMinimumBarLength(10.0d);
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Paint paint7 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesPaint((int) (short) -1);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible(1);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) false);
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D15, categoryPlot16, categoryAxis17, categoryMarker18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (-1));
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) 0, (int) ' ');
        java.awt.Shape shape13 = statisticalBarRenderer0.getItemShape(0, (int) '#');
        java.awt.Paint paint14 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke3 = statisticalBarRenderer1.getSeriesOutlineStroke((int) (byte) 10);
        int int4 = statisticalBarRenderer1.getPassCount();
        double double5 = statisticalBarRenderer1.getUpperClip();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer1.setSeriesPaint(100, paint7);
        statisticalBarRenderer0.setBasePaint(paint7);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        double double12 = statisticalBarRenderer0.getItemMargin();
        java.awt.Font font15 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 10, (int) (short) -1);
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNull(stroke3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(itemLabelPosition19);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemFillPaint((int) (short) 1, 10);
        java.awt.Font font13 = statisticalBarRenderer0.getSeriesItemLabelFont(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(font13);
        org.junit.Assert.assertNull(itemLabelPosition14);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator14, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 0, categoryToolTipGenerator17);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = statisticalBarRenderer0.getSeriesURLGenerator(1);
        java.awt.Stroke stroke23 = statisticalBarRenderer0.getItemStroke((int) 'a', (int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState30 = statisticalBarRenderer0.initialise(graphics2D25, rectangle2D26, categoryPlot27, (int) 'a', plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(itemLabelPosition24);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) 100);
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseOutlinePaint();
        boolean boolean12 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer12.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition18);
        java.awt.Paint paint20 = null;
        statisticalBarRenderer0.setBasePaint(paint20, true);
        double double23 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryPlot8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        boolean boolean9 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (-1));
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke(10);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 10);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setItemLabelAnchorOffset(100.0d);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean6 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Shape shape7 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6, false);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 100);
        java.awt.Paint paint16 = statisticalBarRenderer0.getBaseFillPaint();
        java.awt.Paint paint17 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        int int27 = statisticalBarRenderer24.getPassCount();
        double double28 = statisticalBarRenderer24.getUpperClip();
        double double29 = statisticalBarRenderer24.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke35 = statisticalBarRenderer33.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer33.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint44);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation47 = null;
        boolean boolean48 = statisticalBarRenderer33.removeAnnotation(categoryAnnotation47);
        java.awt.Paint paint49 = statisticalBarRenderer33.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint49, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator52);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = statisticalBarRenderer0.getSeriesURLGenerator((int) '#');
        boolean boolean57 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator58, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke63 = statisticalBarRenderer61.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer61.setBaseCreateEntities(false);
        statisticalBarRenderer61.setBaseSeriesVisible(true, true);
        statisticalBarRenderer61.setAutoPopulateSeriesOutlineStroke(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator71 = null;
        statisticalBarRenderer61.setBaseItemLabelGenerator(categoryItemLabelGenerator71, false);
        boolean boolean74 = statisticalBarRenderer61.getBaseItemLabelsVisible();
        java.awt.Paint paint77 = statisticalBarRenderer61.getItemPaint((int) (short) 100, 100);
        statisticalBarRenderer0.setBaseOutlinePaint(paint77);
        boolean boolean79 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setMaximumBarWidth((double) 0.0f);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(stroke35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryURLGenerator55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(stroke63);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer10.setBaseToolTipGenerator(categoryToolTipGenerator11);
        boolean boolean15 = statisticalBarRenderer10.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer10.setBaseItemLabelGenerator(categoryItemLabelGenerator16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke20 = statisticalBarRenderer18.getSeriesOutlineStroke((int) (byte) 10);
        int int21 = statisticalBarRenderer18.getPassCount();
        java.awt.Font font23 = statisticalBarRenderer18.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer18.getBasePositiveItemLabelPosition();
        statisticalBarRenderer10.setNegativeItemLabelPositionFallback(itemLabelPosition24);
        java.awt.Paint paint26 = statisticalBarRenderer10.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBasePaint(paint26, false);
        boolean boolean29 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator33, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(stroke20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        int int27 = statisticalBarRenderer24.getPassCount();
        double double28 = statisticalBarRenderer24.getUpperClip();
        double double29 = statisticalBarRenderer24.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke35 = statisticalBarRenderer33.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer33.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint44);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation47 = null;
        boolean boolean48 = statisticalBarRenderer33.removeAnnotation(categoryAnnotation47);
        java.awt.Paint paint49 = statisticalBarRenderer33.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint49, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1L);
        java.awt.Shape shape54 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke57 = statisticalBarRenderer55.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer55.setBaseCreateEntities(true, false);
        java.awt.Paint paint62 = null;
        statisticalBarRenderer55.setSeriesOutlinePaint((int) '4', paint62);
        org.jfree.chart.LegendItem legendItem66 = statisticalBarRenderer55.getLegendItem((int) (byte) -1, (int) (byte) 1);
        java.awt.Stroke stroke67 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer55.setBaseOutlineStroke(stroke67, false);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke67, false);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer72 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer72);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(stroke35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNull(stroke57);
        org.junit.Assert.assertNull(legendItem66);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem8 = statisticalBarRenderer0.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator12);
        boolean boolean16 = statisticalBarRenderer11.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer11.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        java.awt.Stroke stroke20 = statisticalBarRenderer11.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        boolean boolean22 = statisticalBarRenderer11.removeAnnotation(categoryAnnotation21);
        java.awt.Paint paint25 = statisticalBarRenderer11.getItemFillPaint(100, (int) (byte) -1);
        statisticalBarRenderer0.setBasePaint(paint25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator28, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = statisticalBarRenderer32.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer32.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = statisticalBarRenderer32.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        double double41 = statisticalBarRenderer32.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer42.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener45 = null;
        boolean boolean46 = statisticalBarRenderer42.hasListener(eventListener45);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator47);
        java.awt.Paint paint49 = statisticalBarRenderer42.getBaseItemLabelPaint();
        statisticalBarRenderer32.setBasePaint(paint49);
        statisticalBarRenderer0.setSeriesPaint(0, paint49, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(legendItem8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(stroke34);
        org.junit.Assert.assertNull(categoryItemLabelGenerator40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        java.lang.Boolean boolean13 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(categoryToolTipGenerator15);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean9 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesPaint((int) (short) -1);
        boolean boolean9 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = statisticalBarRenderer10.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer10.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17, false);
        int int20 = statisticalBarRenderer16.getColumnCount();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setErrorIndicatorPaint(paint21);
        statisticalBarRenderer10.setBaseItemLabelPaint(paint21);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint21);
        java.awt.Paint paint25 = statisticalBarRenderer0.getBasePaint();
        java.awt.Paint paint28 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator29, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator8, false);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        int int16 = statisticalBarRenderer13.getPassCount();
        double double17 = statisticalBarRenderer13.getUpperClip();
        double double18 = statisticalBarRenderer13.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer20.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint23);
        statisticalBarRenderer13.setSeriesPaint(1, paint23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer13.getSeriesPositiveItemLabelPosition((int) '4');
        double double28 = statisticalBarRenderer13.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer30.setItemLabelAnchorOffset((-1.0d));
        double double33 = statisticalBarRenderer30.getBase();
        boolean boolean34 = statisticalBarRenderer30.getBaseItemLabelsVisible();
        java.lang.Boolean boolean36 = statisticalBarRenderer30.getSeriesVisibleInLegend(10);
        double double37 = statisticalBarRenderer30.getUpperClip();
        java.awt.Shape shape40 = statisticalBarRenderer30.getItemShape(100, (int) ' ');
        statisticalBarRenderer13.setSeriesShape((int) '#', shape40);
        statisticalBarRenderer0.setBaseShape(shape40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getItemStroke((int) (byte) -1, 1);
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean17 = statisticalBarRenderer16.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer16.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator19, false);
        java.awt.Paint paint23 = statisticalBarRenderer16.getSeriesOutlinePaint(10);
        org.jfree.chart.LegendItem legendItem26 = statisticalBarRenderer16.getLegendItem((int) (byte) 1, (int) '#');
        statisticalBarRenderer16.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = statisticalBarRenderer32.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font37 = statisticalBarRenderer32.getBaseItemLabelFont();
        boolean boolean38 = statisticalBarRenderer32.isDrawBarOutline();
        boolean boolean40 = statisticalBarRenderer32.isSeriesItemLabelsVisible(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer41.setItemLabelAnchorOffset((-1.0d));
        double double44 = statisticalBarRenderer41.getBase();
        boolean boolean45 = statisticalBarRenderer41.getBaseItemLabelsVisible();
        java.awt.Stroke stroke46 = statisticalBarRenderer41.getErrorIndicatorStroke();
        java.lang.Boolean boolean48 = statisticalBarRenderer41.getSeriesVisibleInLegend((int) (byte) 100);
        java.awt.Paint paint49 = statisticalBarRenderer41.getBaseOutlinePaint();
        java.lang.Boolean boolean51 = statisticalBarRenderer41.getSeriesVisible((int) (short) -1);
        java.awt.Graphics2D graphics2D52 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.plot.Marker marker55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        statisticalBarRenderer41.drawRangeMarker(graphics2D52, categoryPlot53, valueAxis54, marker55, rectangle2D56);
        statisticalBarRenderer41.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = statisticalBarRenderer41.getNegativeItemLabelPosition(0, (int) 'a');
        statisticalBarRenderer32.setBasePositiveItemLabelPosition(itemLabelPosition63);
        statisticalBarRenderer16.setSeriesNegativeItemLabelPosition((int) 'a', itemLabelPosition63, true);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition63, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(legendItem26);
        org.junit.Assert.assertNull(stroke34);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(boolean51);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseStroke(stroke18, false);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer23.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer23.getLegendItemToolTipGenerator();
        statisticalBarRenderer23.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer31.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint34);
        statisticalBarRenderer23.setSeriesFillPaint((int) (byte) 1, paint34);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint34, false);
        java.awt.Shape shape40 = statisticalBarRenderer0.getSeriesShape((int) (byte) 1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) 1, (java.lang.Boolean) true, true);
        java.awt.Paint paint46 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(paint46);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) ' ', (int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent23 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 100);
        java.awt.Shape shape30 = statisticalBarRenderer0.getSeriesShape(0);
        statisticalBarRenderer0.setMinimumBarLength(1.0d);
        java.lang.Boolean boolean34 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 0, categoryURLGenerator36, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(boolean34);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator5);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer9.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer9.setDrawBarOutline(false);
        statisticalBarRenderer9.removeAnnotations();
        statisticalBarRenderer9.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        statisticalBarRenderer9.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent21 = null;
        statisticalBarRenderer9.notifyListeners(rendererChangeEvent21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        int int26 = statisticalBarRenderer23.getPassCount();
        boolean boolean27 = statisticalBarRenderer23.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer23.setBaseSeriesVisible(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = statisticalBarRenderer31.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer31.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        int int41 = statisticalBarRenderer37.getColumnCount();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setErrorIndicatorPaint(paint42);
        statisticalBarRenderer31.setBaseItemLabelPaint(paint42);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke47 = statisticalBarRenderer45.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke49 = statisticalBarRenderer45.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer31.setBaseStroke(stroke49, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer52.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener55 = null;
        boolean boolean56 = statisticalBarRenderer52.hasListener(eventListener55);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke59 = statisticalBarRenderer57.getSeriesOutlineStroke((int) (byte) 10);
        int int60 = statisticalBarRenderer57.getPassCount();
        java.awt.Font font62 = statisticalBarRenderer57.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = statisticalBarRenderer57.getBasePositiveItemLabelPosition();
        statisticalBarRenderer52.setNegativeItemLabelPositionFallback(itemLabelPosition63);
        statisticalBarRenderer31.setPositiveItemLabelPositionFallback(itemLabelPosition63);
        statisticalBarRenderer23.setBaseNegativeItemLabelPosition(itemLabelPosition63);
        statisticalBarRenderer9.setBasePositiveItemLabelPosition(itemLabelPosition63);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition63);
        java.awt.Shape shape71 = statisticalBarRenderer0.getItemShape((int) (byte) -1, (int) ' ');
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(stroke47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(stroke59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(font62);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
        org.junit.Assert.assertNotNull(shape71);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer16.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer16.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        statisticalBarRenderer16.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator22, true);
        statisticalBarRenderer16.removeAnnotations();
        java.awt.Paint paint26 = statisticalBarRenderer16.getErrorIndicatorPaint();
        statisticalBarRenderer0.setErrorIndicatorPaint(paint26);
        boolean boolean28 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer6.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint9);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9, false);
        java.awt.Shape shape14 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17, false);
        int int20 = statisticalBarRenderer16.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer16.getNegativeItemLabelPosition((int) (short) -1, (-1));
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = statisticalBarRenderer16.getToolTipGenerator((int) (byte) 0, (int) ' ');
        java.awt.Shape shape27 = statisticalBarRenderer16.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(0, shape27, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        statisticalBarRenderer31.setBaseToolTipGenerator(categoryToolTipGenerator32);
        boolean boolean36 = statisticalBarRenderer31.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke39 = statisticalBarRenderer37.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer37.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = statisticalBarRenderer37.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer46 = statisticalBarRenderer37.getGradientPaintTransformer();
        statisticalBarRenderer31.setGradientPaintTransformer(gradientPaintTransformer46);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer48 = statisticalBarRenderer31.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer49.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer49.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator55 = null;
        statisticalBarRenderer49.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator55, true);
        statisticalBarRenderer49.removeAnnotations();
        java.awt.Paint paint59 = statisticalBarRenderer49.getErrorIndicatorPaint();
        statisticalBarRenderer31.setBaseItemLabelPaint(paint59);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesPaint((-1), paint59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(categoryToolTipGenerator26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(stroke39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertNotNull(gradientPaintTransformer46);
        org.junit.Assert.assertNotNull(gradientPaintTransformer48);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        java.awt.Font font10 = statisticalBarRenderer5.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        double double3 = statisticalBarRenderer0.getBase();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 100);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesVisible((int) (short) -1);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = statisticalBarRenderer0.hasListener(eventListener11);
        double double13 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean1 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer10.setDrawBarOutline(false);
        java.awt.Font font17 = statisticalBarRenderer10.getItemLabelFont((int) (short) -1, 1);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 0, font17, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean1 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        org.jfree.chart.LegendItem legendItem10 = statisticalBarRenderer0.getLegendItem((int) (byte) 1, (int) '#');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        int int25 = statisticalBarRenderer21.getColumnCount();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint26);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke31 = statisticalBarRenderer29.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke33 = statisticalBarRenderer29.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer15.setBaseStroke(stroke33, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer36.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = statisticalBarRenderer36.hasListener(eventListener39);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = statisticalBarRenderer41.getSeriesOutlineStroke((int) (byte) 10);
        int int44 = statisticalBarRenderer41.getPassCount();
        java.awt.Font font46 = statisticalBarRenderer41.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer41.getBasePositiveItemLabelPosition();
        statisticalBarRenderer36.setNegativeItemLabelPositionFallback(itemLabelPosition47);
        statisticalBarRenderer15.setPositiveItemLabelPositionFallback(itemLabelPosition47);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke53 = statisticalBarRenderer51.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer51.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = statisticalBarRenderer51.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        double double60 = statisticalBarRenderer51.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer61.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener64 = null;
        boolean boolean65 = statisticalBarRenderer61.hasListener(eventListener64);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator66 = null;
        statisticalBarRenderer61.setBaseURLGenerator(categoryURLGenerator66);
        java.awt.Paint paint68 = statisticalBarRenderer61.getBaseItemLabelPaint();
        statisticalBarRenderer51.setBasePaint(paint68);
        statisticalBarRenderer15.setSeriesPaint(1, paint68);
        java.awt.Paint paint72 = statisticalBarRenderer15.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setBaseItemLabelPaint(paint72, false);
        double double75 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(legendItem10);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(stroke43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(font46);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertNull(stroke53);
        org.junit.Assert.assertNull(categoryItemLabelGenerator59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseStroke(stroke18, false);
        java.lang.Boolean boolean22 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 10);
        boolean boolean23 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator3);
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.plot.Marker marker8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D5, categoryPlot6, valueAxis7, marker8, rectangle2D9);
        java.awt.Shape shape13 = statisticalBarRenderer0.getItemShape((int) (byte) 10, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setBaseCreateEntities(true, false);
        java.awt.Paint paint21 = null;
        statisticalBarRenderer14.setSeriesOutlinePaint((int) '4', paint21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer14.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        statisticalBarRenderer14.setBaseItemLabelGenerator(categoryItemLabelGenerator24);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer14.getLegendItemLabelGenerator();
        statisticalBarRenderer14.removeAnnotations();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer29.setDrawBarOutline(false);
        java.lang.Boolean boolean35 = statisticalBarRenderer29.getSeriesVisibleInLegend((int) ' ');
        java.awt.Shape shape37 = statisticalBarRenderer29.getSeriesShape((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke40 = statisticalBarRenderer38.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer38.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer44.setBaseURLGenerator(categoryURLGenerator45, false);
        int int48 = statisticalBarRenderer44.getColumnCount();
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer44.setErrorIndicatorPaint(paint49);
        statisticalBarRenderer38.setBaseItemLabelPaint(paint49);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation52 = null;
        boolean boolean53 = statisticalBarRenderer38.removeAnnotation(categoryAnnotation52);
        java.awt.Paint paint54 = statisticalBarRenderer38.getBasePaint();
        statisticalBarRenderer29.setBasePaint(paint54, true);
        java.awt.Paint paint58 = statisticalBarRenderer29.getSeriesPaint((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint60 = statisticalBarRenderer59.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer61.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer61.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator67 = null;
        statisticalBarRenderer61.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator67, true);
        statisticalBarRenderer61.removeAnnotations();
        java.awt.Paint paint71 = statisticalBarRenderer61.getErrorIndicatorPaint();
        statisticalBarRenderer59.setBasePaint(paint71, true);
        statisticalBarRenderer29.setErrorIndicatorPaint(paint71);
        statisticalBarRenderer14.setSeriesOutlinePaint((int) (short) 0, paint71, true);
        statisticalBarRenderer0.setBasePaint(paint71, false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertNull(stroke40);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNull(paint58);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint71);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        boolean boolean28 = statisticalBarRenderer0.isSeriesVisible((int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator29, false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) true, true);
        java.awt.Paint paint36 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = statisticalBarRenderer0.hasListener(eventListener37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.lang.Object obj8 = statisticalBarRenderer0.clone();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = statisticalBarRenderer0.getSeriesToolTipGenerator(10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer12.getLegendItemToolTipGenerator();
        statisticalBarRenderer12.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer20.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint23);
        statisticalBarRenderer12.setSeriesFillPaint((int) (byte) 1, paint23);
        statisticalBarRenderer0.setSeriesItemLabelPaint(100, paint23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = statisticalBarRenderer28.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer28.setBaseCreateEntities(true, false);
        java.awt.Paint paint35 = null;
        statisticalBarRenderer28.setSeriesOutlinePaint((int) '4', paint35);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = statisticalBarRenderer28.getBaseToolTipGenerator();
        statisticalBarRenderer28.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Stroke stroke41 = statisticalBarRenderer28.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke41);
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D43, categoryPlot44, valueAxis45, rectangle2D46, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNull(categoryToolTipGenerator37);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        java.awt.Paint paint9 = statisticalBarRenderer0.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) false);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true, true);
        java.awt.Paint paint17 = statisticalBarRenderer0.getErrorIndicatorPaint();
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer19.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer25.setBaseURLGenerator(categoryURLGenerator26, false);
        int int29 = statisticalBarRenderer25.getColumnCount();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer25.setErrorIndicatorPaint(paint30);
        statisticalBarRenderer19.setBaseItemLabelPaint(paint30);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation33 = null;
        boolean boolean34 = statisticalBarRenderer19.removeAnnotation(categoryAnnotation33);
        java.awt.Stroke stroke35 = statisticalBarRenderer19.getBaseStroke();
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = statisticalBarRenderer19.hasListener(eventListener36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke41 = statisticalBarRenderer39.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer39.setBaseCreateEntities(true, false);
        java.awt.Font font46 = null;
        statisticalBarRenderer39.setSeriesItemLabelFont((int) '4', font46);
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer39.setBaseStroke(stroke48);
        java.awt.Stroke stroke50 = statisticalBarRenderer39.getBaseStroke();
        statisticalBarRenderer19.setSeriesStroke((int) (byte) 100, stroke50);
        statisticalBarRenderer0.setBaseStroke(stroke50);
        int int53 = statisticalBarRenderer0.getColumnCount();
        boolean boolean56 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(stroke41);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = statisticalBarRenderer9.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer9.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator13, false);
        java.awt.Stroke stroke16 = null;
        statisticalBarRenderer9.setErrorIndicatorStroke(stroke16);
        boolean boolean18 = statisticalBarRenderer9.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer9.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint22 = statisticalBarRenderer9.lookupSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer9.getSeriesNegativeItemLabelPosition((int) (short) 1);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator26, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        statisticalBarRenderer0.setMinimumBarLength((double) 100.0f);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        java.lang.Object obj16 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6, false);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent19 = null;
        statisticalBarRenderer14.notifyListeners(rendererChangeEvent19);
        java.awt.Paint paint23 = statisticalBarRenderer14.getItemOutlinePaint((int) (short) 100, (int) (byte) 1);
        java.awt.Paint paint24 = statisticalBarRenderer14.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint24);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = statisticalBarRenderer27.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer27.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer27.getPositiveItemLabelPositionFallback();
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = statisticalBarRenderer27.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer34.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer34.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = null;
        statisticalBarRenderer34.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator40, true);
        java.awt.Paint paint45 = statisticalBarRenderer34.getItemFillPaint((int) (short) 1, 10);
        statisticalBarRenderer27.setBaseFillPaint(paint45, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator49 = null;
        statisticalBarRenderer48.setBaseURLGenerator(categoryURLGenerator49, false);
        int int52 = statisticalBarRenderer48.getColumnCount();
        int int53 = statisticalBarRenderer48.getColumnCount();
        java.awt.Paint paint55 = statisticalBarRenderer48.getSeriesItemLabelPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = statisticalBarRenderer48.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = statisticalBarRenderer48.getSeriesPositiveItemLabelPosition((int) (short) 10);
        statisticalBarRenderer27.setBasePositiveItemLabelPosition(itemLabelPosition60);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition60, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertNull(itemLabelPosition32);
        org.junit.Assert.assertNull(categoryPlot33);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertNotNull(itemLabelPosition58);
        org.junit.Assert.assertNotNull(itemLabelPosition60);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        statisticalBarRenderer33.setBaseToolTipGenerator(categoryToolTipGenerator34);
        boolean boolean38 = statisticalBarRenderer33.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = statisticalBarRenderer33.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator41 = null;
        statisticalBarRenderer40.setBaseURLGenerator(categoryURLGenerator41, false);
        int int44 = statisticalBarRenderer40.getColumnCount();
        java.awt.Paint paint45 = statisticalBarRenderer40.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem48 = statisticalBarRenderer40.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = statisticalBarRenderer40.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator52 = null;
        statisticalBarRenderer51.setBaseToolTipGenerator(categoryToolTipGenerator52);
        boolean boolean56 = statisticalBarRenderer51.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = null;
        statisticalBarRenderer51.setBaseItemLabelGenerator(categoryItemLabelGenerator57, false);
        java.awt.Stroke stroke60 = statisticalBarRenderer51.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation61 = null;
        boolean boolean62 = statisticalBarRenderer51.removeAnnotation(categoryAnnotation61);
        java.awt.Paint paint65 = statisticalBarRenderer51.getItemFillPaint(100, (int) (byte) -1);
        statisticalBarRenderer40.setBasePaint(paint65);
        java.awt.Stroke stroke67 = statisticalBarRenderer40.getBaseStroke();
        statisticalBarRenderer33.setErrorIndicatorStroke(stroke67);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke67);
        boolean boolean70 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNull(itemLabelPosition31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(categoryURLGenerator39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(legendItem48);
        org.junit.Assert.assertNotNull(itemLabelPosition50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D12, categoryPlot13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false, true);
        boolean boolean16 = statisticalBarRenderer0.getItemVisible(10, (int) (short) 10);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D17, rectangle2D18, categoryAxis19, valueAxis20, layer21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator21, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        boolean boolean27 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        int int8 = statisticalBarRenderer0.getRowCount();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 1);
        java.awt.Paint paint6 = null;
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint6);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setSeriesPaint(1, paint10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        boolean boolean14 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(drawingSupplier15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke28 = statisticalBarRenderer23.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke28);
        java.awt.Shape shape30 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = statisticalBarRenderer31.getSeriesOutlineStroke((int) (byte) 10);
        int int34 = statisticalBarRenderer31.getPassCount();
        double double35 = statisticalBarRenderer31.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer31.getSeriesPositiveItemLabelPosition(1);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition37, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = statisticalBarRenderer41.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = null;
        statisticalBarRenderer41.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator45, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke51 = statisticalBarRenderer49.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer49.setBaseCreateEntities(true, false);
        java.awt.Font font56 = null;
        statisticalBarRenderer49.setSeriesItemLabelFont((int) '4', font56);
        java.awt.Stroke stroke58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer49.setBaseStroke(stroke58);
        statisticalBarRenderer41.setSeriesStroke((int) (byte) 100, stroke58);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator62 = null;
        statisticalBarRenderer61.setBaseToolTipGenerator(categoryToolTipGenerator62);
        boolean boolean66 = statisticalBarRenderer61.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = null;
        statisticalBarRenderer61.setBaseItemLabelGenerator(categoryItemLabelGenerator67, false);
        statisticalBarRenderer61.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator73 = null;
        statisticalBarRenderer72.setBaseURLGenerator(categoryURLGenerator73, false);
        int int76 = statisticalBarRenderer72.getColumnCount();
        java.awt.Paint paint77 = statisticalBarRenderer72.getBaseFillPaint();
        statisticalBarRenderer61.setBaseFillPaint(paint77, false);
        statisticalBarRenderer41.setBaseItemLabelPaint(paint77, false);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint77, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNull(stroke43);
        org.junit.Assert.assertNull(stroke51);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(paint77);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true, true);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Font font17 = statisticalBarRenderer0.getItemLabelFont((int) '4', 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        java.awt.Paint paint30 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer0.getPlot();
        boolean boolean32 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) 'a');
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        boolean boolean41 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean42 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.awt.Paint paint47 = statisticalBarRenderer0.getItemFillPaint(0, 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator49 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator49, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font7 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font7);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        int int25 = statisticalBarRenderer21.getColumnCount();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint26);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint26, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.lang.Boolean boolean35 = statisticalBarRenderer0.getSeriesVisible((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = statisticalBarRenderer0.getSeriesURLGenerator(1);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(categoryURLGenerator37);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Font font7 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8, false);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 100);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = statisticalBarRenderer0.getPlot();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(categoryURLGenerator4);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(categoryPlot15);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        double double7 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean6 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer12.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator16, false);
        java.awt.Stroke stroke19 = null;
        statisticalBarRenderer12.setErrorIndicatorStroke(stroke19);
        boolean boolean21 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer12.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint25 = statisticalBarRenderer12.lookupSeriesPaint(0);
        statisticalBarRenderer0.setSeriesPaint((int) (short) 1, paint25, false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, false);
        java.awt.Paint paint33 = statisticalBarRenderer0.getItemPaint((int) (byte) 1, 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator35, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer15.setBaseCreateEntities(true, false);
        java.awt.Font font22 = null;
        statisticalBarRenderer15.setSeriesItemLabelFont((int) '4', font22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke28 = statisticalBarRenderer24.lookupSeriesOutlineStroke((int) (short) 1);
        boolean boolean29 = statisticalBarRenderer15.equals((java.lang.Object) (short) 1);
        java.lang.Boolean boolean31 = statisticalBarRenderer15.getSeriesVisible(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer32.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = statisticalBarRenderer32.hasListener(eventListener35);
        java.awt.Paint paint39 = statisticalBarRenderer32.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer15.setBasePaint(paint39);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint39);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation42 = null;
        org.jfree.chart.util.Layer layer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation42, layer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) ' ');
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        int int11 = statisticalBarRenderer8.getPassCount();
        java.awt.Font font13 = statisticalBarRenderer8.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer8.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition14);
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint20 = statisticalBarRenderer0.lookupSeriesFillPaint((int) 'a');
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesPaint(1);
        java.lang.Boolean boolean24 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) 'a');
        org.jfree.chart.event.RendererChangeListener rendererChangeListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(font13);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = statisticalBarRenderer2.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font7 = statisticalBarRenderer2.getBaseItemLabelFont();
        int int8 = statisticalBarRenderer2.getRowCount();
        double double9 = statisticalBarRenderer2.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = statisticalBarRenderer10.hasListener(eventListener13);
        java.awt.Paint paint17 = statisticalBarRenderer10.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer2.setBaseOutlinePaint(paint17, true);
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint17);
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) false);
        statisticalBarRenderer0.setDrawBarOutline(true);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesFillPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getNegativeItemLabelPosition(0, (int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categoryURLGenerator17);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator20);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator22, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition25);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) -1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 0, (int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition18);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNull(itemLabelPosition20);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 0, categoryToolTipGenerator9);
        boolean boolean11 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator12, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 10);
        int int18 = statisticalBarRenderer15.getPassCount();
        double double19 = statisticalBarRenderer15.getUpperClip();
        double double20 = statisticalBarRenderer15.getItemMargin();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer15.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator21);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer6.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer6.setDrawBarOutline(false);
        java.awt.Font font13 = statisticalBarRenderer6.getItemLabelFont((int) (short) -1, 1);
        statisticalBarRenderer0.setBaseItemLabelFont(font13, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset(2.0d);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 10, paint19, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer23.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator27, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = statisticalBarRenderer23.getBaseToolTipGenerator();
        java.awt.Paint paint31 = statisticalBarRenderer23.getBaseOutlinePaint();
        java.awt.Stroke stroke32 = statisticalBarRenderer23.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke32, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator35);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNull(categoryToolTipGenerator30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '#', (int) (byte) -1);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Shape shape8 = statisticalBarRenderer0.getItemShape((int) (byte) 1, 10);
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesCreateEntities((int) '#');
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer12.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = statisticalBarRenderer0.getLegendItems();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(legendItemCollection20);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        int int3 = statisticalBarRenderer0.getPassCount();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) false);
        java.awt.Paint paint9 = statisticalBarRenderer0.getBaseOutlinePaint();
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.awt.Font font15 = null;
        statisticalBarRenderer8.setSeriesItemLabelFont((int) '4', font15);
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseStroke(stroke17);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke17);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities(100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = statisticalBarRenderer24.getSeriesOutlineStroke((int) (byte) 10);
        int int27 = statisticalBarRenderer24.getPassCount();
        double double28 = statisticalBarRenderer24.getUpperClip();
        double double29 = statisticalBarRenderer24.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke35 = statisticalBarRenderer33.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer33.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer39.setBaseURLGenerator(categoryURLGenerator40, false);
        int int43 = statisticalBarRenderer39.getColumnCount();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint44);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation47 = null;
        boolean boolean48 = statisticalBarRenderer33.removeAnnotation(categoryAnnotation47);
        java.awt.Paint paint49 = statisticalBarRenderer33.getBasePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint49, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator52);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = statisticalBarRenderer0.getSeriesURLGenerator((int) '#');
        boolean boolean57 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 100);
        int int58 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator60 = null;
        statisticalBarRenderer59.setBaseURLGenerator(categoryURLGenerator60, false);
        double double63 = statisticalBarRenderer59.getBase();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator64 = statisticalBarRenderer59.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator64);
        boolean boolean66 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(stroke35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryURLGenerator55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint7 = statisticalBarRenderer0.getItemOutlinePaint(10, 0);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemFillPaint((int) '#', (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer12.getPositiveItemLabelPositionFallback();
        java.awt.Shape shape20 = statisticalBarRenderer12.getItemShape((int) 'a', (int) (byte) -1);
        java.lang.Boolean boolean22 = statisticalBarRenderer12.getSeriesItemLabelsVisible((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font28 = statisticalBarRenderer23.getBaseItemLabelFont();
        statisticalBarRenderer12.setBaseItemLabelFont(font28, true);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) 'a', font28);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (int) (byte) -1);
        java.awt.Shape shape16 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(shape16);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6, false);
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) 100, (int) 'a');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator13, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        statisticalBarRenderer16.setBaseToolTipGenerator(categoryToolTipGenerator17);
        boolean boolean21 = statisticalBarRenderer16.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = statisticalBarRenderer16.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator24, false);
        int int27 = statisticalBarRenderer23.getColumnCount();
        java.awt.Paint paint28 = statisticalBarRenderer23.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem31 = statisticalBarRenderer23.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer23.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = null;
        statisticalBarRenderer34.setBaseToolTipGenerator(categoryToolTipGenerator35);
        boolean boolean39 = statisticalBarRenderer34.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer34.setBaseItemLabelGenerator(categoryItemLabelGenerator40, false);
        java.awt.Stroke stroke43 = statisticalBarRenderer34.getBaseOutlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation44 = null;
        boolean boolean45 = statisticalBarRenderer34.removeAnnotation(categoryAnnotation44);
        java.awt.Paint paint48 = statisticalBarRenderer34.getItemFillPaint(100, (int) (byte) -1);
        statisticalBarRenderer23.setBasePaint(paint48);
        java.awt.Stroke stroke50 = statisticalBarRenderer23.getBaseStroke();
        statisticalBarRenderer16.setErrorIndicatorStroke(stroke50);
        java.awt.Font font53 = statisticalBarRenderer16.getSeriesItemLabelFont((int) '4');
        java.awt.Paint paint56 = statisticalBarRenderer16.getItemOutlinePaint(1, (int) ' ');
        statisticalBarRenderer0.setBasePaint(paint56);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(legendItem31);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNull(font53);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer8.getLegendItemToolTipGenerator();
        statisticalBarRenderer8.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer8.setSeriesOutlineStroke((int) (byte) 1, stroke16);
        java.awt.Paint paint19 = statisticalBarRenderer8.lookupSeriesOutlinePaint((int) '#');
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 0, paint19);
        statisticalBarRenderer0.setMinimumBarLength((double) 100);
        java.lang.Boolean boolean24 = statisticalBarRenderer0.getSeriesVisible((int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = statisticalBarRenderer0.getSeriesURLGenerator(0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent27 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(categoryURLGenerator26);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        int int5 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font11 = statisticalBarRenderer6.getBaseItemLabelFont();
        int int12 = statisticalBarRenderer6.getRowCount();
        double double13 = statisticalBarRenderer6.getBase();
        java.awt.Stroke stroke16 = statisticalBarRenderer6.getItemStroke((int) (byte) 0, (int) (byte) 10);
        statisticalBarRenderer0.setBaseStroke(stroke16, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer20.setItemLabelAnchorOffset((-1.0d));
        double double23 = statisticalBarRenderer20.getBase();
        java.awt.Font font24 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer20.setBaseCreateEntities(true, true);
        java.awt.Paint paint29 = statisticalBarRenderer20.lookupSeriesFillPaint((int) '4');
        statisticalBarRenderer0.setSeriesPaint(0, paint29, true);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Shape shape6 = null;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 100, shape6, true);
        java.awt.Paint paint9 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = statisticalBarRenderer11.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer11.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer11.getLegendItemURLGenerator();
        boolean boolean19 = statisticalBarRenderer11.isSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Shape shape21 = statisticalBarRenderer11.lookupSeriesShape((int) (byte) 1);
        statisticalBarRenderer0.setSeriesShape(1, shape21, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator31, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer6.setItemLabelAnchorOffset((-1.0d));
        double double9 = statisticalBarRenderer6.getBase();
        java.awt.Paint paint10 = statisticalBarRenderer6.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 0, paint10, true);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) true, true);
        boolean boolean20 = statisticalBarRenderer0.isSeriesItemLabelsVisible(100);
        java.awt.Paint paint21 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 100);
        double double12 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setBaseCreateEntities(true, false);
        java.awt.Paint paint21 = null;
        statisticalBarRenderer14.setSeriesOutlinePaint((int) '4', paint21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer14.getBaseToolTipGenerator();
        java.awt.Font font26 = statisticalBarRenderer14.getItemLabelFont((int) (short) 100, (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 10, font26);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
        org.junit.Assert.assertNull(categoryURLGenerator11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        boolean boolean5 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        boolean boolean9 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke9 = statisticalBarRenderer7.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer7.setBaseCreateEntities(true, false);
        java.awt.Font font14 = null;
        statisticalBarRenderer7.setSeriesItemLabelFont((int) '4', font14);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer7.setBaseStroke(stroke16);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer7.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition18, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        double double24 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        int int31 = statisticalBarRenderer27.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer27.getNegativeItemLabelPositionFallback();
        java.awt.Stroke stroke35 = statisticalBarRenderer27.getItemStroke((int) (short) -1, (int) (short) 0);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke35, false);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font18 = statisticalBarRenderer13.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont(0, font18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(itemLabelPosition23);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 1, (int) (short) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        java.awt.Font font17 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int18 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator9, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = statisticalBarRenderer13.getSeriesOutlineStroke((int) (byte) 10);
        int int16 = statisticalBarRenderer13.getPassCount();
        double double17 = statisticalBarRenderer13.getUpperClip();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setSeriesPaint(100, paint19);
        statisticalBarRenderer12.setBasePaint(paint19);
        statisticalBarRenderer0.setBasePaint(paint19);
        boolean boolean23 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Font font25 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 10);
        java.awt.Paint paint27 = statisticalBarRenderer0.getSeriesItemLabelPaint(100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(font25);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6, false);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseOutlineStroke();
        boolean boolean10 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = statisticalBarRenderer12.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        java.awt.Paint paint19 = null;
        statisticalBarRenderer12.setSeriesOutlinePaint((int) '4', paint19);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = statisticalBarRenderer12.getBaseToolTipGenerator();
        java.awt.Paint paint23 = statisticalBarRenderer12.getSeriesPaint((int) (short) 0);
        java.awt.Stroke stroke26 = statisticalBarRenderer12.getItemOutlineStroke((int) (byte) 0, (int) '4');
        statisticalBarRenderer0.setSeriesStroke((int) (short) 10, stroke26, true);
        java.awt.Font font29 = statisticalBarRenderer0.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 100, (java.lang.Boolean) false, true);
        java.awt.Paint paint34 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) (short) 1, 100);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState16 = statisticalBarRenderer0.initialise(graphics2D11, rectangle2D12, categoryPlot13, (int) (short) 100, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        boolean boolean17 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        java.awt.Paint paint19 = statisticalBarRenderer12.lookupSeriesOutlinePaint(0);
        java.awt.Paint paint21 = statisticalBarRenderer12.lookupSeriesFillPaint((int) (byte) 100);
        statisticalBarRenderer0.setBasePaint(paint21, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 0, 0);
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D27, categoryPlot28, categoryAxis29, categoryMarker30, rectangle2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint5);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesItemLabelPaint(0);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = statisticalBarRenderer0.hasListener(eventListener6);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getSeriesOutlineStroke(0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(stroke9);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 0, categoryToolTipGenerator9);
        double double11 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesItemLabelPaint(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer14.setBaseCreateEntities(true, false);
        boolean boolean21 = statisticalBarRenderer14.isSeriesItemLabelsVisible((int) (byte) 0);
        java.awt.Shape shape23 = statisticalBarRenderer14.lookupSeriesShape((int) (short) -1);
        java.lang.Boolean boolean25 = statisticalBarRenderer14.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        int int30 = statisticalBarRenderer26.getColumnCount();
        java.awt.Paint paint31 = statisticalBarRenderer26.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem34 = statisticalBarRenderer26.getLegendItem((int) (byte) 1, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer26.getSeriesNegativeItemLabelPosition((int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer26.getLegendItemLabelGenerator();
        statisticalBarRenderer14.setLegendItemURLGenerator(categorySeriesLabelGenerator37);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator37);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(legendItem34);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator37);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        int int8 = statisticalBarRenderer5.getPassCount();
        double double9 = statisticalBarRenderer5.getUpperClip();
        double double10 = statisticalBarRenderer5.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint15);
        statisticalBarRenderer5.setSeriesPaint(1, paint15);
        statisticalBarRenderer0.setBaseFillPaint(paint15, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) 'a', (-1));
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 0, categoryItemLabelGenerator24, true);
        boolean boolean29 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = statisticalBarRenderer31.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = null;
        statisticalBarRenderer31.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator35, false);
        java.awt.Stroke stroke38 = null;
        statisticalBarRenderer31.setErrorIndicatorStroke(stroke38);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer31.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer31.setItemLabelAnchorOffset((double) (-1.0f));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator46 = null;
        statisticalBarRenderer45.setBaseToolTipGenerator(categoryToolTipGenerator46);
        boolean boolean50 = statisticalBarRenderer45.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = null;
        statisticalBarRenderer45.setBaseItemLabelGenerator(categoryItemLabelGenerator51, false);
        statisticalBarRenderer45.setDrawBarOutline(true);
        java.awt.Paint paint57 = statisticalBarRenderer45.lookupSeriesOutlinePaint((int) (byte) 0);
        statisticalBarRenderer31.setBaseItemLabelPaint(paint57, false);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint57, false);
        double double62 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator63 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator63, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((-1), categoryToolTipGenerator67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.2d + "'", double62 == 0.2d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        int int10 = statisticalBarRenderer6.getColumnCount();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setErrorIndicatorPaint(paint11);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = statisticalBarRenderer14.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseStroke(stroke18, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer21.setItemLabelAnchorOffset((-1.0d));
        boolean boolean24 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer21);
        int int25 = statisticalBarRenderer0.getRowCount();
        java.lang.Object obj26 = statisticalBarRenderer0.clone();
        double double27 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Paint paint28 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.0d + "'", double27 == 2.0d);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        org.jfree.chart.LegendItem legendItem11 = statisticalBarRenderer0.getLegendItem((int) '#', (int) (byte) 1);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer15.setDrawBarOutline(false);
        statisticalBarRenderer15.removeAnnotations();
        statisticalBarRenderer15.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        statisticalBarRenderer15.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent27 = null;
        statisticalBarRenderer15.notifyListeners(rendererChangeEvent27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke31 = statisticalBarRenderer29.getSeriesOutlineStroke((int) (byte) 10);
        int int32 = statisticalBarRenderer29.getPassCount();
        boolean boolean33 = statisticalBarRenderer29.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer29.setBaseSeriesVisible(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke39 = statisticalBarRenderer37.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer37.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator44 = null;
        statisticalBarRenderer43.setBaseURLGenerator(categoryURLGenerator44, false);
        int int47 = statisticalBarRenderer43.getColumnCount();
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer43.setErrorIndicatorPaint(paint48);
        statisticalBarRenderer37.setBaseItemLabelPaint(paint48);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke53 = statisticalBarRenderer51.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke55 = statisticalBarRenderer51.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer37.setBaseStroke(stroke55, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer58.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener61 = null;
        boolean boolean62 = statisticalBarRenderer58.hasListener(eventListener61);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke65 = statisticalBarRenderer63.getSeriesOutlineStroke((int) (byte) 10);
        int int66 = statisticalBarRenderer63.getPassCount();
        java.awt.Font font68 = statisticalBarRenderer63.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = statisticalBarRenderer63.getBasePositiveItemLabelPosition();
        statisticalBarRenderer58.setNegativeItemLabelPositionFallback(itemLabelPosition69);
        statisticalBarRenderer37.setPositiveItemLabelPositionFallback(itemLabelPosition69);
        statisticalBarRenderer29.setBaseNegativeItemLabelPosition(itemLabelPosition69);
        statisticalBarRenderer15.setBasePositiveItemLabelPosition(itemLabelPosition69);
        java.awt.Stroke stroke75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setSeriesStroke((int) '#', stroke75);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 10, stroke75, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, (int) '#');
        boolean boolean82 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener83 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(stroke31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(stroke39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(stroke53);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(stroke65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(font68);
        org.junit.Assert.assertNotNull(itemLabelPosition69);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertNotNull(itemLabelPosition81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font25 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font25);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font25, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        java.awt.Stroke stroke33 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) -1, 0);
        boolean boolean36 = statisticalBarRenderer0.isItemLabelVisible((int) 'a', (int) (byte) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 0, categoryURLGenerator38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseFillPaint();
        java.awt.Paint paint8 = statisticalBarRenderer0.getItemLabelPaint((int) '#', (int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.LegendItem legendItem14 = statisticalBarRenderer0.getLegendItem(0, (int) (short) 100);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        java.awt.Shape shape21 = statisticalBarRenderer0.getSeriesShape((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer22.setItemLabelAnchorOffset((-1.0d));
        double double25 = statisticalBarRenderer22.getBase();
        java.awt.Font font26 = statisticalBarRenderer22.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(legendItem14);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator1 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator1);
        boolean boolean5 = statisticalBarRenderer0.getItemVisible((-1), (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Paint paint7 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = statisticalBarRenderer0.getBaseURLGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryURLGenerator8);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        int int5 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = statisticalBarRenderer6.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font11 = statisticalBarRenderer6.getBaseItemLabelFont();
        int int12 = statisticalBarRenderer6.getRowCount();
        double double13 = statisticalBarRenderer6.getBase();
        java.awt.Stroke stroke16 = statisticalBarRenderer6.getItemStroke((int) (byte) 0, (int) (byte) 10);
        statisticalBarRenderer0.setBaseStroke(stroke16, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer19.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font24 = statisticalBarRenderer19.getBaseItemLabelFont();
        int int25 = statisticalBarRenderer19.getRowCount();
        double double26 = statisticalBarRenderer19.getBase();
        boolean boolean29 = statisticalBarRenderer19.getItemVisible((int) ' ', (int) ' ');
        statisticalBarRenderer19.setAutoPopulateSeriesFillPaint(true);
        int int32 = statisticalBarRenderer19.getRowCount();
        java.awt.Stroke stroke33 = statisticalBarRenderer19.getBaseOutlineStroke();
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 10, 1);
        java.lang.Object obj38 = null;
        boolean boolean39 = statisticalBarRenderer0.equals(obj38);
        boolean boolean40 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) ' ');
        double double7 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer8.setBaseURLGenerator(categoryURLGenerator9, false);
        int int12 = statisticalBarRenderer8.getColumnCount();
        java.awt.Paint paint13 = statisticalBarRenderer8.getBaseFillPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint13, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(itemLabelPosition16);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) ' ');
        double double7 = statisticalBarRenderer0.getLowerClip();
        statisticalBarRenderer0.removeAnnotations();
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) '4');
        boolean boolean12 = statisticalBarRenderer0.isSeriesVisible(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14, false);
        int int17 = statisticalBarRenderer13.getColumnCount();
        int int18 = statisticalBarRenderer13.getColumnCount();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = statisticalBarRenderer13.hasListener(eventListener19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = statisticalBarRenderer21.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer21.setBaseCreateEntities(true, false);
        java.awt.Font font28 = null;
        statisticalBarRenderer21.setSeriesItemLabelFont((int) '4', font28);
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseStroke(stroke30);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer21.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = statisticalBarRenderer21.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = statisticalBarRenderer36.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer36.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43, false);
        int int46 = statisticalBarRenderer42.getColumnCount();
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer42.setErrorIndicatorPaint(paint47);
        statisticalBarRenderer36.setBaseItemLabelPaint(paint47);
        statisticalBarRenderer21.setSeriesFillPaint((int) (byte) 10, paint47, true);
        statisticalBarRenderer21.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer55.setItemLabelAnchorOffset((-1.0d));
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer55.setBaseFillPaint(paint58);
        boolean boolean60 = statisticalBarRenderer55.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke61 = statisticalBarRenderer55.getBaseStroke();
        statisticalBarRenderer21.setErrorIndicatorStroke(stroke61);
        statisticalBarRenderer13.setBaseOutlineStroke(stroke61, true);
        statisticalBarRenderer0.setBaseStroke(stroke61);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getItemStroke((int) (byte) 0, (int) (byte) 10);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean14 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Font font5 = statisticalBarRenderer0.getBaseItemLabelFont();
        int int6 = statisticalBarRenderer0.getRowCount();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setItemLabelAnchorOffset((-1.0d));
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = statisticalBarRenderer8.hasListener(eventListener11);
        java.awt.Paint paint15 = statisticalBarRenderer8.getItemLabelPaint((int) (byte) -1, (int) (short) 100);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator18, true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        int int5 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = statisticalBarRenderer8.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer8.setBaseCreateEntities(true, false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer8.hasListener(eventListener14);
        java.awt.Shape shape18 = statisticalBarRenderer8.getItemShape((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesShape((int) '4', shape18, true);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer23.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = statisticalBarRenderer23.getItemLabelGenerator((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = statisticalBarRenderer23.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer32);
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(1, categoryURLGenerator39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertNotNull(gradientPaintTransformer32);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator4, false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesPaint(0);
        boolean boolean16 = statisticalBarRenderer0.getItemVisible((int) 'a', (int) (byte) 10);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getSeriesStroke((int) '4');
        java.awt.Paint paint21 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 100, 0);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        int int4 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = statisticalBarRenderer5.getSeriesOutlineStroke((int) (byte) 10);
        statisticalBarRenderer5.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11, true);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, false);
        boolean boolean19 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Stroke stroke24 = statisticalBarRenderer20.lookupSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke24, true);
        double double27 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Font font29 = null;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 100, font29, true);
        java.awt.Font font32 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setItemLabelAnchorOffset((-1.0d));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator6, true);
        statisticalBarRenderer0.removeAnnotations();
        double double10 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator12, false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
    }
}

