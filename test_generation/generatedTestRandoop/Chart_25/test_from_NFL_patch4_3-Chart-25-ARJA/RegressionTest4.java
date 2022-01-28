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
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Shape shape33 = statisticalBarRenderer27.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        statisticalBarRenderer34.setIncludeBaseInRange(false);
        java.awt.Shape shape40 = statisticalBarRenderer34.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke43 = statisticalBarRenderer34.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer27.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke43);
        boolean boolean47 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setSeriesOutlinePaint(10, paint51);
        boolean boolean53 = statisticalBarRenderer49.getAutoPopulateSeriesStroke();
        statisticalBarRenderer49.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator57 = null;
        statisticalBarRenderer56.setBaseURLGenerator(categoryURLGenerator57);
        statisticalBarRenderer56.setIncludeBaseInRange(false);
        java.awt.Shape shape62 = statisticalBarRenderer56.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        statisticalBarRenderer63.setBaseURLGenerator(categoryURLGenerator64);
        statisticalBarRenderer63.setIncludeBaseInRange(false);
        java.awt.Shape shape69 = statisticalBarRenderer63.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke72 = statisticalBarRenderer63.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer56.setBaseOutlineStroke(stroke72);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition76 = statisticalBarRenderer56.getPositiveItemLabelPosition((int) (byte) -1, (int) 'a');
        java.awt.Paint paint79 = statisticalBarRenderer56.getItemFillPaint(1, (int) (short) 1);
        statisticalBarRenderer49.setBaseItemLabelPaint(paint79, false);
        statisticalBarRenderer0.setSeriesPaint(10, paint79, false);
        statisticalBarRenderer0.setSeriesVisible(100, (java.lang.Boolean) false);
        double double87 = statisticalBarRenderer0.getUpperClip();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape69);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(itemLabelPosition76);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        java.awt.Stroke stroke12 = statisticalBarRenderer7.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) (byte) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = statisticalBarRenderer0.getLegendItems();
        boolean boolean21 = statisticalBarRenderer0.getItemVisible((int) '4', (int) '4');
        java.awt.Stroke stroke22 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(itemLabelPosition23);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape(1, (int) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getURLGenerator(10, (int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = statisticalBarRenderer15.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator18, false);
        java.awt.Font font21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setBaseItemLabelFont(font21);
        statisticalBarRenderer15.setBaseItemLabelFont(font21);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = statisticalBarRenderer15.getSeriesURLGenerator((int) (byte) 0);
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        java.awt.Stroke stroke28 = statisticalBarRenderer15.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 0, stroke28);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(categoryURLGenerator13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNull(categoryURLGenerator25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryURLGenerator30);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        boolean boolean8 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer11.setBaseURLGenerator(categoryURLGenerator12);
        java.awt.Stroke stroke15 = statisticalBarRenderer11.lookupSeriesOutlineStroke(100);
        boolean boolean18 = statisticalBarRenderer11.getItemVisible((int) (byte) 10, (-1));
        statisticalBarRenderer11.setBase(2.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        statisticalBarRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setSeriesOutlinePaint(10, paint31);
        java.awt.Stroke stroke34 = statisticalBarRenderer29.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer22.setSeriesStroke((int) '#', stroke34);
        java.awt.Paint paint36 = statisticalBarRenderer22.getBaseItemLabelPaint();
        statisticalBarRenderer11.setSeriesFillPaint(100, paint36, true);
        statisticalBarRenderer0.setBaseFillPaint(paint36, true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer7 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer7);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setSeriesOutlinePaint(10, paint12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer10.getBaseItemLabelGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Paint paint19 = statisticalBarRenderer10.getItemPaint((int) (byte) -1, 100);
        boolean boolean20 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) statisticalBarRenderer10);
        int int21 = defaultStatisticalCategoryDataset9.getRowCount();
        java.util.List list22 = defaultStatisticalCategoryDataset9.getRowKeys();
        org.jfree.data.Range range23 = statisticalBarRenderer0.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(range23);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint25 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = statisticalBarRenderer0.getPlot();
        int int27 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categoryPlot26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) -1, (java.lang.Number) 10.0d, (java.lang.Comparable) 100, (java.lang.Comparable) 3.0d);
        double double13 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator22, true);
        java.awt.Paint paint26 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 100);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(paint26);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer6.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setSeriesOutlinePaint(10, paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer14.getBaseItemLabelGenerator();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint19);
        java.awt.Paint paint23 = statisticalBarRenderer14.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Shape shape30 = statisticalBarRenderer24.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer14.setBaseShape(shape30, false);
        statisticalBarRenderer14.setMinimumBarLength((double) '4');
        java.awt.Font font36 = statisticalBarRenderer14.getSeriesItemLabelFont(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        statisticalBarRenderer38.setIncludeBaseInRange(false);
        boolean boolean44 = statisticalBarRenderer38.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = statisticalBarRenderer38.getBaseToolTipGenerator();
        statisticalBarRenderer38.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setSeriesOutlinePaint(10, paint51);
        java.awt.Stroke stroke54 = statisticalBarRenderer49.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator57 = null;
        statisticalBarRenderer56.setBaseURLGenerator(categoryURLGenerator57, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = null;
        statisticalBarRenderer56.setLegendItemURLGenerator(categorySeriesLabelGenerator60);
        boolean boolean62 = statisticalBarRenderer56.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint64 = statisticalBarRenderer56.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer49.setSeriesOutlinePaint(0, paint64, false);
        double double67 = statisticalBarRenderer49.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer68 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator69 = null;
        statisticalBarRenderer68.setBaseURLGenerator(categoryURLGenerator69);
        java.awt.Paint paint72 = statisticalBarRenderer68.lookupSeriesPaint((-1));
        statisticalBarRenderer49.setBaseFillPaint(paint72, true);
        java.awt.Paint paint76 = statisticalBarRenderer49.lookupSeriesPaint((int) (byte) 100);
        java.awt.Paint paint77 = statisticalBarRenderer49.getErrorIndicatorPaint();
        statisticalBarRenderer38.setSeriesPaint((int) (short) 0, paint77, false);
        statisticalBarRenderer14.setSeriesFillPaint((int) '4', paint77);
        statisticalBarRenderer6.setBaseItemLabelPaint(paint77, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator83 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator83);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator45);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(paint77);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = statisticalBarRenderer7.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseFillPaint(paint8);
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        boolean boolean12 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) ' ');
        java.awt.Shape shape14 = null;
        statisticalBarRenderer0.setSeriesShape(0, shape14);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) false, true);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 0);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        java.awt.Paint paint24 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean26 = statisticalBarRenderer0.isSeriesVisible((int) (byte) -1);
        java.awt.Stroke stroke28 = statisticalBarRenderer0.getSeriesStroke((int) (short) 0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(stroke28);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Stroke stroke14 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setSeriesOutlinePaint(10, paint20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer18.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Paint paint27 = statisticalBarRenderer18.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer10.setBasePaint(paint27);
        statisticalBarRenderer0.setSeriesItemLabelPaint(1, paint27);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false, false);
        int int34 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer35.setBaseURLGenerator(categoryURLGenerator36, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = null;
        statisticalBarRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator39);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43);
        statisticalBarRenderer42.setIncludeBaseInRange(false);
        java.awt.Shape shape48 = statisticalBarRenderer42.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke51 = statisticalBarRenderer42.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer35.setSeriesStroke((int) (short) 100, stroke51, false);
        java.awt.Stroke stroke55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer35.setSeriesOutlineStroke(0, stroke55, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = statisticalBarRenderer35.getBaseItemLabelGenerator();
        statisticalBarRenderer35.setMinimumBarLength((double) (byte) 1);
        java.awt.Paint paint61 = statisticalBarRenderer35.getBaseFillPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint61, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNull(categoryItemLabelGenerator58);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator5, false);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke9);
        double double11 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        boolean boolean14 = statisticalBarRenderer0.isSeriesVisible((int) 'a');
        java.awt.Shape shape16 = statisticalBarRenderer0.lookupSeriesShape((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19);
        statisticalBarRenderer18.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = statisticalBarRenderer18.getPlot();
        double double24 = statisticalBarRenderer18.getMaximumBarWidth();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        statisticalBarRenderer18.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator26);
        statisticalBarRenderer18.setSeriesItemLabelsVisible(10, (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer18.getPositiveItemLabelPosition((int) (short) 1, 0);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition33);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(categoryPlot23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) 'a', 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator27);
        boolean boolean31 = statisticalBarRenderer0.getItemCreateEntity(100, (int) (short) 0);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setSeriesOutlinePaint(10, paint12);
        boolean boolean14 = statisticalBarRenderer10.getAutoPopulateSeriesStroke();
        boolean boolean15 = statisticalBarRenderer10.getAutoPopulateSeriesOutlineStroke();
        boolean boolean18 = statisticalBarRenderer10.isItemLabelVisible((int) (short) 100, 0);
        int int19 = statisticalBarRenderer10.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21);
        java.awt.Paint paint24 = statisticalBarRenderer20.lookupSeriesPaint((-1));
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseItemLabelPaint(paint25);
        statisticalBarRenderer10.setErrorIndicatorPaint(paint25);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint25, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator30);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator5, false);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke9);
        statisticalBarRenderer0.setBase((double) (short) -1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setSeriesOutlinePaint(10, paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer14.getBaseItemLabelGenerator();
        java.awt.Shape shape20 = statisticalBarRenderer14.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer14.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer14.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer14.setSeriesFillPaint((int) '#', paint27);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint27);
        statisticalBarRenderer0.setBase((double) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer32.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke38 = statisticalBarRenderer32.getItemStroke((int) (byte) 10, (int) '#');
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer32.setBaseOutlinePaint(paint39, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer32.getSeriesNegativeItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition43, false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) false, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator52 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) 0, (int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator53 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator53);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(itemLabelPosition7);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNull(categoryToolTipGenerator52);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) '#');
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        java.awt.Paint paint17 = statisticalBarRenderer0.lookupSeriesPaint((int) 'a');
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNull(itemLabelPosition4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        statisticalBarRenderer10.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean16 = statisticalBarRenderer10.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint18 = statisticalBarRenderer10.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Shape shape25 = statisticalBarRenderer19.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        statisticalBarRenderer26.setIncludeBaseInRange(false);
        java.awt.Shape shape32 = statisticalBarRenderer26.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke35 = statisticalBarRenderer26.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer19.setBaseOutlineStroke(stroke35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = null;
        statisticalBarRenderer37.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        boolean boolean43 = statisticalBarRenderer37.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = null;
        statisticalBarRenderer37.setPositiveItemLabelPositionFallback(itemLabelPosition44);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer37.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer19.setNegativeItemLabelPositionFallback(itemLabelPosition46);
        statisticalBarRenderer10.setBaseNegativeItemLabelPosition(itemLabelPosition46);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        statisticalBarRenderer10.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator50);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.plot.Marker marker56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        statisticalBarRenderer10.drawRangeMarker(graphics2D53, categoryPlot54, valueAxis55, marker56, rectangle2D57);
        java.awt.Font font59 = statisticalBarRenderer10.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont(1, font59);
        java.awt.Paint paint63 = statisticalBarRenderer0.getItemLabelPaint((int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 100, (int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        java.awt.Paint paint17 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 1, 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Shape shape30 = statisticalBarRenderer24.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer24.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) false, false);
        double double35 = statisticalBarRenderer24.getItemLabelAnchorOffset();
        java.awt.Paint paint38 = statisticalBarRenderer24.getItemOutlinePaint(0, 0);
        statisticalBarRenderer0.setBaseOutlinePaint(paint38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.0d + "'", double35 == 2.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator41);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator6, false);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        int int12 = statisticalBarRenderer0.getColumnCount();
        boolean boolean13 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Shape shape16 = statisticalBarRenderer0.getItemShape((int) (short) 0, (int) '#');
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator19, false);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean9 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer0.getLegendItemURLGenerator();
        double double11 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator12, false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double6 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) 0.2d);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean20 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 100);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) '4', 1);
        int int10 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setMaximumBarWidth((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        java.awt.Stroke stroke17 = statisticalBarRenderer13.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer13.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setSeriesOutlinePaint(10, paint23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer21.getBaseItemLabelGenerator();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        java.awt.Paint paint30 = statisticalBarRenderer21.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer13.setBasePaint(paint30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = statisticalBarRenderer13.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = statisticalBarRenderer13.getSeriesURLGenerator((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        java.awt.Stroke stroke41 = statisticalBarRenderer37.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint43 = statisticalBarRenderer42.getBaseOutlinePaint();
        statisticalBarRenderer37.setBasePaint(paint43, false);
        statisticalBarRenderer13.setBasePaint(paint43);
        statisticalBarRenderer13.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition49, true);
        boolean boolean52 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset59 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number62 = defaultStatisticalCategoryDataset59.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.util.List list63 = defaultStatisticalCategoryDataset59.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener64 = null;
        defaultStatisticalCategoryDataset59.removeChangeListener(datasetChangeListener64);
        defaultStatisticalCategoryDataset59.add((java.lang.Number) (short) -1, (java.lang.Number) 10.0d, (java.lang.Comparable) 100, (java.lang.Comparable) 3.0d);
        int int72 = defaultStatisticalCategoryDataset59.getColumnIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawItem(graphics2D53, categoryItemRendererState54, rectangle2D55, categoryPlot56, categoryAxis57, valueAxis58, (org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset59, 0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertNull(categoryURLGenerator36);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(number62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        boolean boolean22 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        java.awt.Stroke stroke25 = statisticalBarRenderer0.getBaseStroke();
        double double26 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setSeriesOutlinePaint(10, paint4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = statisticalBarRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint7);
        java.awt.Paint paint11 = statisticalBarRenderer2.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        statisticalBarRenderer12.setIncludeBaseInRange(false);
        java.awt.Shape shape18 = statisticalBarRenderer12.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer2.setBaseShape(shape18, false);
        statisticalBarRenderer0.setBaseShape(shape18, false);
        java.awt.Font font23 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator24);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator27, false);
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
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Paint paint17 = statisticalBarRenderer8.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBasePaint(paint17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer19.setSeriesOutlinePaint(10, paint21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer19.getBaseItemLabelGenerator();
        java.awt.Shape shape25 = statisticalBarRenderer19.lookupSeriesShape((int) (short) 100);
        java.awt.Stroke stroke27 = statisticalBarRenderer19.lookupSeriesStroke((int) (byte) -1);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke27);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getSeriesStroke((int) (short) 100);
        java.awt.Stroke stroke32 = statisticalBarRenderer0.lookupSeriesStroke(10);
        boolean boolean33 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator36, true);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint13);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getSeriesStroke((int) 'a');
        boolean boolean20 = statisticalBarRenderer0.getItemVisible((int) ' ', (-1));
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        boolean boolean7 = statisticalBarRenderer0.getItemVisible((int) (byte) 10, (-1));
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setSeriesOutlinePaint(10, paint17);
        java.awt.Stroke stroke20 = statisticalBarRenderer15.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        statisticalBarRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        boolean boolean28 = statisticalBarRenderer22.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint30 = statisticalBarRenderer22.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer15.setSeriesOutlinePaint(0, paint30, false);
        double double33 = statisticalBarRenderer15.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        java.awt.Paint paint38 = statisticalBarRenderer34.lookupSeriesPaint((-1));
        statisticalBarRenderer15.setBaseFillPaint(paint38, true);
        java.awt.Paint paint42 = statisticalBarRenderer15.lookupSeriesPaint((int) (byte) 100);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint42);
        statisticalBarRenderer0.setItemMargin((double) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(itemLabelPosition46);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setSeriesOutlinePaint(10, paint17);
        java.awt.Stroke stroke20 = statisticalBarRenderer15.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20);
        java.awt.Stroke stroke23 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 10);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) true);
        java.lang.Boolean boolean28 = statisticalBarRenderer0.getSeriesVisible(0);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent32 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent32);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(boolean28);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Shape shape14 = statisticalBarRenderer8.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint15 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer0.setSeriesPaint(100, paint15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryPlot19);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Shape shape33 = statisticalBarRenderer27.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        statisticalBarRenderer34.setIncludeBaseInRange(false);
        java.awt.Shape shape40 = statisticalBarRenderer34.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke43 = statisticalBarRenderer34.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer27.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke43);
        boolean boolean47 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer51.setBaseURLGenerator(categoryURLGenerator52, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = null;
        statisticalBarRenderer51.setLegendItemURLGenerator(categorySeriesLabelGenerator55);
        boolean boolean57 = statisticalBarRenderer51.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint59 = statisticalBarRenderer51.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator61 = null;
        statisticalBarRenderer60.setBaseURLGenerator(categoryURLGenerator61);
        statisticalBarRenderer60.setIncludeBaseInRange(false);
        java.awt.Shape shape66 = statisticalBarRenderer60.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator68 = null;
        statisticalBarRenderer67.setBaseURLGenerator(categoryURLGenerator68);
        statisticalBarRenderer67.setIncludeBaseInRange(false);
        java.awt.Shape shape73 = statisticalBarRenderer67.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke76 = statisticalBarRenderer67.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer60.setBaseOutlineStroke(stroke76);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer78 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator79 = null;
        statisticalBarRenderer78.setBaseURLGenerator(categoryURLGenerator79, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator82 = null;
        statisticalBarRenderer78.setLegendItemURLGenerator(categorySeriesLabelGenerator82);
        boolean boolean84 = statisticalBarRenderer78.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition85 = null;
        statisticalBarRenderer78.setPositiveItemLabelPositionFallback(itemLabelPosition85);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition87 = statisticalBarRenderer78.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer60.setNegativeItemLabelPositionFallback(itemLabelPosition87);
        statisticalBarRenderer51.setBaseNegativeItemLabelPosition(itemLabelPosition87);
        java.awt.Paint paint90 = statisticalBarRenderer51.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint90);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertNotNull(shape73);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition87);
        org.junit.Assert.assertNotNull(paint90);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) 'a', 10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        double double28 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer29.setBaseURLGenerator(categoryURLGenerator30, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = null;
        statisticalBarRenderer29.setLegendItemURLGenerator(categorySeriesLabelGenerator33);
        boolean boolean35 = statisticalBarRenderer29.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = null;
        statisticalBarRenderer29.setPositiveItemLabelPositionFallback(itemLabelPosition36);
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.plot.Marker marker41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        statisticalBarRenderer29.drawRangeMarker(graphics2D38, categoryPlot39, valueAxis40, marker41, rectangle2D42);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer44.setBaseURLGenerator(categoryURLGenerator45, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator48 = null;
        statisticalBarRenderer44.setLegendItemURLGenerator(categorySeriesLabelGenerator48);
        boolean boolean50 = statisticalBarRenderer44.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer44.setBaseItemLabelsVisible(true);
        boolean boolean53 = statisticalBarRenderer44.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = statisticalBarRenderer44.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer44.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator61 = null;
        statisticalBarRenderer60.setBaseURLGenerator(categoryURLGenerator61, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator64 = null;
        statisticalBarRenderer60.setLegendItemURLGenerator(categorySeriesLabelGenerator64);
        boolean boolean66 = statisticalBarRenderer60.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = null;
        statisticalBarRenderer60.setPositiveItemLabelPositionFallback(itemLabelPosition67);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = statisticalBarRenderer60.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer44.setBaseNegativeItemLabelPosition(itemLabelPosition69);
        statisticalBarRenderer29.setBaseNegativeItemLabelPosition(itemLabelPosition69, true);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition69);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition69);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint6 = statisticalBarRenderer5.getBaseOutlinePaint();
        statisticalBarRenderer0.setBasePaint(paint6, false);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (byte) -1);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
        org.junit.Assert.assertNull(itemLabelPosition14);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        boolean boolean22 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 0);
        int int23 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer25.setSeriesOutlinePaint(10, paint27);
        java.awt.Stroke stroke30 = statisticalBarRenderer25.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = null;
        statisticalBarRenderer32.setLegendItemURLGenerator(categorySeriesLabelGenerator36);
        boolean boolean38 = statisticalBarRenderer32.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint40 = statisticalBarRenderer32.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer25.setSeriesOutlinePaint(0, paint40, false);
        double double43 = statisticalBarRenderer25.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer44.setBaseURLGenerator(categoryURLGenerator45);
        java.awt.Paint paint48 = statisticalBarRenderer44.lookupSeriesPaint((-1));
        statisticalBarRenderer25.setBaseFillPaint(paint48, true);
        java.awt.Paint paint52 = statisticalBarRenderer25.lookupSeriesPaint((int) (byte) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation53 = null;
        boolean boolean54 = statisticalBarRenderer25.removeAnnotation(categoryAnnotation53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = null;
        statisticalBarRenderer25.setBaseItemLabelGenerator(categoryItemLabelGenerator55, true);
        statisticalBarRenderer25.setBaseCreateEntities(false, false);
        java.awt.Stroke stroke61 = statisticalBarRenderer25.getErrorIndicatorStroke();
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke61);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        boolean boolean12 = statisticalBarRenderer8.getAutoPopulateSeriesStroke();
        statisticalBarRenderer8.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        java.awt.Shape shape21 = statisticalBarRenderer15.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        statisticalBarRenderer22.setIncludeBaseInRange(false);
        java.awt.Shape shape28 = statisticalBarRenderer22.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke31 = statisticalBarRenderer22.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer15.setBaseOutlineStroke(stroke31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer15.getPositiveItemLabelPosition((int) (byte) -1, (int) 'a');
        java.awt.Paint paint38 = statisticalBarRenderer15.getItemFillPaint(1, (int) (short) 1);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint38, false);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint38);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, false);
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent46 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent46);
        java.awt.Paint paint49 = statisticalBarRenderer0.getSeriesFillPaint(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer51.setBaseURLGenerator(categoryURLGenerator52, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = null;
        statisticalBarRenderer51.setLegendItemURLGenerator(categorySeriesLabelGenerator55);
        boolean boolean57 = statisticalBarRenderer51.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = null;
        statisticalBarRenderer51.setPositiveItemLabelPositionFallback(itemLabelPosition58);
        boolean boolean60 = statisticalBarRenderer51.getBaseCreateEntities();
        statisticalBarRenderer51.setBaseItemLabelsVisible(true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator63 = statisticalBarRenderer51.getLegendItemToolTipGenerator();
        java.awt.Paint paint66 = statisticalBarRenderer51.getItemLabelPaint(0, (int) (short) 0);
        statisticalBarRenderer0.setSeriesPaint(0, paint66);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator63);
        org.junit.Assert.assertNotNull(paint66);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Font font8 = statisticalBarRenderer0.getSeriesItemLabelFont((int) '4');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNull(itemLabelPosition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        java.lang.Boolean boolean40 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, (int) '#');
        java.awt.Stroke stroke45 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) '4');
        boolean boolean46 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer50.setSeriesOutlinePaint(10, paint52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = statisticalBarRenderer50.getBaseItemLabelGenerator();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer50.setBaseFillPaint(paint55);
        java.awt.Paint paint59 = statisticalBarRenderer50.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer50.setBaseSeriesVisibleInLegend(true, false);
        boolean boolean63 = statisticalBarRenderer50.getBaseCreateEntities();
        java.awt.Stroke stroke64 = statisticalBarRenderer50.getBaseStroke();
        statisticalBarRenderer0.setBaseOutlineStroke(stroke64);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint68 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer66.setSeriesOutlinePaint(10, paint68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator70 = statisticalBarRenderer66.getBaseItemLabelGenerator();
        java.awt.Paint paint71 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer66.setBaseFillPaint(paint71);
        java.awt.Paint paint74 = statisticalBarRenderer66.getSeriesItemLabelPaint((int) (byte) 1);
        java.awt.Paint paint75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer66.setBaseOutlinePaint(paint75);
        statisticalBarRenderer0.setBaseOutlinePaint(paint75, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNull(categoryItemLabelGenerator54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNull(categoryItemLabelGenerator70);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNull(paint74);
        org.junit.Assert.assertNotNull(paint75);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint45 = statisticalBarRenderer0.getItemPaint((int) (short) 100, (int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator47, true);
        double double50 = statisticalBarRenderer0.getBase();
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = statisticalBarRenderer0.hasListener(eventListener51);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) false);
        java.lang.Boolean boolean57 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) 'a');
        java.awt.Paint paint59 = statisticalBarRenderer0.getSeriesFillPaint((int) '4');
        double double60 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean61 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNull(paint59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2.0d + "'", double60 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        boolean boolean9 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 100, (java.lang.Boolean) true, true);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        statisticalBarRenderer6.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Shape shape19 = statisticalBarRenderer13.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke22 = statisticalBarRenderer13.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer6.setSeriesStroke((int) (short) 100, stroke22, false);
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setSeriesOutlineStroke(0, stroke26, true);
        statisticalBarRenderer6.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint31 = statisticalBarRenderer6.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBasePaint(paint31);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator33, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = null;
        statisticalBarRenderer37.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        boolean boolean43 = statisticalBarRenderer37.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = null;
        statisticalBarRenderer37.setPositiveItemLabelPositionFallback(itemLabelPosition44);
        boolean boolean46 = statisticalBarRenderer37.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        statisticalBarRenderer47.setBaseURLGenerator(categoryURLGenerator48, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = null;
        statisticalBarRenderer47.setLegendItemURLGenerator(categorySeriesLabelGenerator51);
        boolean boolean53 = statisticalBarRenderer47.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer47.setBaseItemLabelsVisible(true);
        boolean boolean56 = statisticalBarRenderer47.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer47.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer47.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        statisticalBarRenderer63.setBaseURLGenerator(categoryURLGenerator64, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = null;
        statisticalBarRenderer63.setLegendItemURLGenerator(categorySeriesLabelGenerator67);
        boolean boolean69 = statisticalBarRenderer63.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = null;
        statisticalBarRenderer63.setPositiveItemLabelPositionFallback(itemLabelPosition70);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition72 = statisticalBarRenderer63.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer47.setBaseNegativeItemLabelPosition(itemLabelPosition72);
        java.awt.Paint paint76 = statisticalBarRenderer47.getItemOutlinePaint((int) ' ', (int) (short) -1);
        statisticalBarRenderer37.setBasePaint(paint76, false);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 10, paint76);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator81 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) -1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition72);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNull(categoryURLGenerator81);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (short) -1);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        boolean boolean7 = statisticalBarRenderer0.isSeriesItemLabelsVisible(100);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) -1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = statisticalBarRenderer7.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseFillPaint(paint8);
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        boolean boolean12 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Stroke stroke19 = statisticalBarRenderer15.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer15.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setSeriesOutlinePaint(10, paint25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = statisticalBarRenderer23.getBaseItemLabelGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint28);
        java.awt.Paint paint32 = statisticalBarRenderer23.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer15.setBasePaint(paint32);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator36 = statisticalBarRenderer15.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = statisticalBarRenderer15.getSeriesURLGenerator((int) (byte) -1);
        java.awt.Paint paint39 = statisticalBarRenderer15.getBasePaint();
        java.awt.Paint paint41 = statisticalBarRenderer15.lookupSeriesPaint((int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 0, paint41);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer13);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryToolTipGenerator36);
        org.junit.Assert.assertNull(categoryURLGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator25, true);
        java.awt.Font font30 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        java.lang.Boolean boolean32 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator41 = null;
        statisticalBarRenderer40.setBaseURLGenerator(categoryURLGenerator41);
        java.awt.Stroke stroke44 = statisticalBarRenderer40.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer37.setBaseStroke(stroke44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = null;
        statisticalBarRenderer37.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator47, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        statisticalBarRenderer50.setBaseURLGenerator(categoryURLGenerator51, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = null;
        statisticalBarRenderer50.setLegendItemURLGenerator(categorySeriesLabelGenerator54);
        boolean boolean56 = statisticalBarRenderer50.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = null;
        statisticalBarRenderer50.setPositiveItemLabelPositionFallback(itemLabelPosition57);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator60 = null;
        statisticalBarRenderer59.setBaseURLGenerator(categoryURLGenerator60);
        java.awt.Stroke stroke63 = statisticalBarRenderer59.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer50.setErrorIndicatorStroke(stroke63);
        statisticalBarRenderer37.setBaseStroke(stroke63);
        statisticalBarRenderer0.setSeriesStroke(0, stroke63);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(stroke63);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Shape shape25 = statisticalBarRenderer19.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        statisticalBarRenderer26.setIncludeBaseInRange(false);
        java.awt.Shape shape32 = statisticalBarRenderer26.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke35 = statisticalBarRenderer26.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer19.setBaseOutlineStroke(stroke35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = null;
        statisticalBarRenderer37.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        boolean boolean43 = statisticalBarRenderer37.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = null;
        statisticalBarRenderer37.setPositiveItemLabelPositionFallback(itemLabelPosition44);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer37.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer19.setNegativeItemLabelPositionFallback(itemLabelPosition46);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition46, false);
        java.awt.Stroke stroke52 = statisticalBarRenderer0.getItemOutlineStroke((int) '4', (int) (short) 1);
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset59 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number62 = defaultStatisticalCategoryDataset59.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int63 = defaultStatisticalCategoryDataset59.getColumnCount();
        java.util.EventListener eventListener64 = null;
        boolean boolean65 = defaultStatisticalCategoryDataset59.hasListener(eventListener64);
        java.lang.Comparable comparable69 = null;
        defaultStatisticalCategoryDataset59.add((double) (-1.0f), (double) (byte) 1, (java.lang.Comparable) 1.0d, comparable69);
        java.util.List list71 = defaultStatisticalCategoryDataset59.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener72 = null;
        defaultStatisticalCategoryDataset59.removeChangeListener(datasetChangeListener72);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener74 = null;
        defaultStatisticalCategoryDataset59.removeChangeListener(datasetChangeListener74);
        double double77 = defaultStatisticalCategoryDataset59.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawItem(graphics2D53, categoryItemRendererState54, rectangle2D55, categoryPlot56, categoryAxis57, valueAxis58, (org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset59, 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNull(number62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double6 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        double double6 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator8);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, true);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getItemStroke((int) (short) -1, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getNegativeItemLabelPosition(10, (int) '4');
        double double19 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Paint paint4 = statisticalBarRenderer0.lookupSeriesPaint((-1));
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint5);
        java.awt.Font font9 = statisticalBarRenderer0.getItemLabelFont((int) '#', 0);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke11, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer14.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        statisticalBarRenderer14.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer14.getToolTipGenerator((int) '4', 1);
        int int24 = statisticalBarRenderer14.getColumnCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = statisticalBarRenderer14.getDrawingSupplier();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.LegendItem legendItem30 = statisticalBarRenderer14.getLegendItem((int) ' ', (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer14.getNegativeItemLabelPosition(100, 100);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition33);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(drawingSupplier25);
        org.junit.Assert.assertNull(legendItem30);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(10);
        statisticalBarRenderer0.setSeriesVisible((int) '4', (java.lang.Boolean) true, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesFillPaint(10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int15 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset11.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.Range range19 = statisticalBarRenderer0.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset11);
        java.awt.Paint paint21 = statisticalBarRenderer0.getSeriesOutlinePaint(0);
        int int22 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = statisticalBarRenderer24.getPlot();
        java.awt.Paint paint31 = statisticalBarRenderer24.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setSeriesOutlinePaint(10, paint34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = statisticalBarRenderer32.getBaseItemLabelGenerator();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint37);
        java.awt.Paint paint41 = statisticalBarRenderer32.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43);
        statisticalBarRenderer42.setIncludeBaseInRange(false);
        java.awt.Shape shape48 = statisticalBarRenderer42.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer32.setBaseShape(shape48, false);
        statisticalBarRenderer32.setMinimumBarLength((double) '4');
        boolean boolean53 = statisticalBarRenderer32.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = statisticalBarRenderer32.getPositiveItemLabelPosition((int) '4', (int) (byte) 1);
        statisticalBarRenderer24.setBaseNegativeItemLabelPosition(itemLabelPosition56, true);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition56);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(categoryPlot29);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition56);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        defaultStatisticalCategoryDataset0.add((double) 0.0f, (double) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1.0f));
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        double double21 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setMinimumBarLength((double) 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(1, categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint45 = statisticalBarRenderer0.getItemPaint((int) (short) 100, (int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator47, true);
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = statisticalBarRenderer0.getLegendItems();
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        java.lang.Boolean boolean18 = statisticalBarRenderer0.getSeriesVisible(1);
        java.awt.Paint paint21 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Paint paint17 = statisticalBarRenderer8.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBasePaint(paint17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) 100, (int) (short) 100);
        boolean boolean22 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Font font23 = null;
        statisticalBarRenderer0.setBaseItemLabelFont(font23, false);
        java.awt.Stroke stroke27 = statisticalBarRenderer0.lookupSeriesStroke(100);
        java.awt.Paint paint29 = statisticalBarRenderer0.getSeriesFillPaint(0);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(paint29);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke(100);
        boolean boolean8 = statisticalBarRenderer0.isSeriesVisibleInLegend(100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator9, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) 'a', 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator27);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator30);
        java.awt.Stroke stroke33 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) 'a');
        statisticalBarRenderer0.setBase((double) 0);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Stroke stroke14 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setSeriesOutlinePaint(10, paint20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer18.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Paint paint27 = statisticalBarRenderer18.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer10.setBasePaint(paint27);
        statisticalBarRenderer0.setSeriesItemLabelPaint(1, paint27);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true);
        java.awt.Paint paint35 = statisticalBarRenderer0.getItemPaint((int) ' ', (int) (byte) -1);
        boolean boolean38 = statisticalBarRenderer0.isItemLabelVisible(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        java.awt.Font font22 = statisticalBarRenderer0.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = statisticalBarRenderer0.getToolTipGenerator((-1), (int) '#');
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNull(categoryToolTipGenerator25);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer0.setBase((double) 0L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = null;
        statisticalBarRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        statisticalBarRenderer22.setIncludeBaseInRange(false);
        java.awt.Shape shape28 = statisticalBarRenderer22.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke31 = statisticalBarRenderer22.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer15.setSeriesStroke((int) (short) 100, stroke31, false);
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setSeriesOutlineStroke(0, stroke35, true);
        statisticalBarRenderer15.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint40 = statisticalBarRenderer15.getBaseItemLabelPaint();
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '4', paint40, false);
        org.jfree.chart.LegendItem legendItem45 = statisticalBarRenderer0.getLegendItem((int) (byte) 0, 1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke49 = statisticalBarRenderer0.getSeriesStroke(100);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(legendItem45);
        org.junit.Assert.assertNull(stroke49);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = statisticalBarRenderer0.getBaseItemLabelFont();
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        statisticalBarRenderer13.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint23 = statisticalBarRenderer13.getItemPaint((int) 'a', (int) (byte) 10);
        statisticalBarRenderer0.setBaseOutlinePaint(paint23);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = statisticalBarRenderer26.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29, false);
        java.awt.Font font32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer28.setBaseItemLabelFont(font32);
        statisticalBarRenderer26.setBaseItemLabelFont(font32);
        statisticalBarRenderer26.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = null;
        statisticalBarRenderer37.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        boolean boolean43 = statisticalBarRenderer37.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer37.setBaseItemLabelsVisible(true);
        java.awt.Paint paint46 = statisticalBarRenderer37.getBasePaint();
        statisticalBarRenderer26.setBasePaint(paint46, true);
        statisticalBarRenderer0.setSeriesItemLabelPaint(100, paint46);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Paint paint20 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int12 = defaultStatisticalCategoryDataset8.getColumnCount();
        double double14 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseStroke();
        boolean boolean11 = statisticalBarRenderer0.isSeriesVisible((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) '4');
        java.awt.Paint paint17 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) -1, (int) (byte) -1);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getPositiveItemLabelPosition(100, (int) (byte) 0);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer7.getBaseItemLabelGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint12);
        java.awt.Paint paint16 = statisticalBarRenderer7.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator18);
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Shape shape23 = statisticalBarRenderer17.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer7.setBaseShape(shape23, false);
        statisticalBarRenderer7.setMinimumBarLength((double) '4');
        boolean boolean29 = statisticalBarRenderer7.isSeriesItemLabelsVisible((int) (short) 0);
        java.awt.Stroke stroke31 = statisticalBarRenderer7.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke31);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double6 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable10 = null;
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex(comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(1, categoryItemLabelGenerator12);
        int int14 = statisticalBarRenderer0.getRowCount();
        java.awt.Paint paint16 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemOutlineStroke((-1), 100);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        boolean boolean12 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.plot.Marker marker16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D13, categoryPlot14, valueAxis15, marker16, rectangle2D17);
        java.awt.Paint paint20 = statisticalBarRenderer0.getSeriesPaint((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator13);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer7.getBaseItemLabelGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint12);
        java.awt.Paint paint16 = statisticalBarRenderer7.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator18);
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Shape shape23 = statisticalBarRenderer17.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer7.setBaseShape(shape23, false);
        statisticalBarRenderer7.setMinimumBarLength((double) '4');
        boolean boolean29 = statisticalBarRenderer7.isSeriesItemLabelsVisible((int) (short) 0);
        java.awt.Stroke stroke31 = statisticalBarRenderer7.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer35.setBaseURLGenerator(categoryURLGenerator36);
        java.awt.Paint paint39 = statisticalBarRenderer35.lookupSeriesPaint((-1));
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer35.setBaseItemLabelPaint(paint40);
        java.awt.Font font44 = statisticalBarRenderer35.getItemLabelFont((int) '#', 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = null;
        statisticalBarRenderer45.setBaseURLGenerator(categoryURLGenerator46);
        java.awt.Stroke stroke49 = statisticalBarRenderer45.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer45.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer53.setSeriesOutlinePaint(10, paint55);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = statisticalBarRenderer53.getBaseItemLabelGenerator();
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer53.setBaseFillPaint(paint58);
        java.awt.Paint paint62 = statisticalBarRenderer53.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer45.setBasePaint(paint62);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint62, false);
        java.awt.Stroke stroke67 = statisticalBarRenderer35.lookupSeriesStroke((int) (byte) 0);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke67);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(categoryItemLabelGenerator57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 100, (java.lang.Boolean) true, false);
        org.junit.Assert.assertNull(categoryURLGenerator7);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Paint paint4 = statisticalBarRenderer0.lookupSeriesPaint((-1));
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Shape shape33 = statisticalBarRenderer27.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        statisticalBarRenderer34.setIncludeBaseInRange(false);
        java.awt.Shape shape40 = statisticalBarRenderer34.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke43 = statisticalBarRenderer34.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer27.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke43);
        boolean boolean47 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setSeriesOutlinePaint(10, paint51);
        boolean boolean53 = statisticalBarRenderer49.getAutoPopulateSeriesStroke();
        statisticalBarRenderer49.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator57 = null;
        statisticalBarRenderer56.setBaseURLGenerator(categoryURLGenerator57);
        statisticalBarRenderer56.setIncludeBaseInRange(false);
        java.awt.Shape shape62 = statisticalBarRenderer56.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        statisticalBarRenderer63.setBaseURLGenerator(categoryURLGenerator64);
        statisticalBarRenderer63.setIncludeBaseInRange(false);
        java.awt.Shape shape69 = statisticalBarRenderer63.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke72 = statisticalBarRenderer63.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer56.setBaseOutlineStroke(stroke72);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition76 = statisticalBarRenderer56.getPositiveItemLabelPosition((int) (byte) -1, (int) 'a');
        java.awt.Paint paint79 = statisticalBarRenderer56.getItemFillPaint(1, (int) (short) 1);
        statisticalBarRenderer49.setBaseItemLabelPaint(paint79, false);
        statisticalBarRenderer0.setSeriesPaint(10, paint79, false);
        statisticalBarRenderer0.setSeriesVisible(100, (java.lang.Boolean) false);
        statisticalBarRenderer0.setDrawBarOutline(true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape69);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(itemLabelPosition76);
        org.junit.Assert.assertNotNull(paint79);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator7);
        java.awt.Shape shape10 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke11 = null;
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke11);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator18, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = null;
        statisticalBarRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Shape shape30 = statisticalBarRenderer24.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke33 = statisticalBarRenderer24.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer17.setSeriesStroke((int) (short) 100, stroke33, false);
        java.lang.Boolean boolean37 = statisticalBarRenderer17.getSeriesCreateEntities((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        statisticalBarRenderer38.setIncludeBaseInRange(false);
        statisticalBarRenderer38.setBaseSeriesVisibleInLegend(false, false);
        statisticalBarRenderer38.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        statisticalBarRenderer50.setBaseURLGenerator(categoryURLGenerator51, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = null;
        statisticalBarRenderer50.setLegendItemURLGenerator(categorySeriesLabelGenerator54);
        boolean boolean56 = statisticalBarRenderer50.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = null;
        statisticalBarRenderer50.setPositiveItemLabelPositionFallback(itemLabelPosition57);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer50.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer38.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition59, false);
        statisticalBarRenderer17.setBasePositiveItemLabelPosition(itemLabelPosition59);
        java.awt.Paint paint63 = statisticalBarRenderer17.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesPaint((int) (byte) 10, paint63);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator65 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNull(categoryToolTipGenerator65);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator6, false);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Stroke stroke12 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer0.setBase((double) 0L);
        java.lang.Boolean boolean15 = statisticalBarRenderer0.getSeriesCreateEntities((int) '4');
        java.awt.Shape shape18 = statisticalBarRenderer0.getItemShape(0, (int) (byte) 0);
        boolean boolean21 = statisticalBarRenderer0.getItemCreateEntity(0, 1);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setSeriesOutlinePaint(10, paint17);
        java.awt.Stroke stroke20 = statisticalBarRenderer15.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20);
        java.awt.Stroke stroke23 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 10);
        org.jfree.chart.LegendItem legendItem26 = statisticalBarRenderer0.getLegendItem((int) 'a', (int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 1, (int) (short) 0);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D30, categoryPlot31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItem26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer2.setBaseURLGenerator(categoryURLGenerator3, false);
        java.awt.Font font6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer2.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setBaseItemLabelFont(font6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 0);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        boolean boolean19 = statisticalBarRenderer0.getItemCreateEntity(10, 1);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = null;
        statisticalBarRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator22);
        boolean boolean24 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer18.setPositiveItemLabelPositionFallback(itemLabelPosition25);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer18.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition27);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 0);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean37 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) false);
        java.awt.Font font42 = statisticalBarRenderer0.getSeriesItemLabelFont(1);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 1, (java.lang.Boolean) true);
        java.awt.Stroke stroke46 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean47 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation48 = null;
        boolean boolean49 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation48);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(font42);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj19 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        boolean boolean11 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.LegendItem legendItem14 = statisticalBarRenderer0.getLegendItem((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(legendItem14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        java.awt.Paint paint27 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = null;
        statisticalBarRenderer28.setLegendItemURLGenerator(categorySeriesLabelGenerator32);
        boolean boolean34 = statisticalBarRenderer28.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint36 = statisticalBarRenderer28.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        statisticalBarRenderer37.setIncludeBaseInRange(false);
        java.awt.Shape shape43 = statisticalBarRenderer37.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer44.setBaseURLGenerator(categoryURLGenerator45);
        statisticalBarRenderer44.setIncludeBaseInRange(false);
        java.awt.Shape shape50 = statisticalBarRenderer44.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke53 = statisticalBarRenderer44.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer37.setBaseOutlineStroke(stroke53);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        statisticalBarRenderer55.setBaseURLGenerator(categoryURLGenerator56, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = null;
        statisticalBarRenderer55.setLegendItemURLGenerator(categorySeriesLabelGenerator59);
        boolean boolean61 = statisticalBarRenderer55.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = null;
        statisticalBarRenderer55.setPositiveItemLabelPositionFallback(itemLabelPosition62);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer55.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer37.setNegativeItemLabelPositionFallback(itemLabelPosition64);
        statisticalBarRenderer28.setBaseNegativeItemLabelPosition(itemLabelPosition64);
        java.lang.Boolean boolean68 = statisticalBarRenderer28.getSeriesItemLabelsVisible(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer28.getNegativeItemLabelPosition((int) (short) -1, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator73 = null;
        statisticalBarRenderer72.setBaseURLGenerator(categoryURLGenerator73, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator76 = null;
        statisticalBarRenderer72.setLegendItemURLGenerator(categorySeriesLabelGenerator76);
        boolean boolean78 = statisticalBarRenderer72.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint80 = statisticalBarRenderer72.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator81 = statisticalBarRenderer72.getLegendItemLabelGenerator();
        statisticalBarRenderer28.setLegendItemLabelGenerator(categorySeriesLabelGenerator81);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator81);
        java.awt.Stroke stroke85 = statisticalBarRenderer0.lookupSeriesStroke((int) (short) 100);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false);
        java.awt.Paint paint91 = statisticalBarRenderer0.getItemPaint((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition64);
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertNotNull(itemLabelPosition71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator81);
        org.junit.Assert.assertNotNull(stroke85);
        org.junit.Assert.assertNotNull(paint91);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.Marker marker13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D10, categoryPlot11, valueAxis12, marker13, rectangle2D14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean20 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean22 = statisticalBarRenderer0.isSeriesVisible((int) ' ');
        boolean boolean24 = statisticalBarRenderer0.isSeriesVisible((int) ' ');
        java.awt.Font font27 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, 1);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Stroke stroke20 = statisticalBarRenderer16.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer13.setBaseStroke(stroke20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator23, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        statisticalBarRenderer26.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint34 = statisticalBarRenderer26.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer13.setBaseOutlinePaint(paint34, false);
        statisticalBarRenderer0.setBasePaint(paint34, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = statisticalBarRenderer0.getDrawingSupplier();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Stroke stroke43 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 0);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(drawingSupplier39);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Stroke stroke20 = statisticalBarRenderer16.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer13.setBaseStroke(stroke20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator23, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        statisticalBarRenderer26.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint34 = statisticalBarRenderer26.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer13.setBaseOutlinePaint(paint34, false);
        statisticalBarRenderer0.setBasePaint(paint34, true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer39 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.awt.Paint paint40 = null;
        statisticalBarRenderer0.setBasePaint(paint40);
        boolean boolean42 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.util.Layer layer47 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D43, rectangle2D44, categoryAxis45, valueAxis46, layer47, plotRenderingInfo48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(gradientPaintTransformer39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = null;
        statisticalBarRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        statisticalBarRenderer22.setIncludeBaseInRange(false);
        java.awt.Shape shape28 = statisticalBarRenderer22.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke31 = statisticalBarRenderer22.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer15.setSeriesStroke((int) (short) 100, stroke31, false);
        java.lang.Boolean boolean35 = statisticalBarRenderer15.getSeriesCreateEntities((int) 'a');
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer15);
        java.awt.Paint paint38 = statisticalBarRenderer15.getSeriesFillPaint((int) (byte) -1);
        boolean boolean40 = statisticalBarRenderer15.isSeriesVisible((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = null;
        statisticalBarRenderer41.setLegendItemURLGenerator(categorySeriesLabelGenerator45);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = statisticalBarRenderer41.getSeriesURLGenerator((int) (byte) -1);
        statisticalBarRenderer41.setDrawBarOutline(false);
        java.awt.Shape shape53 = statisticalBarRenderer41.getItemShape((int) (short) 1, 0);
        statisticalBarRenderer15.setBaseShape(shape53);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(categoryURLGenerator48);
        org.junit.Assert.assertNotNull(shape53);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = statisticalBarRenderer0.getLegendItems();
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator8);
        java.awt.Paint paint11 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer12.setSeriesOutlinePaint(10, paint14);
        boolean boolean16 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        boolean boolean17 = statisticalBarRenderer12.getAutoPopulateSeriesOutlineStroke();
        boolean boolean20 = statisticalBarRenderer12.isItemLabelVisible((int) (short) 100, 0);
        int int21 = statisticalBarRenderer12.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Paint paint26 = statisticalBarRenderer22.lookupSeriesPaint((-1));
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer22.setBaseItemLabelPaint(paint27);
        statisticalBarRenderer12.setErrorIndicatorPaint(paint27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setSeriesOutlinePaint(10, paint33);
        boolean boolean35 = statisticalBarRenderer31.getAutoPopulateSeriesStroke();
        statisticalBarRenderer31.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer38.setBaseURLGenerator(categoryURLGenerator39, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = null;
        statisticalBarRenderer38.setLegendItemURLGenerator(categorySeriesLabelGenerator42);
        boolean boolean44 = statisticalBarRenderer38.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer38.setBaseItemLabelsVisible(true);
        boolean boolean47 = statisticalBarRenderer38.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = statisticalBarRenderer38.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer38.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = null;
        statisticalBarRenderer54.setBaseURLGenerator(categoryURLGenerator55, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = null;
        statisticalBarRenderer54.setLegendItemURLGenerator(categorySeriesLabelGenerator58);
        boolean boolean60 = statisticalBarRenderer54.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = null;
        statisticalBarRenderer54.setPositiveItemLabelPositionFallback(itemLabelPosition61);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = statisticalBarRenderer54.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer38.setBaseNegativeItemLabelPosition(itemLabelPosition63);
        statisticalBarRenderer31.setPositiveItemLabelPositionFallback(itemLabelPosition63);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator68 = null;
        statisticalBarRenderer67.setBaseURLGenerator(categoryURLGenerator68);
        java.awt.Stroke stroke71 = statisticalBarRenderer67.lookupSeriesOutlineStroke(100);
        boolean boolean74 = statisticalBarRenderer67.getItemVisible((int) (byte) 10, (-1));
        statisticalBarRenderer67.setBase(2.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer77 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator78 = null;
        statisticalBarRenderer77.setBaseURLGenerator(categoryURLGenerator78);
        statisticalBarRenderer77.setIncludeBaseInRange(false);
        boolean boolean83 = statisticalBarRenderer77.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator84 = statisticalBarRenderer77.getBaseToolTipGenerator();
        java.awt.Paint paint87 = statisticalBarRenderer77.getItemFillPaint((int) (short) 0, (int) '#');
        statisticalBarRenderer67.setBasePaint(paint87, false);
        statisticalBarRenderer31.setSeriesOutlinePaint(10, paint87, true);
        statisticalBarRenderer12.setSeriesPaint((int) (byte) 0, paint87, false);
        statisticalBarRenderer0.setBasePaint(paint87, true);
        boolean boolean96 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition50);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator84);
        org.junit.Assert.assertNotNull(paint87);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        boolean boolean14 = statisticalBarRenderer0.isSeriesVisible((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = statisticalBarRenderer15.getPlot();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer15.setBaseItemLabelGenerator(categoryItemLabelGenerator21);
        java.awt.Stroke stroke25 = statisticalBarRenderer15.getItemStroke((int) 'a', (int) (short) 100);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke25);
        java.awt.Shape shape28 = statisticalBarRenderer0.getSeriesShape((-1));
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryPlot20);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(shape28);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Shape shape22 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        boolean boolean22 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean8 = statisticalBarRenderer0.isItemLabelVisible((int) (short) 100, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition(1, (int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        statisticalBarRenderer12.setIncludeBaseInRange(false);
        boolean boolean18 = statisticalBarRenderer12.equals((java.lang.Object) 'a');
        java.awt.Stroke stroke20 = statisticalBarRenderer12.lookupSeriesOutlineStroke((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer12.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator21);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNull(categoryURLGenerator23);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        boolean boolean22 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 0);
        statisticalBarRenderer0.setItemMargin((double) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator26);
        statisticalBarRenderer0.setBase((double) (byte) 1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer0.setBase((double) 0L);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator15, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        statisticalBarRenderer19.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        boolean boolean25 = statisticalBarRenderer19.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint27 = statisticalBarRenderer19.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        statisticalBarRenderer28.setIncludeBaseInRange(false);
        java.awt.Shape shape34 = statisticalBarRenderer28.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer35.setBaseURLGenerator(categoryURLGenerator36);
        statisticalBarRenderer35.setIncludeBaseInRange(false);
        java.awt.Shape shape41 = statisticalBarRenderer35.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke44 = statisticalBarRenderer35.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer28.setBaseOutlineStroke(stroke44);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer46.setBaseURLGenerator(categoryURLGenerator47, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = null;
        statisticalBarRenderer46.setLegendItemURLGenerator(categorySeriesLabelGenerator50);
        boolean boolean52 = statisticalBarRenderer46.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = null;
        statisticalBarRenderer46.setPositiveItemLabelPositionFallback(itemLabelPosition53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer46.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer28.setNegativeItemLabelPositionFallback(itemLabelPosition55);
        statisticalBarRenderer19.setBaseNegativeItemLabelPosition(itemLabelPosition55);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition55);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator60 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator60);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        statisticalBarRenderer63.setBaseURLGenerator(categoryURLGenerator64, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = null;
        statisticalBarRenderer63.setLegendItemURLGenerator(categorySeriesLabelGenerator67);
        boolean boolean69 = statisticalBarRenderer63.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = null;
        statisticalBarRenderer63.setPositiveItemLabelPositionFallback(itemLabelPosition70);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator72 = statisticalBarRenderer63.getLegendItemURLGenerator();
        statisticalBarRenderer63.setBaseItemLabelsVisible(false, true);
        java.awt.Paint paint77 = statisticalBarRenderer63.lookupSeriesFillPaint((int) (short) 10);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint77, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator72);
        org.junit.Assert.assertNotNull(paint77);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double6 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer2.setBaseURLGenerator(categoryURLGenerator3, false);
        java.awt.Font font6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer2.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setBaseItemLabelFont(font6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 0);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator14);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 10, (-1));
        org.jfree.chart.LegendItem legendItem21 = statisticalBarRenderer0.getLegendItem((int) (short) 1, (int) (byte) 100);
        java.awt.Paint paint24 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItem21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer5 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(10, categoryURLGenerator7);
        java.awt.Shape shape11 = statisticalBarRenderer0.getItemShape((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(gradientPaintTransformer5);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint13);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getSeriesStroke((int) 'a');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) '4', categoryURLGenerator19, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(stroke17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        boolean boolean13 = statisticalBarRenderer0.isSeriesVisible(1);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = statisticalBarRenderer0.getLegendItems();
        java.awt.Font font15 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisible();
        boolean boolean10 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState16 = statisticalBarRenderer0.initialise(graphics2D11, rectangle2D12, categoryPlot13, 0, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        double double21 = statisticalBarRenderer0.getBase();
        boolean boolean23 = statisticalBarRenderer0.isSeriesVisibleInLegend(10);
        java.awt.Paint paint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseFillPaint(paint24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer4.setBaseURLGenerator(categoryURLGenerator5, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = null;
        statisticalBarRenderer4.setLegendItemURLGenerator(categorySeriesLabelGenerator8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setSeriesOutlinePaint(10, paint13);
        java.awt.Stroke stroke16 = statisticalBarRenderer11.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer4.setSeriesStroke((int) '#', stroke16);
        java.awt.Shape shape19 = statisticalBarRenderer4.lookupSeriesShape((-1));
        statisticalBarRenderer0.setBaseShape(shape19);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        double double24 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Shape shape11 = statisticalBarRenderer0.getSeriesShape((-1));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '#', (int) (byte) 10);
        double double13 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = statisticalBarRenderer0.getURLGenerator((int) (short) 1, 1);
        boolean boolean18 = statisticalBarRenderer0.isSeriesVisible(10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 100);
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer5.setBaseURLGenerator(categoryURLGenerator6, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        statisticalBarRenderer5.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        boolean boolean11 = statisticalBarRenderer5.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint13 = statisticalBarRenderer5.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Shape shape20 = statisticalBarRenderer14.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        statisticalBarRenderer21.setIncludeBaseInRange(false);
        java.awt.Shape shape27 = statisticalBarRenderer21.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke30 = statisticalBarRenderer21.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer14.setBaseOutlineStroke(stroke30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = null;
        statisticalBarRenderer32.setLegendItemURLGenerator(categorySeriesLabelGenerator36);
        boolean boolean38 = statisticalBarRenderer32.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer32.setPositiveItemLabelPositionFallback(itemLabelPosition39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer32.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer14.setNegativeItemLabelPositionFallback(itemLabelPosition41);
        statisticalBarRenderer5.setBaseNegativeItemLabelPosition(itemLabelPosition41);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer5.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator45);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = statisticalBarRenderer5.getLegendItemURLGenerator();
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.plot.Marker marker51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        statisticalBarRenderer5.drawRangeMarker(graphics2D48, categoryPlot49, valueAxis50, marker51, rectangle2D52);
        java.awt.Font font54 = statisticalBarRenderer5.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font54, false);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator47);
        org.junit.Assert.assertNotNull(font54);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Stroke stroke20 = statisticalBarRenderer16.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer13.setBaseStroke(stroke20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator23, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        statisticalBarRenderer26.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint34 = statisticalBarRenderer26.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer13.setBaseOutlinePaint(paint34, false);
        statisticalBarRenderer0.setBasePaint(paint34, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = statisticalBarRenderer0.getItemLabelGenerator((int) 'a', (int) 'a');
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator46, true);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(drawingSupplier39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator42);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '#', (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint45 = statisticalBarRenderer0.getItemPaint((int) (short) 100, (int) ' ');
        boolean boolean46 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(false, true);
        boolean boolean52 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        java.awt.Font font4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font4);
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        double double17 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((double) '4', 3.0d, (java.lang.Comparable) 10, (java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        int int12 = defaultStatisticalCategoryDataset0.getRowCount();
        double double14 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 0, (java.lang.Number) 1.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 10.0d);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) false);
        double double28 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        java.awt.Stroke stroke12 = statisticalBarRenderer7.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke12);
        double double14 = statisticalBarRenderer0.getLowerClip();
        double double15 = statisticalBarRenderer0.getItemMargin();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Paint paint20 = statisticalBarRenderer0.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer0.setMaximumBarWidth(1.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        defaultStatisticalCategoryDataset0.add((double) 0.0f, (double) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1.0f));
        defaultStatisticalCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultStatisticalCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = null;
        statisticalBarRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator22);
        boolean boolean24 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer18.setPositiveItemLabelPositionFallback(itemLabelPosition25);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer18.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition27);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setSeriesOutlinePaint(10, paint33);
        boolean boolean35 = statisticalBarRenderer31.getAutoPopulateSeriesStroke();
        boolean boolean36 = statisticalBarRenderer31.getAutoPopulateSeriesOutlineStroke();
        boolean boolean39 = statisticalBarRenderer31.isItemLabelVisible((int) (short) 100, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer31.getPositiveItemLabelPosition(1, (int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator44 = null;
        statisticalBarRenderer43.setBaseURLGenerator(categoryURLGenerator44);
        statisticalBarRenderer43.setIncludeBaseInRange(false);
        boolean boolean49 = statisticalBarRenderer43.equals((java.lang.Object) 'a');
        java.awt.Stroke stroke51 = statisticalBarRenderer43.lookupSeriesOutlineStroke((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer43.getLegendItemLabelGenerator();
        statisticalBarRenderer31.setLegendItemURLGenerator(categorySeriesLabelGenerator52);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNull(drawingSupplier55);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number5 = null;
        defaultStatisticalCategoryDataset0.add(number5, (java.lang.Number) 0.2d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultStatisticalCategoryDataset0.setGroup(datasetGroup11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'group' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint45 = statisticalBarRenderer0.getItemPaint((int) (short) 100, (int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator47, true);
        double double50 = statisticalBarRenderer0.getBase();
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = statisticalBarRenderer0.hasListener(eventListener51);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) false);
        java.lang.Boolean boolean57 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) 'a');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator58, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation61 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(boolean57);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemOutlineStroke((-1), 100);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        boolean boolean12 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator14);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        boolean boolean12 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertNull(stroke15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19);
        java.awt.Stroke stroke22 = statisticalBarRenderer18.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer15.setBaseStroke(stroke22);
        java.awt.Paint paint25 = statisticalBarRenderer15.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer15.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32);
        java.awt.Stroke stroke35 = statisticalBarRenderer31.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer28.setBaseStroke(stroke35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator38, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = null;
        statisticalBarRenderer41.setLegendItemURLGenerator(categorySeriesLabelGenerator45);
        boolean boolean47 = statisticalBarRenderer41.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint49 = statisticalBarRenderer41.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer28.setBaseOutlinePaint(paint49, false);
        statisticalBarRenderer15.setBasePaint(paint49, true);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint49);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator5, false);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke9);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19);
        java.awt.Stroke stroke22 = statisticalBarRenderer18.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer15.setBaseStroke(stroke22);
        java.awt.Paint paint25 = statisticalBarRenderer15.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer15.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32);
        java.awt.Stroke stroke35 = statisticalBarRenderer31.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer28.setBaseStroke(stroke35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator38, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = null;
        statisticalBarRenderer41.setLegendItemURLGenerator(categorySeriesLabelGenerator45);
        boolean boolean47 = statisticalBarRenderer41.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint49 = statisticalBarRenderer41.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer28.setBaseOutlinePaint(paint49, false);
        statisticalBarRenderer15.setBasePaint(paint49, true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer54 = statisticalBarRenderer15.getGradientPaintTransformer();
        java.awt.Paint paint55 = null;
        statisticalBarRenderer15.setBasePaint(paint55);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        statisticalBarRenderer57.setBaseURLGenerator(categoryURLGenerator58);
        statisticalBarRenderer57.setIncludeBaseInRange(false);
        boolean boolean63 = statisticalBarRenderer57.equals((java.lang.Object) 'a');
        java.awt.Stroke stroke65 = statisticalBarRenderer57.lookupSeriesOutlineStroke((int) ' ');
        java.awt.Shape shape66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer57.setBaseShape(shape66, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer69 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator70 = null;
        statisticalBarRenderer69.setBaseURLGenerator(categoryURLGenerator70);
        java.awt.Paint paint73 = statisticalBarRenderer69.lookupSeriesPaint((-1));
        java.awt.Paint paint74 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer69.setBaseItemLabelPaint(paint74);
        java.awt.Font font78 = statisticalBarRenderer69.getItemLabelFont((int) '#', 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition80 = statisticalBarRenderer69.getSeriesPositiveItemLabelPosition((int) (short) 1);
        statisticalBarRenderer57.setPositiveItemLabelPositionFallback(itemLabelPosition80);
        statisticalBarRenderer15.setBasePositiveItemLabelPosition(itemLabelPosition80);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition80);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(gradientPaintTransformer54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(font78);
        org.junit.Assert.assertNotNull(itemLabelPosition80);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number10 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.util.List list11 = defaultStatisticalCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset7.removeChangeListener(datasetChangeListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) ' ');
        int int17 = defaultStatisticalCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) 2.0d);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setSeriesOutlinePaint(10, paint12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer10.getBaseItemLabelGenerator();
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer10.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer10.setSeriesFillPaint((int) '#', paint23);
        statisticalBarRenderer0.setBasePaint(paint23, false);
        java.awt.Paint paint28 = statisticalBarRenderer0.lookupSeriesPaint((int) 'a');
        statisticalBarRenderer0.setItemMargin((double) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer31 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(gradientPaintTransformer31);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Paint paint4 = statisticalBarRenderer0.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, true);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemPaint(1, 0);
        java.awt.Paint paint12 = statisticalBarRenderer0.lookupSeriesOutlinePaint(100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.plot.Marker marker12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D9, categoryPlot10, valueAxis11, marker12, rectangle2D13);
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawOutline(graphics2D15, categoryPlot16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Shape shape9 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) true, false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer6.setIncludeBaseInRange(true);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer6.setSeriesItemLabelsVisible((int) (byte) 10, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer4.setBaseURLGenerator(categoryURLGenerator5, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = null;
        statisticalBarRenderer4.setLegendItemURLGenerator(categorySeriesLabelGenerator8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setSeriesOutlinePaint(10, paint13);
        java.awt.Stroke stroke16 = statisticalBarRenderer11.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer4.setSeriesStroke((int) '#', stroke16);
        java.awt.Shape shape19 = statisticalBarRenderer4.lookupSeriesShape((-1));
        statisticalBarRenderer0.setBaseShape(shape19);
        java.awt.Stroke stroke22 = statisticalBarRenderer0.getSeriesStroke((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer5.setBaseURLGenerator(categoryURLGenerator6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Stroke stroke12 = statisticalBarRenderer8.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer5.setBaseStroke(stroke12);
        java.awt.Paint paint15 = statisticalBarRenderer5.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer5.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        java.awt.Stroke stroke25 = statisticalBarRenderer21.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer18.setBaseStroke(stroke25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = null;
        statisticalBarRenderer18.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator28, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = null;
        statisticalBarRenderer31.setLegendItemURLGenerator(categorySeriesLabelGenerator35);
        boolean boolean37 = statisticalBarRenderer31.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint39 = statisticalBarRenderer31.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer18.setBaseOutlinePaint(paint39, false);
        statisticalBarRenderer5.setBasePaint(paint39, true);
        statisticalBarRenderer0.setBasePaint(paint39);
        boolean boolean45 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Shape shape33 = statisticalBarRenderer27.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        statisticalBarRenderer34.setIncludeBaseInRange(false);
        java.awt.Shape shape40 = statisticalBarRenderer34.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke43 = statisticalBarRenderer34.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer27.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) ' ', stroke43);
        boolean boolean47 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setSeriesOutlinePaint(10, paint51);
        boolean boolean53 = statisticalBarRenderer49.getAutoPopulateSeriesStroke();
        statisticalBarRenderer49.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator57 = null;
        statisticalBarRenderer56.setBaseURLGenerator(categoryURLGenerator57);
        statisticalBarRenderer56.setIncludeBaseInRange(false);
        java.awt.Shape shape62 = statisticalBarRenderer56.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        statisticalBarRenderer63.setBaseURLGenerator(categoryURLGenerator64);
        statisticalBarRenderer63.setIncludeBaseInRange(false);
        java.awt.Shape shape69 = statisticalBarRenderer63.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke72 = statisticalBarRenderer63.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer56.setBaseOutlineStroke(stroke72);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition76 = statisticalBarRenderer56.getPositiveItemLabelPosition((int) (byte) -1, (int) 'a');
        java.awt.Paint paint79 = statisticalBarRenderer56.getItemFillPaint(1, (int) (short) 1);
        statisticalBarRenderer49.setBaseItemLabelPaint(paint79, false);
        statisticalBarRenderer0.setSeriesPaint(10, paint79, false);
        statisticalBarRenderer0.setSeriesVisible(100, (java.lang.Boolean) false);
        statisticalBarRenderer0.setDrawBarOutline(true);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape69);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(itemLabelPosition76);
        org.junit.Assert.assertNotNull(paint79);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer5.setBaseURLGenerator(categoryURLGenerator6, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        statisticalBarRenderer5.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        boolean boolean11 = statisticalBarRenderer5.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer5.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer5.getBaseNegativeItemLabelPosition();
        java.awt.Font font16 = statisticalBarRenderer5.getSeriesItemLabelFont((int) (short) 100);
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        boolean boolean22 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D23, categoryPlot24, valueAxis25, rectangle2D26, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true, true);
        java.awt.Paint paint26 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 0);
        org.jfree.chart.LegendItem legendItem29 = statisticalBarRenderer0.getLegendItem((int) (byte) 0, 1);
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNull(legendItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        boolean boolean15 = statisticalBarRenderer0.isItemLabelVisible((int) '4', (int) (byte) -1);
        java.awt.Shape shape17 = statisticalBarRenderer0.getSeriesShape((int) (short) -1);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemLabelPaint((int) (byte) 1, (int) (byte) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Paint paint17 = statisticalBarRenderer8.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBasePaint(paint17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = statisticalBarRenderer0.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        java.awt.Stroke stroke28 = statisticalBarRenderer24.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint30 = statisticalBarRenderer29.getBaseOutlinePaint();
        statisticalBarRenderer24.setBasePaint(paint30, false);
        statisticalBarRenderer0.setBasePaint(paint30);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) false);
        java.awt.Font font38 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 100);
        statisticalBarRenderer0.setSeriesCreateEntities((int) '4', (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(font38);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        double double7 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = statisticalBarRenderer9.getBaseOutlinePaint();
        statisticalBarRenderer9.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer9.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer15.getErrorIndicatorStroke();
        boolean boolean20 = statisticalBarRenderer9.equals((java.lang.Object) statisticalBarRenderer15);
        statisticalBarRenderer15.setIncludeBaseInRange(true);
        java.awt.Font font25 = statisticalBarRenderer15.getItemLabelFont((int) (short) 10, 0);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (short) 100, font25);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.plot.Marker marker46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D43, categoryPlot44, valueAxis45, marker46, rectangle2D47);
        java.awt.Font font49 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(0, categoryToolTipGenerator53, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(itemLabelPosition50);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator51);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) '4', 1);
        int int10 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setMaximumBarWidth((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        java.awt.Stroke stroke17 = statisticalBarRenderer13.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer13.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setSeriesOutlinePaint(10, paint23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer21.getBaseItemLabelGenerator();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        java.awt.Paint paint30 = statisticalBarRenderer21.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer13.setBasePaint(paint30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = statisticalBarRenderer13.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = statisticalBarRenderer13.getSeriesURLGenerator((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        java.awt.Stroke stroke41 = statisticalBarRenderer37.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint43 = statisticalBarRenderer42.getBaseOutlinePaint();
        statisticalBarRenderer37.setBasePaint(paint43, false);
        statisticalBarRenderer13.setBasePaint(paint43);
        statisticalBarRenderer13.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition49, true);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke54 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseOutlineStroke(stroke54, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertNull(categoryURLGenerator36);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer5 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(0, categoryToolTipGenerator7, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(gradientPaintTransformer5);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        statisticalBarRenderer20.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        boolean boolean26 = statisticalBarRenderer20.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = null;
        statisticalBarRenderer20.setPositiveItemLabelPositionFallback(itemLabelPosition27);
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.plot.Marker marker32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        statisticalBarRenderer20.drawRangeMarker(graphics2D29, categoryPlot30, valueAxis31, marker32, rectangle2D33);
        double double35 = statisticalBarRenderer20.getLowerClip();
        java.awt.Stroke stroke37 = statisticalBarRenderer20.lookupSeriesStroke((int) ' ');
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke37);
        boolean boolean41 = statisticalBarRenderer0.isItemLabelVisible((int) (short) -1, (int) ' ');
        java.awt.Paint paint42 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer18.setBaseURLGenerator(categoryURLGenerator19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = null;
        statisticalBarRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator22);
        boolean boolean24 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer18.setPositiveItemLabelPositionFallback(itemLabelPosition25);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer18.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition27);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.LegendItem legendItem32 = statisticalBarRenderer0.getLegendItem((-1), 10);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNull(legendItem32);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Shape shape20 = statisticalBarRenderer14.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer7.setBaseOutlineStroke(stroke23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer7.getPositiveItemLabelPosition((int) (byte) -1, (int) 'a');
        java.awt.Paint paint30 = statisticalBarRenderer7.getItemFillPaint(1, (int) (short) 1);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint30, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer33.setBaseURLGenerator(categoryURLGenerator34, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = null;
        statisticalBarRenderer33.setLegendItemURLGenerator(categorySeriesLabelGenerator37);
        boolean boolean39 = statisticalBarRenderer33.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint41 = statisticalBarRenderer33.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer33.getNegativeItemLabelPosition((int) (short) 100, (int) '4');
        java.awt.Paint paint47 = statisticalBarRenderer33.getItemFillPaint((int) 'a', (int) (byte) 0);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint47);
        double double49 = statisticalBarRenderer0.getMaximumBarWidth();
        double double50 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) true, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setSeriesOutlinePaint(10, paint17);
        java.awt.Stroke stroke20 = statisticalBarRenderer15.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        statisticalBarRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        boolean boolean28 = statisticalBarRenderer22.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint30 = statisticalBarRenderer22.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer15.setSeriesOutlinePaint(0, paint30, false);
        double double33 = statisticalBarRenderer15.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        java.awt.Paint paint38 = statisticalBarRenderer34.lookupSeriesPaint((-1));
        statisticalBarRenderer15.setBaseFillPaint(paint38, true);
        java.awt.Paint paint42 = statisticalBarRenderer15.lookupSeriesPaint((int) (byte) 100);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint42);
        boolean boolean44 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) ' ');
        int int10 = defaultStatisticalCategoryDataset0.getColumnCount();
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Shape shape20 = statisticalBarRenderer14.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemOutlineStroke((-1), 100);
        java.awt.Stroke stroke25 = statisticalBarRenderer14.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke25);
        statisticalBarRenderer0.setSeriesVisible((int) '4', (java.lang.Boolean) false, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent31 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        boolean boolean35 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Shape shape8 = statisticalBarRenderer0.lookupSeriesShape(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        statisticalBarRenderer9.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint19 = statisticalBarRenderer9.getItemPaint((int) 'a', (int) (byte) 10);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint19);
        java.lang.Boolean boolean22 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Shape shape12 = statisticalBarRenderer0.getItemShape((int) (short) 1, 0);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(itemLabelPosition16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21);
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        java.awt.Shape shape26 = statisticalBarRenderer20.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke29 = statisticalBarRenderer20.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke29);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(1, categoryURLGenerator32, false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', (int) (byte) 100);
        boolean boolean22 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation23 = null;
        boolean boolean24 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation23);
        double double25 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.0d + "'", double25 == 2.0d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 100, (int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        java.awt.Paint paint17 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 1, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer18.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        double double22 = statisticalBarRenderer18.getItemLabelAnchorOffset();
        statisticalBarRenderer18.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer18.setBaseSeriesVisible(true, false);
        java.awt.Stroke stroke29 = statisticalBarRenderer18.lookupSeriesOutlineStroke((int) (short) 10);
        statisticalBarRenderer0.setBaseStroke(stroke29, true);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(paint33);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesFillPaint(10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number14 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int15 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list16 = defaultStatisticalCategoryDataset11.getRowKeys();
        int int18 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.Range range19 = statisticalBarRenderer0.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset11);
        java.awt.Stroke stroke20 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean8 = statisticalBarRenderer0.isItemLabelVisible((int) (short) 100, 0);
        int int9 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer10.lookupSeriesPaint((-1));
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseItemLabelPaint(paint15);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer19.setSeriesOutlinePaint(10, paint21);
        boolean boolean23 = statisticalBarRenderer19.getAutoPopulateSeriesStroke();
        statisticalBarRenderer19.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        statisticalBarRenderer26.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer26.setBaseItemLabelsVisible(true);
        boolean boolean35 = statisticalBarRenderer26.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer26.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer26.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        statisticalBarRenderer42.setBaseURLGenerator(categoryURLGenerator43, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = null;
        statisticalBarRenderer42.setLegendItemURLGenerator(categorySeriesLabelGenerator46);
        boolean boolean48 = statisticalBarRenderer42.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = null;
        statisticalBarRenderer42.setPositiveItemLabelPositionFallback(itemLabelPosition49);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = statisticalBarRenderer42.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer26.setBaseNegativeItemLabelPosition(itemLabelPosition51);
        statisticalBarRenderer19.setPositiveItemLabelPositionFallback(itemLabelPosition51);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        statisticalBarRenderer55.setBaseURLGenerator(categoryURLGenerator56);
        java.awt.Stroke stroke59 = statisticalBarRenderer55.lookupSeriesOutlineStroke(100);
        boolean boolean62 = statisticalBarRenderer55.getItemVisible((int) (byte) 10, (-1));
        statisticalBarRenderer55.setBase(2.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator66 = null;
        statisticalBarRenderer65.setBaseURLGenerator(categoryURLGenerator66);
        statisticalBarRenderer65.setIncludeBaseInRange(false);
        boolean boolean71 = statisticalBarRenderer65.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator72 = statisticalBarRenderer65.getBaseToolTipGenerator();
        java.awt.Paint paint75 = statisticalBarRenderer65.getItemFillPaint((int) (short) 0, (int) '#');
        statisticalBarRenderer55.setBasePaint(paint75, false);
        statisticalBarRenderer19.setSeriesOutlinePaint(10, paint75, true);
        statisticalBarRenderer0.setSeriesPaint((int) (byte) 0, paint75, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation82 = null;
        boolean boolean83 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation82);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition51);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator72);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (short) -1);
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities(0);
        statisticalBarRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer21.setBaseURLGenerator(categoryURLGenerator22, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        statisticalBarRenderer21.setLegendItemURLGenerator(categorySeriesLabelGenerator25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        statisticalBarRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        statisticalBarRenderer28.setIncludeBaseInRange(false);
        java.awt.Shape shape34 = statisticalBarRenderer28.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke37 = statisticalBarRenderer28.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer21.setSeriesStroke((int) (short) 100, stroke37, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        java.awt.Stroke stroke45 = statisticalBarRenderer41.getErrorIndicatorStroke();
        statisticalBarRenderer21.setSeriesStroke((int) (byte) 100, stroke45);
        java.awt.Font font47 = statisticalBarRenderer21.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint49 = statisticalBarRenderer48.getBaseOutlinePaint();
        java.awt.Graphics2D graphics2D50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = null;
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.plot.Marker marker53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        statisticalBarRenderer48.drawRangeMarker(graphics2D50, categoryPlot51, valueAxis52, marker53, rectangle2D54);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = statisticalBarRenderer48.getNegativeItemLabelPosition((int) ' ', (int) (byte) 10);
        statisticalBarRenderer21.setBasePositiveItemLabelPosition(itemLabelPosition58, false);
        java.awt.Paint paint63 = statisticalBarRenderer21.getItemOutlinePaint((-1), (int) (short) 100);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint63, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(itemLabelPosition58);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        double double6 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator8);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, true);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getItemStroke((int) (short) -1, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getNegativeItemLabelPosition(10, (int) '4');
        statisticalBarRenderer0.removeAnnotations();
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator25, true);
        java.awt.Font font30 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke35 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator6);
        double double8 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number5 = null;
        defaultStatisticalCategoryDataset0.add(number5, (java.lang.Number) 0.2d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number13 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int14 = defaultStatisticalCategoryDataset10.getColumnCount();
        double double16 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        java.awt.Stroke stroke24 = statisticalBarRenderer20.getErrorIndicatorStroke();
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 100, stroke24);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer29.setBaseURLGenerator(categoryURLGenerator30);
        java.awt.Stroke stroke33 = statisticalBarRenderer29.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer26.setBaseStroke(stroke33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer35.setBaseURLGenerator(categoryURLGenerator36);
        statisticalBarRenderer35.setIncludeBaseInRange(false);
        boolean boolean41 = statisticalBarRenderer35.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = statisticalBarRenderer35.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer35.getLegendItemLabelGenerator();
        statisticalBarRenderer26.setLegendItemToolTipGenerator(categorySeriesLabelGenerator43);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator43);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer46.setBaseURLGenerator(categoryURLGenerator47);
        java.awt.Paint paint50 = statisticalBarRenderer46.lookupSeriesPaint((-1));
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer46.setBaseItemLabelPaint(paint51);
        java.awt.Font font55 = statisticalBarRenderer46.getItemLabelFont((int) '#', 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator57 = null;
        statisticalBarRenderer56.setBaseURLGenerator(categoryURLGenerator57);
        java.awt.Stroke stroke60 = statisticalBarRenderer56.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = statisticalBarRenderer56.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer64 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer64.setSeriesOutlinePaint(10, paint66);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = statisticalBarRenderer64.getBaseItemLabelGenerator();
        java.awt.Paint paint69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer64.setBaseFillPaint(paint69);
        java.awt.Paint paint73 = statisticalBarRenderer64.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer56.setBasePaint(paint73);
        statisticalBarRenderer46.setBaseItemLabelPaint(paint73, false);
        java.awt.Stroke stroke78 = statisticalBarRenderer46.lookupSeriesStroke((int) (byte) 0);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke78, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator42);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNull(categoryItemLabelGenerator68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(stroke78);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer0.setBase((double) 0L);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator15, true);
        statisticalBarRenderer0.setMaximumBarWidth((double) 0L);
        boolean boolean20 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint7 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.Marker marker11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D8, categoryPlot9, valueAxis10, marker11, rectangle2D12);
        statisticalBarRenderer0.setMaximumBarWidth(0.0d);
        statisticalBarRenderer0.setItemMargin((double) 10L);
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultStatisticalCategoryDataset0.hasListener(eventListener5);
        java.lang.Comparable comparable10 = null;
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 1, (java.lang.Comparable) 1.0d, comparable10);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setMinimumBarLength((double) 100);
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemLabelPaint((int) (byte) 0, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesVisible((int) (short) 10);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setSeriesOutlinePaint(10, paint8);
        java.awt.Stroke stroke11 = statisticalBarRenderer6.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        statisticalBarRenderer13.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        boolean boolean19 = statisticalBarRenderer13.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint21 = statisticalBarRenderer13.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer6.setSeriesOutlinePaint(0, paint21, false);
        double double24 = statisticalBarRenderer6.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        java.awt.Paint paint29 = statisticalBarRenderer25.lookupSeriesPaint((-1));
        statisticalBarRenderer6.setBaseFillPaint(paint29, true);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) ' ', paint29);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = statisticalBarRenderer19.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent26);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 1);
        statisticalBarRenderer0.setBase((double) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryURLGenerator29);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator6, false);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible((-1));
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.LegendItem legendItem20 = statisticalBarRenderer0.getLegendItem(0, (int) (byte) 0);
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(legendItem20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        java.awt.Stroke stroke12 = statisticalBarRenderer7.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke12);
        java.awt.Shape shape15 = statisticalBarRenderer0.lookupSeriesShape((-1));
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent16 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent16);
        java.lang.Boolean boolean19 = statisticalBarRenderer0.getSeriesCreateEntities(0);
        boolean boolean20 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.lang.Boolean boolean22 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 1);
        java.awt.Stroke stroke23 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = null;
        statisticalBarRenderer24.setLegendItemURLGenerator(categorySeriesLabelGenerator28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setSeriesOutlinePaint(10, paint33);
        java.awt.Stroke stroke36 = statisticalBarRenderer31.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer24.setSeriesStroke((int) '#', stroke36);
        statisticalBarRenderer24.setBaseSeriesVisible(true);
        boolean boolean42 = statisticalBarRenderer24.getItemVisible((int) '4', (int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer44.setBaseURLGenerator(categoryURLGenerator45, false);
        java.awt.Font font48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer44.setBaseItemLabelFont(font48);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer51.setBaseURLGenerator(categoryURLGenerator52, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = null;
        statisticalBarRenderer51.setLegendItemURLGenerator(categorySeriesLabelGenerator55);
        boolean boolean57 = statisticalBarRenderer51.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer51.setBaseItemLabelsVisible(true);
        java.awt.Paint paint60 = statisticalBarRenderer51.getBasePaint();
        statisticalBarRenderer44.setSeriesOutlinePaint(0, paint60, false);
        statisticalBarRenderer24.setSeriesItemLabelPaint((int) (byte) 0, paint60);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint60, false);
        boolean boolean67 = statisticalBarRenderer0.isSeriesItemLabelsVisible(1);
        java.awt.Stroke stroke68 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        java.lang.Boolean boolean40 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        java.awt.Paint paint42 = statisticalBarRenderer0.lookupSeriesPaint(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        java.awt.Stroke stroke12 = statisticalBarRenderer7.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke12);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = statisticalBarRenderer0.getToolTipGenerator((int) '4', 10);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        java.awt.Stroke stroke29 = statisticalBarRenderer25.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer22.setBaseStroke(stroke29);
        java.awt.Paint paint32 = statisticalBarRenderer22.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer22.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer35.setBaseURLGenerator(categoryURLGenerator36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        java.awt.Stroke stroke42 = statisticalBarRenderer38.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer35.setBaseStroke(stroke42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = null;
        statisticalBarRenderer35.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator45, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator49 = null;
        statisticalBarRenderer48.setBaseURLGenerator(categoryURLGenerator49, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = null;
        statisticalBarRenderer48.setLegendItemURLGenerator(categorySeriesLabelGenerator52);
        boolean boolean54 = statisticalBarRenderer48.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint56 = statisticalBarRenderer48.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer35.setBaseOutlinePaint(paint56, false);
        statisticalBarRenderer22.setBasePaint(paint56, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = statisticalBarRenderer22.getDrawingSupplier();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = statisticalBarRenderer22.getItemLabelGenerator((int) 'a', (int) 'a');
        java.awt.Paint paint65 = statisticalBarRenderer22.getBaseItemLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesFillPaint((int) (short) -1, paint65, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(drawingSupplier61);
        org.junit.Assert.assertNull(categoryItemLabelGenerator64);
        org.junit.Assert.assertNotNull(paint65);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = statisticalBarRenderer7.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseFillPaint(paint8);
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        boolean boolean12 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) ' ');
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesFillPaint(100);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBasePaint();
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = statisticalBarRenderer0.getToolTipGenerator((int) (short) 100, 1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        double double21 = statisticalBarRenderer0.getBase();
        boolean boolean23 = statisticalBarRenderer0.isSeriesVisibleInLegend(10);
        boolean boolean24 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Paint paint25 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '#', (int) (byte) 10);
        java.lang.Boolean boolean14 = statisticalBarRenderer0.getSeriesVisible(10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator6, false);
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible((-1));
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.awt.Shape shape19 = statisticalBarRenderer0.lookupSeriesShape((int) ' ');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator21, false);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setSeriesOutlinePaint(10, paint9);
        java.awt.Stroke stroke12 = statisticalBarRenderer7.lookupSeriesStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke((int) '#', stroke12);
        double double14 = statisticalBarRenderer0.getLowerClip();
        double double15 = statisticalBarRenderer0.getItemMargin();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (byte) 100);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        statisticalBarRenderer20.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        boolean boolean26 = statisticalBarRenderer20.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = null;
        statisticalBarRenderer20.setPositiveItemLabelPositionFallback(itemLabelPosition27);
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.plot.Marker marker32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        statisticalBarRenderer20.drawRangeMarker(graphics2D29, categoryPlot30, valueAxis31, marker32, rectangle2D33);
        double double35 = statisticalBarRenderer20.getLowerClip();
        java.awt.Stroke stroke37 = statisticalBarRenderer20.lookupSeriesStroke((int) ' ');
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke37);
        boolean boolean41 = statisticalBarRenderer0.isItemLabelVisible((int) (short) -1, (int) ' ');
        java.awt.Shape shape43 = statisticalBarRenderer0.getSeriesShape(0);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(shape43);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        double double6 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer8.setBaseURLGenerator(categoryURLGenerator9, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = null;
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator12);
        boolean boolean14 = statisticalBarRenderer8.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer8.setBaseItemLabelsVisible(true);
        java.awt.Paint paint17 = statisticalBarRenderer8.getBasePaint();
        statisticalBarRenderer0.setBasePaint(paint17);
        java.awt.Paint paint20 = statisticalBarRenderer0.lookupSeriesPaint(0);
        statisticalBarRenderer0.setItemMargin((double) '4');
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemOutlinePaint((int) '#', (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer29.setBaseURLGenerator(categoryURLGenerator30);
        java.awt.Stroke stroke33 = statisticalBarRenderer29.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer26.setBaseStroke(stroke33);
        boolean boolean35 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint38 = statisticalBarRenderer26.getItemOutlinePaint((int) (byte) 100, (int) 'a');
        statisticalBarRenderer0.setBasePaint(paint38, false);
        java.awt.Stroke stroke42 = statisticalBarRenderer0.lookupSeriesOutlineStroke(10);
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        boolean boolean13 = statisticalBarRenderer0.isSeriesVisible(1);
        java.awt.Shape shape16 = statisticalBarRenderer0.getItemShape((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = statisticalBarRenderer1.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        java.awt.Stroke stroke17 = statisticalBarRenderer13.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer13.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setSeriesOutlinePaint(10, paint23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer21.getBaseItemLabelGenerator();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        java.awt.Paint paint30 = statisticalBarRenderer21.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer13.setBasePaint(paint30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = statisticalBarRenderer13.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        statisticalBarRenderer36.setBaseURLGenerator(categoryURLGenerator37);
        java.awt.Paint paint40 = statisticalBarRenderer36.lookupSeriesPaint((-1));
        statisticalBarRenderer36.setSeriesItemLabelsVisible(100, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer45.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke51 = statisticalBarRenderer45.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator54 = statisticalBarRenderer45.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = statisticalBarRenderer45.getPositiveItemLabelPosition((int) '#', (int) (byte) 10);
        double double58 = statisticalBarRenderer45.getMaximumBarWidth();
        java.awt.Paint paint61 = statisticalBarRenderer45.getItemLabelPaint((int) 'a', (int) (byte) 100);
        statisticalBarRenderer36.setSeriesItemLabelPaint((int) (byte) 1, paint61, false);
        statisticalBarRenderer13.setSeriesItemLabelPaint((int) '4', paint61, false);
        statisticalBarRenderer1.setBaseFillPaint(paint61);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator67 = null;
        statisticalBarRenderer1.setBaseURLGenerator(categoryURLGenerator67);
        statisticalBarRenderer1.setBaseCreateEntities(false);
        boolean boolean73 = statisticalBarRenderer1.getItemVisible(0, 100);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(categoryToolTipGenerator54);
        org.junit.Assert.assertNotNull(itemLabelPosition57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        double double7 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 100, (int) '#');
        java.awt.Paint paint12 = statisticalBarRenderer0.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseOutlinePaint(paint13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setSeriesOutlinePaint(10, paint22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer20.getBaseItemLabelGenerator();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint25);
        java.awt.Font font27 = statisticalBarRenderer20.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont(100, font27);
        java.awt.Paint paint29 = statisticalBarRenderer0.getBaseOutlinePaint();
        double double30 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean32 = statisticalBarRenderer0.isSeriesVisible((int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNull(itemLabelPosition35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = statisticalBarRenderer0.getItemLabelGenerator((int) ' ', (int) ' ');
        statisticalBarRenderer0.setBase((double) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator12);
        java.awt.Paint paint14 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number18 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) ' ');
        int int25 = defaultStatisticalCategoryDataset15.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, 3.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0.2d);
        org.jfree.data.Range range32 = statisticalBarRenderer0.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultStatisticalCategoryDataset15);
        double double34 = defaultStatisticalCategoryDataset15.getRangeUpperBound(false);
        int int36 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint45 = statisticalBarRenderer0.getItemPaint((int) (short) 100, (int) ' ');
        int int46 = statisticalBarRenderer0.getRowCount();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15, false);
        statisticalBarRenderer14.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false);
        statisticalBarRenderer14.setAutoPopulateSeriesStroke(true);
        boolean boolean23 = statisticalBarRenderer14.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer14.getLegendItemURLGenerator();
        double double25 = statisticalBarRenderer14.getMinimumBarLength();
        boolean boolean28 = statisticalBarRenderer14.isItemLabelVisible((-1), (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        statisticalBarRenderer30.setBaseURLGenerator(categoryURLGenerator31);
        statisticalBarRenderer30.setIncludeBaseInRange(false);
        java.awt.Shape shape36 = statisticalBarRenderer30.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer30.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) false, false);
        double double41 = statisticalBarRenderer30.getItemLabelAnchorOffset();
        java.awt.Paint paint44 = statisticalBarRenderer30.getItemOutlinePaint(0, 0);
        statisticalBarRenderer14.setSeriesPaint((int) (short) 10, paint44);
        statisticalBarRenderer0.setBaseFillPaint(paint44);
        java.awt.Font font49 = statisticalBarRenderer0.getItemLabelFont((int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2.0d + "'", double41 == 2.0d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(font49);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = statisticalBarRenderer0.getLegendItems();
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator8);
        java.awt.Paint paint11 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 100);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemFillPaint((int) (byte) -1, (int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke21 = statisticalBarRenderer15.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = statisticalBarRenderer15.getToolTipGenerator((int) (byte) -1, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer15.getPositiveItemLabelPosition((int) '#', (int) (byte) 10);
        double double28 = statisticalBarRenderer15.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer29.setBaseURLGenerator(categoryURLGenerator30);
        java.awt.Stroke stroke33 = statisticalBarRenderer29.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer29.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setSeriesOutlinePaint(10, paint39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = statisticalBarRenderer37.getBaseItemLabelGenerator();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint42);
        java.awt.Paint paint46 = statisticalBarRenderer37.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer29.setBasePaint(paint46);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator50 = statisticalBarRenderer29.getToolTipGenerator((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer29.getNegativeItemLabelPosition((int) '#', (int) (byte) 100);
        statisticalBarRenderer15.setBasePositiveItemLabelPosition(itemLabelPosition53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer15.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition55);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(categoryToolTipGenerator50);
        org.junit.Assert.assertNotNull(itemLabelPosition53);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number5 = null;
        defaultStatisticalCategoryDataset0.add(number5, (java.lang.Number) 0.2d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.equals(obj11);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer11.setBaseURLGenerator(categoryURLGenerator12, false);
        statisticalBarRenderer11.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false);
        statisticalBarRenderer11.setAutoPopulateSeriesStroke(true);
        boolean boolean20 = statisticalBarRenderer11.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer11.getLegendItemURLGenerator();
        double double22 = statisticalBarRenderer11.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        java.awt.Paint paint28 = statisticalBarRenderer24.lookupSeriesPaint((-1));
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer24.setBaseItemLabelPaint(paint29);
        java.awt.Font font33 = statisticalBarRenderer24.getItemLabelFont((int) '#', 0);
        java.awt.Paint paint34 = statisticalBarRenderer24.getBaseFillPaint();
        statisticalBarRenderer11.setSeriesOutlinePaint((int) 'a', paint34);
        statisticalBarRenderer0.setSeriesFillPaint((int) '4', paint34);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer2.setBaseURLGenerator(categoryURLGenerator3, false);
        java.awt.Font font6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer2.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, false);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = statisticalBarRenderer16.getPlot();
        java.awt.Stroke stroke24 = statisticalBarRenderer16.getItemStroke(100, (int) 'a');
        statisticalBarRenderer0.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(categoryPlot21);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesStroke(100);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = statisticalBarRenderer0.getLegendItems();
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator17, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        java.awt.Font font39 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean40 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) -1, (int) '#');
        java.awt.Graphics2D graphics2D44 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawOutline(graphics2D44, categoryPlot45, rectangle2D46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getPositiveItemLabelPosition(100, (int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer0.getLegendItemURLGenerator();
        boolean boolean14 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Font font17 = statisticalBarRenderer0.getItemLabelFont((int) '4', (int) (short) -1);
        statisticalBarRenderer0.setBase((double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = statisticalBarRenderer0.getSeriesURLGenerator(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setSeriesOutlinePaint(10, paint8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = statisticalBarRenderer6.getBaseItemLabelGenerator();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = statisticalBarRenderer13.getPlot();
        boolean boolean19 = statisticalBarRenderer6.equals((java.lang.Object) categoryPlot18);
        java.awt.Stroke stroke21 = statisticalBarRenderer6.getSeriesOutlineStroke((-1));
        java.awt.Shape shape24 = statisticalBarRenderer6.getItemShape((int) (short) -1, (int) '#');
        statisticalBarRenderer0.setBaseShape(shape24);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryPlot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        boolean boolean15 = statisticalBarRenderer9.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = statisticalBarRenderer9.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer9.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator17);
        boolean boolean19 = statisticalBarRenderer0.getBaseSeriesVisible();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) -1, (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Shape shape13 = statisticalBarRenderer7.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke16 = statisticalBarRenderer7.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke16, false);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke20, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator25, true);
        java.awt.Font font30 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke35 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 10, (int) (byte) 0);
        java.awt.Paint paint37 = statisticalBarRenderer0.getSeriesPaint((int) (short) 10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNull(paint37);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator19);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        java.awt.Paint paint24 = statisticalBarRenderer0.lookupSeriesPaint((int) 'a');
        boolean boolean25 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D43, categoryPlot44, valueAxis45, rectangle2D46, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categoryToolTipGenerator42);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = statisticalBarRenderer7.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseFillPaint(paint8);
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) false, true);
        statisticalBarRenderer0.setSeriesCreateEntities(100, (java.lang.Boolean) false, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer7.setBaseItemLabelsVisible(true);
        boolean boolean16 = statisticalBarRenderer7.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer7.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer7.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator24, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = null;
        statisticalBarRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator27);
        boolean boolean29 = statisticalBarRenderer23.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = null;
        statisticalBarRenderer23.setPositiveItemLabelPositionFallback(itemLabelPosition30);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer23.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer7.setBaseNegativeItemLabelPosition(itemLabelPosition32);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition32);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        statisticalBarRenderer36.setBaseURLGenerator(categoryURLGenerator37);
        java.awt.Stroke stroke40 = statisticalBarRenderer36.lookupSeriesOutlineStroke(100);
        boolean boolean43 = statisticalBarRenderer36.getItemVisible((int) (byte) 10, (-1));
        statisticalBarRenderer36.setBase(2.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        statisticalBarRenderer46.setBaseURLGenerator(categoryURLGenerator47);
        statisticalBarRenderer46.setIncludeBaseInRange(false);
        boolean boolean52 = statisticalBarRenderer46.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = statisticalBarRenderer46.getBaseToolTipGenerator();
        java.awt.Paint paint56 = statisticalBarRenderer46.getItemFillPaint((int) (short) 0, (int) '#');
        statisticalBarRenderer36.setBasePaint(paint56, false);
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint56, true);
        java.awt.Paint paint61 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator53);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean8 = statisticalBarRenderer0.isItemLabelVisible((int) (short) 100, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getPositiveItemLabelPosition(1, (int) (byte) 100);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator15);
        java.awt.Font font19 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 1, (int) '4');
        double double20 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        int int21 = statisticalBarRenderer0.getRowCount();
        statisticalBarRenderer0.setMinimumBarLength(2.0d);
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Stroke stroke14 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer7.setBaseStroke(stroke14);
        java.awt.Paint paint17 = statisticalBarRenderer7.lookupSeriesOutlinePaint((int) (short) -1);
        java.awt.Paint paint18 = statisticalBarRenderer7.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint18);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer20 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean23 = statisticalBarRenderer0.isItemLabelVisible(100, (int) (byte) 1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(gradientPaintTransformer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = statisticalBarRenderer0.getPlot();
        double double6 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer8.setBaseURLGenerator(categoryURLGenerator9, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = null;
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator12);
        boolean boolean14 = statisticalBarRenderer8.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer8.setBaseItemLabelsVisible(true);
        java.awt.Paint paint17 = statisticalBarRenderer8.getBasePaint();
        statisticalBarRenderer0.setBasePaint(paint17);
        java.awt.Paint paint20 = statisticalBarRenderer0.lookupSeriesPaint(0);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) false);
        boolean boolean25 = statisticalBarRenderer0.isSeriesVisible((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = statisticalBarRenderer26.getBaseOutlinePaint();
        statisticalBarRenderer26.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer26.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33, false);
        java.awt.Stroke stroke36 = statisticalBarRenderer32.getErrorIndicatorStroke();
        boolean boolean37 = statisticalBarRenderer26.equals((java.lang.Object) statisticalBarRenderer32);
        statisticalBarRenderer26.setBase((double) 0L);
        java.lang.Boolean boolean41 = statisticalBarRenderer26.getSeriesCreateEntities((int) '4');
        java.awt.Shape shape44 = statisticalBarRenderer26.getItemShape(0, (int) (byte) 0);
        statisticalBarRenderer0.setBaseShape(shape44, true);
        org.junit.Assert.assertNull(categoryPlot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke(100);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        java.awt.Stroke stroke5 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint15, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        statisticalBarRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Shape shape25 = statisticalBarRenderer19.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        statisticalBarRenderer26.setIncludeBaseInRange(false);
        java.awt.Shape shape32 = statisticalBarRenderer26.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke35 = statisticalBarRenderer26.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer19.setBaseOutlineStroke(stroke35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = null;
        statisticalBarRenderer37.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        boolean boolean43 = statisticalBarRenderer37.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = null;
        statisticalBarRenderer37.setPositiveItemLabelPositionFallback(itemLabelPosition44);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer37.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer19.setNegativeItemLabelPositionFallback(itemLabelPosition46);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(10, itemLabelPosition46);
        int int49 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint6 = statisticalBarRenderer5.getBaseOutlinePaint();
        statisticalBarRenderer0.setBasePaint(paint6, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        java.awt.Paint paint16 = statisticalBarRenderer12.lookupSeriesPaint((-1));
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer12.setBaseItemLabelPaint(paint17);
        java.awt.Font font21 = statisticalBarRenderer12.getItemLabelFont((int) '#', 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Stroke stroke26 = statisticalBarRenderer22.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer22.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setSeriesOutlinePaint(10, paint32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = statisticalBarRenderer30.getBaseItemLabelGenerator();
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseFillPaint(paint35);
        java.awt.Paint paint39 = statisticalBarRenderer30.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer22.setBasePaint(paint39);
        statisticalBarRenderer12.setBaseItemLabelPaint(paint39, false);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(itemLabelPosition44);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Stroke stroke20 = statisticalBarRenderer16.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer13.setBaseStroke(stroke20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator23, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer26.setBaseURLGenerator(categoryURLGenerator27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        statisticalBarRenderer26.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        boolean boolean32 = statisticalBarRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint34 = statisticalBarRenderer26.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer13.setBaseOutlinePaint(paint34, false);
        statisticalBarRenderer0.setBasePaint(paint34, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = statisticalBarRenderer0.getItemLabelGenerator((int) 'a', (int) 'a');
        java.awt.Stroke stroke43 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(drawingSupplier39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator42);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        statisticalBarRenderer6.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Shape shape19 = statisticalBarRenderer13.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke22 = statisticalBarRenderer13.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer6.setSeriesStroke((int) (short) 100, stroke22, false);
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setSeriesOutlineStroke(0, stroke26, true);
        statisticalBarRenderer6.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint31 = statisticalBarRenderer6.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBasePaint(paint31);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator33, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(1);
        java.awt.Stroke stroke38 = statisticalBarRenderer0.getErrorIndicatorStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer3.lookupSeriesOutlineStroke(100);
        statisticalBarRenderer0.setBaseStroke(stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape(100);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint6 = statisticalBarRenderer5.getBaseOutlinePaint();
        statisticalBarRenderer0.setBasePaint(paint6, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        java.awt.Paint paint16 = statisticalBarRenderer12.lookupSeriesPaint((-1));
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer12.setBaseItemLabelPaint(paint17);
        java.awt.Font font21 = statisticalBarRenderer12.getItemLabelFont((int) '#', 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Stroke stroke26 = statisticalBarRenderer22.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer22.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setSeriesOutlinePaint(10, paint32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = statisticalBarRenderer30.getBaseItemLabelGenerator();
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseFillPaint(paint35);
        java.awt.Paint paint39 = statisticalBarRenderer30.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer22.setBasePaint(paint39);
        statisticalBarRenderer12.setBaseItemLabelPaint(paint39, false);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint39);
        boolean boolean44 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = statisticalBarRenderer0.getSeriesURLGenerator((int) '4');
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(categoryURLGenerator46);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int8 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0L);
        int int12 = defaultStatisticalCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultStatisticalCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Stroke stroke14 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setSeriesOutlinePaint(10, paint20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer18.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Paint paint27 = statisticalBarRenderer18.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer10.setBasePaint(paint27);
        statisticalBarRenderer0.setSeriesItemLabelPaint(1, paint27);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true);
        java.awt.Stroke stroke34 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.lang.Boolean boolean37 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint40 = statisticalBarRenderer39.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer41.setBaseURLGenerator(categoryURLGenerator42, false);
        java.awt.Font font45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font45);
        statisticalBarRenderer39.setBaseItemLabelFont(font45);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator49 = statisticalBarRenderer39.getSeriesURLGenerator((int) (byte) 0);
        statisticalBarRenderer39.setIncludeBaseInRange(false);
        java.awt.Stroke stroke52 = statisticalBarRenderer39.getBaseOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) -1, stroke52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(stroke34);
        org.junit.Assert.assertNotNull(gradientPaintTransformer35);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNull(categoryURLGenerator49);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator8, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Shape shape20 = statisticalBarRenderer14.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer7.setSeriesStroke((int) (short) 100, stroke23, false);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer7.setSeriesOutlineStroke(0, stroke27, true);
        statisticalBarRenderer7.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint32 = statisticalBarRenderer7.getBaseItemLabelPaint();
        java.lang.Boolean boolean34 = statisticalBarRenderer7.getSeriesVisibleInLegend(0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer7.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        statisticalBarRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        java.awt.Stroke stroke41 = statisticalBarRenderer37.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer37.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer45.setSeriesOutlinePaint(10, paint47);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = statisticalBarRenderer45.getBaseItemLabelGenerator();
        java.awt.Paint paint50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer45.setBaseFillPaint(paint50);
        java.awt.Paint paint54 = statisticalBarRenderer45.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer37.setBasePaint(paint54);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator58 = statisticalBarRenderer37.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator59 = null;
        statisticalBarRenderer37.setBaseToolTipGenerator(categoryToolTipGenerator59, false);
        java.awt.Font font62 = statisticalBarRenderer37.getBaseItemLabelFont();
        statisticalBarRenderer7.setSeriesItemLabelFont((int) (byte) 1, font62);
        statisticalBarRenderer0.setSeriesItemLabelFont(0, font62);
        java.awt.Shape shape65 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseShape(shape65, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(categoryItemLabelGenerator49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNull(categoryToolTipGenerator58);
        org.junit.Assert.assertNotNull(font62);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Paint paint17 = statisticalBarRenderer8.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBasePaint(paint17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer19.setSeriesOutlinePaint(10, paint21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer19.getBaseItemLabelGenerator();
        java.awt.Shape shape25 = statisticalBarRenderer19.lookupSeriesShape((int) (short) 100);
        java.awt.Stroke stroke27 = statisticalBarRenderer19.lookupSeriesStroke((int) (byte) -1);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke27);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getSeriesStroke((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        java.lang.Boolean boolean33 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) -1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator22, true);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (short) 10);
        boolean boolean27 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint31 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean33 = statisticalBarRenderer0.getSeriesVisibleInLegend(10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener5);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getURLGenerator(10, (int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer11.setBaseURLGenerator(categoryURLGenerator12, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = null;
        statisticalBarRenderer11.setLegendItemURLGenerator(categorySeriesLabelGenerator15);
        boolean boolean17 = statisticalBarRenderer11.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint19 = statisticalBarRenderer11.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        statisticalBarRenderer20.setBaseURLGenerator(categoryURLGenerator21);
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        java.awt.Shape shape26 = statisticalBarRenderer20.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Shape shape33 = statisticalBarRenderer27.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke36 = statisticalBarRenderer27.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer20.setBaseOutlineStroke(stroke36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer38.setBaseURLGenerator(categoryURLGenerator39, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = null;
        statisticalBarRenderer38.setLegendItemURLGenerator(categorySeriesLabelGenerator42);
        boolean boolean44 = statisticalBarRenderer38.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = null;
        statisticalBarRenderer38.setPositiveItemLabelPositionFallback(itemLabelPosition45);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer38.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer20.setNegativeItemLabelPositionFallback(itemLabelPosition47);
        statisticalBarRenderer11.setBaseNegativeItemLabelPosition(itemLabelPosition47);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        statisticalBarRenderer11.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator51);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint56 = statisticalBarRenderer11.getItemPaint((int) (short) 100, (int) ' ');
        boolean boolean57 = statisticalBarRenderer11.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer58.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke64 = statisticalBarRenderer58.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint66 = statisticalBarRenderer65.getBaseOutlinePaint();
        statisticalBarRenderer58.setBaseFillPaint(paint66);
        boolean boolean68 = statisticalBarRenderer58.getBaseItemLabelsVisible();
        boolean boolean70 = statisticalBarRenderer58.isSeriesItemLabelsVisible((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer71 = statisticalBarRenderer58.getGradientPaintTransformer();
        statisticalBarRenderer11.setGradientPaintTransformer(gradientPaintTransformer71);
        boolean boolean73 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer74 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator75 = null;
        statisticalBarRenderer74.setBaseURLGenerator(categoryURLGenerator75);
        statisticalBarRenderer74.setIncludeBaseInRange(false);
        statisticalBarRenderer74.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator82 = statisticalBarRenderer74.getBaseURLGenerator();
        java.awt.Stroke stroke83 = statisticalBarRenderer74.getBaseStroke();
        statisticalBarRenderer11.setBaseOutlineStroke(stroke83);
        java.awt.Paint paint86 = statisticalBarRenderer11.getSeriesItemLabelPaint((-1));
        boolean boolean87 = statisticalBarRenderer11.isDrawBarOutline();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier88 = statisticalBarRenderer11.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator53);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(categoryURLGenerator82);
        org.junit.Assert.assertNotNull(stroke83);
        org.junit.Assert.assertNull(paint86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(drawingSupplier88);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        defaultStatisticalCategoryDataset0.add((double) 0.0f, (double) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1.0f));
        defaultStatisticalCategoryDataset0.validateObject();
        int int18 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer8.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Paint paint17 = statisticalBarRenderer8.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer0.setBasePaint(paint17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = statisticalBarRenderer0.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator22, false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        java.awt.Paint paint28 = statisticalBarRenderer0.getSeriesPaint(0);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemOutlinePaint((int) '#', (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setSeriesOutlinePaint(10, paint13);
        boolean boolean15 = statisticalBarRenderer11.getAutoPopulateSeriesStroke();
        boolean boolean16 = statisticalBarRenderer11.getAutoPopulateSeriesOutlineStroke();
        boolean boolean19 = statisticalBarRenderer11.isItemLabelVisible((int) (short) 100, 0);
        int int20 = statisticalBarRenderer11.getPassCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer11.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator21);
        java.awt.Paint paint24 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator25, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer2.setBaseURLGenerator(categoryURLGenerator3, false);
        java.awt.Font font6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer2.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setBaseItemLabelFont(font6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 0);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 100);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke(0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (byte) 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator9);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setSeriesOutlinePaint(10, paint3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer1.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer1.setBaseFillPaint(paint6);
        java.awt.Paint paint10 = statisticalBarRenderer1.getItemPaint((int) (byte) -1, 100);
        boolean boolean11 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) statisticalBarRenderer1);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemOutlinePaint((int) '#', (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setSeriesOutlinePaint(10, paint18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = statisticalBarRenderer16.getBaseItemLabelGenerator();
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (short) 100);
        java.awt.Paint paint23 = statisticalBarRenderer16.getBaseItemLabelPaint();
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.plot.Marker marker27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        statisticalBarRenderer16.drawRangeMarker(graphics2D24, categoryPlot25, valueAxis26, marker27, rectangle2D28);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.plot.Marker marker33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        statisticalBarRenderer16.drawRangeMarker(graphics2D30, categoryPlot31, valueAxis32, marker33, rectangle2D34);
        java.lang.Boolean boolean37 = statisticalBarRenderer16.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Shape shape38 = statisticalBarRenderer16.getBaseShape();
        boolean boolean39 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer16);
        int int40 = statisticalBarRenderer16.getPassCount();
        java.awt.Shape shape42 = statisticalBarRenderer16.getSeriesShape(100);
        java.awt.Paint paint45 = statisticalBarRenderer16.getItemPaint((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryToolTipGenerator15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        int int12 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        statisticalBarRenderer13.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        boolean boolean19 = statisticalBarRenderer13.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint21 = statisticalBarRenderer13.lookupSeriesPaint((int) (byte) 0);
        boolean boolean22 = statisticalBarRenderer13.getBaseSeriesVisible();
        statisticalBarRenderer13.setItemMargin(0.0d);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer13.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition25, true);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33);
        statisticalBarRenderer32.setIncludeBaseInRange(false);
        boolean boolean38 = statisticalBarRenderer32.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = statisticalBarRenderer32.getBaseToolTipGenerator();
        statisticalBarRenderer32.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer43.setSeriesOutlinePaint(10, paint45);
        java.awt.Stroke stroke48 = statisticalBarRenderer43.lookupSeriesStroke((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        statisticalBarRenderer50.setBaseURLGenerator(categoryURLGenerator51, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = null;
        statisticalBarRenderer50.setLegendItemURLGenerator(categorySeriesLabelGenerator54);
        boolean boolean56 = statisticalBarRenderer50.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint58 = statisticalBarRenderer50.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer43.setSeriesOutlinePaint(0, paint58, false);
        double double61 = statisticalBarRenderer43.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer62 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator63 = null;
        statisticalBarRenderer62.setBaseURLGenerator(categoryURLGenerator63);
        java.awt.Paint paint66 = statisticalBarRenderer62.lookupSeriesPaint((-1));
        statisticalBarRenderer43.setBaseFillPaint(paint66, true);
        java.awt.Paint paint70 = statisticalBarRenderer43.lookupSeriesPaint((int) (byte) 100);
        java.awt.Paint paint71 = statisticalBarRenderer43.getErrorIndicatorPaint();
        statisticalBarRenderer32.setSeriesPaint((int) (short) 0, paint71, false);
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint71);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator39);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(paint71);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Object obj4 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer0.hasListener(eventListener14);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape(1, (int) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getURLGenerator(10, (int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setSeriesOutlinePaint(10, paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer14.getBaseItemLabelGenerator();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint19);
        java.awt.Paint paint22 = statisticalBarRenderer14.getSeriesItemLabelPaint((int) (byte) 1);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseOutlinePaint(paint23);
        statisticalBarRenderer14.setBaseItemLabelsVisible(true, true);
        java.awt.Paint paint28 = statisticalBarRenderer14.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint28, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        statisticalBarRenderer32.setBaseURLGenerator(categoryURLGenerator33, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = null;
        statisticalBarRenderer32.setLegendItemURLGenerator(categorySeriesLabelGenerator36);
        boolean boolean38 = statisticalBarRenderer32.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer32.setPositiveItemLabelPositionFallback(itemLabelPosition39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer32.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer32.getBasePositiveItemLabelPosition();
        org.jfree.chart.LegendItemCollection legendItemCollection43 = statisticalBarRenderer32.getLegendItems();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer44.setSeriesOutlinePaint(10, paint46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = statisticalBarRenderer44.getBaseItemLabelGenerator();
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer44.setBaseFillPaint(paint49);
        java.awt.Font font51 = statisticalBarRenderer44.getBaseItemLabelFont();
        statisticalBarRenderer32.setBaseItemLabelFont(font51, false);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) ' ', font51, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(categoryURLGenerator13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertNotNull(legendItemCollection43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(categoryItemLabelGenerator48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(font51);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer7 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer7);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator9);
        int int11 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setBaseSeriesVisible(false, true);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getItemStroke((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer10.lookupSeriesPaint((-1));
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 1, paint14, true);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator19, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator24, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = null;
        statisticalBarRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator27);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = statisticalBarRenderer23.getSeriesURLGenerator((int) (byte) -1);
        statisticalBarRenderer23.setDrawBarOutline(false);
        statisticalBarRenderer23.setBaseCreateEntities(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer23.getSeriesNegativeItemLabelPosition((int) '#');
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) 100, itemLabelPosition36, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator30);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categoryItemLabelGenerator40);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Shape shape15 = statisticalBarRenderer9.lookupSeriesShape((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Shape shape22 = statisticalBarRenderer16.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer9.setBaseOutlineStroke(stroke25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer27.setLegendItemURLGenerator(categorySeriesLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition36);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator40);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.plot.Marker marker46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D43, categoryPlot44, valueAxis45, marker46, rectangle2D47);
        java.awt.Font font49 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint54 = statisticalBarRenderer0.getItemLabelPaint((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(itemLabelPosition50);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.plot.Marker marker12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D9, categoryPlot10, valueAxis11, marker12, rectangle2D13);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer15.setBaseURLGenerator(categoryURLGenerator16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = null;
        statisticalBarRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator19);
        boolean boolean21 = statisticalBarRenderer15.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer15.setBaseItemLabelsVisible(true);
        boolean boolean24 = statisticalBarRenderer15.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer15.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer15.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer31.setBaseURLGenerator(categoryURLGenerator32, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = null;
        statisticalBarRenderer31.setLegendItemURLGenerator(categorySeriesLabelGenerator35);
        boolean boolean37 = statisticalBarRenderer31.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = null;
        statisticalBarRenderer31.setPositiveItemLabelPositionFallback(itemLabelPosition38);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer31.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer15.setBaseNegativeItemLabelPosition(itemLabelPosition40);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition40, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator44);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNull(itemLabelPosition46);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (byte) 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Stroke stroke10 = statisticalBarRenderer0.lookupSeriesStroke((int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator12);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getSeriesURLGenerator((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = statisticalBarRenderer0.getURLGenerator(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(categoryURLGenerator18);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator5, false);
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke9);
        double double11 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        java.awt.Paint paint16 = statisticalBarRenderer0.getItemOutlinePaint(100, (int) '4');
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        statisticalBarRenderer2.setBaseURLGenerator(categoryURLGenerator3, false);
        java.awt.Font font6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer2.setBaseItemLabelFont(font6);
        statisticalBarRenderer0.setBaseItemLabelFont(font6);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setSeriesOutlinePaint(10, paint12);
        boolean boolean14 = statisticalBarRenderer10.getAutoPopulateSeriesStroke();
        statisticalBarRenderer10.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer17.setBaseURLGenerator(categoryURLGenerator18, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = null;
        statisticalBarRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator21);
        boolean boolean23 = statisticalBarRenderer17.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer17.setBaseItemLabelsVisible(true);
        boolean boolean26 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer17.getPositiveItemLabelPosition(100, (int) (byte) 0);
        statisticalBarRenderer17.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer33.setBaseURLGenerator(categoryURLGenerator34, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = null;
        statisticalBarRenderer33.setLegendItemURLGenerator(categorySeriesLabelGenerator37);
        boolean boolean39 = statisticalBarRenderer33.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = null;
        statisticalBarRenderer33.setPositiveItemLabelPositionFallback(itemLabelPosition40);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer33.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer17.setBaseNegativeItemLabelPosition(itemLabelPosition42);
        statisticalBarRenderer10.setPositiveItemLabelPositionFallback(itemLabelPosition42);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition42);
        boolean boolean46 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer47.setSeriesOutlinePaint(10, paint49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = statisticalBarRenderer47.getBaseItemLabelGenerator();
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer47.setBaseFillPaint(paint52);
        java.awt.Paint paint56 = statisticalBarRenderer47.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        statisticalBarRenderer57.setBaseURLGenerator(categoryURLGenerator58);
        statisticalBarRenderer57.setIncludeBaseInRange(false);
        java.awt.Shape shape63 = statisticalBarRenderer57.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer47.setBaseShape(shape63, false);
        statisticalBarRenderer0.setBaseShape(shape63);
        boolean boolean67 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryItemLabelGenerator51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean8 = statisticalBarRenderer0.isItemLabelVisible((int) (short) 100, 0);
        boolean boolean9 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) -1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Shape shape16 = statisticalBarRenderer10.lookupSeriesShape((int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape16, false);
        statisticalBarRenderer0.setMinimumBarLength((double) '4');
        double double21 = statisticalBarRenderer0.getBase();
        boolean boolean23 = statisticalBarRenderer0.isSeriesVisibleInLegend(10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) -1, categoryToolTipGenerator25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer6.getErrorIndicatorStroke();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer6);
        statisticalBarRenderer0.setBase((double) 0L);
        boolean boolean14 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryURLGenerator15);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        java.awt.Paint paint14 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 1, categoryURLGenerator16, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = statisticalBarRenderer0.getItemLabelGenerator(1, (int) ' ');
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean6 = statisticalBarRenderer0.equals((java.lang.Object) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Stroke stroke14 = statisticalBarRenderer10.lookupSeriesOutlineStroke(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getNegativeItemLabelPosition(100, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setSeriesOutlinePaint(10, paint20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer18.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Paint paint27 = statisticalBarRenderer18.getItemPaint((int) (byte) -1, 100);
        statisticalBarRenderer10.setBasePaint(paint27);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = statisticalBarRenderer10.getToolTipGenerator((int) 'a', 10);
        java.awt.Paint paint32 = statisticalBarRenderer10.getBaseFillPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint32, true);
        java.awt.Shape shape35 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke37 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(categoryToolTipGenerator31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator1 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint6 = statisticalBarRenderer5.getBaseOutlinePaint();
        statisticalBarRenderer0.setBasePaint(paint6, false);
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator12);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint2);
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer6.setBaseURLGenerator(categoryURLGenerator7, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        statisticalBarRenderer6.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer13.setBaseURLGenerator(categoryURLGenerator14);
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Shape shape19 = statisticalBarRenderer13.lookupSeriesShape((int) (byte) 10);
        java.awt.Stroke stroke22 = statisticalBarRenderer13.getItemOutlineStroke((-1), 100);
        statisticalBarRenderer6.setSeriesStroke((int) (short) 100, stroke22, false);
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setSeriesOutlineStroke(0, stroke26, true);
        statisticalBarRenderer6.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint31 = statisticalBarRenderer6.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBasePaint(paint31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator34);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator36);
    }
}

