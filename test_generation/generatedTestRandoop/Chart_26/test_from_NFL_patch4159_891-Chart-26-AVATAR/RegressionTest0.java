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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot7.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 0, (int) '4', plotRenderingInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setColumnRenderingOrder(sortOrder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 100, (int) (byte) 0, plotRenderingInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = categoryPlot0.removeAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setColumnRenderingOrder(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 10, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.plot.Marker marker3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Stroke stroke18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlineStroke(stroke18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        org.jfree.chart.plot.CategoryMarker categoryMarker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot8.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo13, point2D14);
        categoryPlot8.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getDomainAxisEdge((int) '4');
        categoryPlot18.setAnchorValue((double) (short) 1);
        double double25 = categoryPlot18.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot26 = categoryPlot18.getRootPlot();
        double double27 = categoryPlot18.getRangeCrosshairValue();
        categoryPlot8.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot8.getInsets();
        categoryPlot0.setInsets(rectangleInsets29);
        org.jfree.chart.plot.CategoryMarker categoryMarker31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (short) -1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 100, categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder30);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = categoryPlot0.removeAnnotation(categoryAnnotation32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(sortOrder30);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.plot.CategoryMarker categoryMarker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 0, categoryMarker22, layer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean22 = categoryPlot13.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot13.setDomainAxis((int) (short) 0, categoryAxis24);
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation26);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.Point2D point2D31 = null;
        org.jfree.chart.plot.PlotState plotState32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D29, rectangle2D30, point2D31, plotState32, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        float float9 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(1, 0, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        java.awt.Paint paint4 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(100, marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation((int) (short) 10);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        org.jfree.chart.axis.ValueAxis valueAxis5 = categoryPlot0.getRangeAxis();
        java.lang.Class<?> wildcardClass6 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo10, point2D11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot5.getRenderer();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(1, (int) '4', plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D2, rectangle2D3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        float float6 = plot5.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot12.getRenderer((int) '4');
        java.util.List list15 = categoryPlot12.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot12.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection16);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = categoryPlot0.removeAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(100, (int) (byte) 0, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDataset((-1), categoryDataset16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] { valueAxis15 };
        categoryPlot12.setRangeAxes(valueAxisArray16);
        categoryPlot12.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot12.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot12.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot12.getRangeAxisLocation((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation((int) (short) 10);
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge9 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation7, plotOrientation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = categoryPlot0.removeAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        float float9 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) -1, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot20.setInsets(rectangleInsets21);
        java.awt.Stroke stroke23 = categoryPlot20.getRangeGridlineStroke();
        categoryPlot20.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot20.getRangeAxisLocation((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePaint(paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke6 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        categoryPlot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray8 = new org.jfree.chart.axis.ValueAxis[] { valueAxis7 };
        categoryPlot4.setRangeAxes(valueAxisArray8);
        categoryPlot4.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean13 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot4.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation14, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray17);
        java.lang.Class<?> wildcardClass19 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(valueAxisArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot10.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean19 = categoryPlot10.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot10.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(drawingSupplier22);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        int int13 = categoryPlot0.getDatasetCount();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 0, 100, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis((int) (byte) 10);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(categoryAxis10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot8.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo13, point2D14);
        categoryPlot8.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getDomainAxisEdge((int) '4');
        categoryPlot18.setAnchorValue((double) (short) 1);
        double double25 = categoryPlot18.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot26 = categoryPlot18.getRootPlot();
        double double27 = categoryPlot18.getRangeCrosshairValue();
        categoryPlot8.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot8.getInsets();
        categoryPlot0.setInsets(rectangleInsets29);
        float float31 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Image image10 = null;
        categoryPlot7.setBackgroundImage(image10);
        boolean boolean12 = categoryPlot7.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot13.setInsets(rectangleInsets14);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot18.getRangeAxisLocation();
        categoryPlot13.setDomainAxisLocation(axisLocation23, false);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot13.getRangeAxisLocation();
        categoryPlot7.setDomainAxisLocation(axisLocation26, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.AxisLocation axisLocation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot0.removeAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets11, true);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint14 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Stroke stroke15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlineStroke(stroke15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray13);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] { valueAxis19 };
        categoryPlot16.setRangeAxes(valueAxisArray20);
        categoryPlot16.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str25 = categoryPlot16.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot26.markerChanged(markerChangeEvent27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray30 = new org.jfree.chart.axis.ValueAxis[] { valueAxis29 };
        categoryPlot26.setRangeAxes(valueAxisArray30);
        categoryPlot26.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean35 = categoryPlot26.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot26.getDomainAxisLocation();
        categoryPlot16.setRangeAxisLocation(axisLocation36);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(axisLocation36);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis();
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot13.setRenderer(categoryItemRenderer20);
        java.awt.Paint paint22 = categoryPlot13.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint22);
        int int24 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, plotRenderingInfo26, point2D27);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean18 = categoryPlot0.isDomainZoomable();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray13);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot0.removeAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        java.lang.Object obj10 = categoryPlot0.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot0.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 0, valueAxis8, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        java.util.List list15 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        categoryPlot1.markerChanged(markerChangeEvent2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] { valueAxis4 };
        categoryPlot1.setRangeAxes(valueAxisArray5);
        categoryPlot1.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot1.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot1.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge14 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        float float6 = categoryPlot0.getForegroundAlpha();
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis9, false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        categoryPlot1.markerChanged(markerChangeEvent2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] { valueAxis4 };
        categoryPlot1.setRangeAxes(valueAxisArray5);
        categoryPlot1.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean10 = categoryPlot1.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot1.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot1.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge13 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(plotOrientation12);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot13.setRenderer(categoryItemRenderer20);
        java.awt.Paint paint22 = categoryPlot13.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint22);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxes(categoryAxisArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot0.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = categoryDataset13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = null;
        categoryPlot12.setFixedLegendItems(legendItemCollection15);
        java.lang.Object obj17 = categoryPlot12.clone();
        categoryPlot12.clearDomainMarkers(100);
        org.jfree.chart.plot.Plot plot20 = categoryPlot12.getRootPlot();
        categoryPlot12.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot12.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder23);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(sortOrder23);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(categoryAxis13);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) '4');
        boolean boolean9 = categoryPlot0.isSubplot();
        categoryPlot0.setAnchorValue((-1.0d));
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean22 = categoryPlot13.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot13.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot15.setInsets(rectangleInsets16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot15.setFixedLegendItems(legendItemCollection18);
        java.awt.Paint paint20 = categoryPlot15.getNoDataMessagePaint();
        categoryPlot14.setBackgroundPaint(paint20);
        categoryPlot8.setRangeCrosshairPaint(paint20);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot8.getRangeMarkers(10, layer24);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot8.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor26);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(categoryAnchor26);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        java.awt.Paint paint6 = categoryPlot0.getOutlinePaint();
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean22 = categoryPlot13.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot13.setDomainAxis((int) (short) 0, categoryAxis24);
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation26);
        float float28 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        categoryPlot0.setAnchorValue((double) 10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        categoryPlot0.setRangeCrosshairValue((double) 1, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Stroke stroke5 = categoryPlot4.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        categoryPlot0.addChangeListener(plotChangeListener6);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (byte) 1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        java.awt.Paint paint17 = categoryPlot0.getBackgroundPaint();
        java.awt.Stroke stroke18 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset20);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo10, point2D11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot5.getRenderer();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        boolean boolean16 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        categoryPlot17.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        categoryPlot17.addChangeListener(plotChangeListener21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = categoryPlot17.getFixedRangeAxisSpace();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder24 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder24);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(axisSpace23);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis10, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(legendItemCollection8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        float float6 = categoryPlot0.getForegroundAlpha();
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint9 = plot8.getOutlinePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.Marker marker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        boolean boolean10 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) '4', marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot0.getDatasetGroup();
        boolean boolean7 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot8.setDomainAxis(categoryAxis11);
        java.awt.Paint paint13 = categoryPlot8.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint13);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        boolean boolean15 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(10, (int) (short) 0, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets11, true);
        int int14 = categoryPlot0.getDatasetCount();
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.Marker marker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue(0.0d, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((-1), categoryAxis25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer23, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) -1, categoryMarker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        java.awt.Paint paint4 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        categoryPlot0.notifyListeners(plotChangeEvent6);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        categoryPlot0.setWeight((int) 'a');
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        double double13 = categoryPlot6.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot14 = categoryPlot6.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray15 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot6.setRenderers(categoryItemRendererArray15);
        categoryPlot0.setRenderers(categoryItemRendererArray15);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot18.getRenderer((int) '4');
        java.util.List list21 = categoryPlot18.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = categoryPlot18.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection22);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(categoryItemRendererArray15);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        boolean boolean19 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot20.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot20.getDomainGridlinePosition();
        boolean boolean24 = categoryPlot20.isRangeZoomable();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot20.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(drawingSupplier25);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] { valueAxis9 };
        categoryPlot6.setRangeAxes(valueAxisArray10);
        categoryPlot6.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean15 = categoryPlot6.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot6.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation16, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getInsets();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(100, marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        java.awt.Font font7 = categoryPlot0.getNoDataMessageFont();
        java.lang.Class<?> wildcardClass8 = categoryPlot0.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke8);
        boolean boolean10 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean18 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearAnnotations();
        boolean boolean20 = categoryPlot0.isOutlineVisible();
        boolean boolean21 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int8 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxisForDataset((int) 'a');
        int int11 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Font font11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setNoDataMessageFont(font11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        java.awt.Paint paint17 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation((int) 'a');
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis20);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 0, 100, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot0.setRangeAxes(valueAxisArray14);
        boolean boolean17 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        categoryPlot0.setRangeAxisLocation(axisLocation16);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = categoryPlot1.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        int int4 = categoryPlot1.getDomainAxisIndex(categoryAxis3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot1.setDomainAxis((int) (short) 100, categoryAxis6, false);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot1.getRangeMarkers(layer9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray12 = new org.jfree.chart.axis.ValueAxis[] { valueAxis11 };
        categoryPlot1.setRangeAxes(valueAxisArray12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        categoryPlot14.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean23 = categoryPlot14.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot14.setDomainAxis((int) (short) 0, categoryAxis25);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot14.getOrientation();
        categoryPlot1.setOrientation(plotOrientation27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(valueAxisArray12);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(plotOrientation27);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) 'a', marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        float float6 = categoryPlot0.getForegroundAlpha();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        boolean boolean16 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot17.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot17.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot17.setDomainAxis((int) (short) 100, categoryAxis22, false);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot17.getRangeMarkers(layer25);
        categoryPlot17.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot17.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder29);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(sortOrder29);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot0.getRangeAxisForDataset((int) (byte) 0);
        categoryPlot0.clearRangeMarkers();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D35, rectangle2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNull(valueAxis33);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) (byte) 0, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis((int) (short) 10, valueAxis17, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        int int21 = categoryPlot0.getRangeAxisCount();
        boolean boolean22 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxis((int) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot0.getRangeAxisForDataset(15);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(valueAxis16);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot0.setDomainAxis(1, categoryAxis7, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray13);
        categoryPlot0.setAnchorValue((-1.0d), false);
        java.lang.Class<?> wildcardClass18 = categoryPlot0.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        plot5.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        java.lang.String str9 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Category Plot" + "'", str9, "Category Plot");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) '4', (double) (short) 0, plotRenderingInfo8, point2D9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset(10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        java.lang.Class<?> wildcardClass16 = categoryPlot0.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis2 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Marker marker3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNull(valueAxis2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset((int) (short) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        categoryPlot19.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        categoryPlot22.markerChanged(markerChangeEvent23);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot22.getDomainAxisEdge((int) '4');
        categoryPlot22.setAnchorValue((double) (short) 1);
        double double29 = categoryPlot22.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot30 = categoryPlot22.getRootPlot();
        double double31 = categoryPlot22.getRangeCrosshairValue();
        int int32 = categoryPlot22.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot22.getRangeAxisLocation((int) ' ');
        categoryPlot19.setRangeAxisLocation((int) '4', axisLocation34, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', (double) '4', plotRenderingInfo6, point2D7);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        categoryPlot0.setBackgroundAlpha((float) 1L);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot20.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        int int23 = categoryPlot20.getDomainAxisIndex(categoryAxis22);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot20.setDomainAxis((int) (short) 100, categoryAxis25, false);
        java.awt.Image image28 = null;
        categoryPlot20.setBackgroundImage(image28);
        categoryPlot20.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot35.setInsets(rectangleInsets36);
        org.jfree.chart.LegendItemCollection legendItemCollection38 = null;
        categoryPlot35.setFixedLegendItems(legendItemCollection38);
        java.awt.Paint paint40 = categoryPlot35.getNoDataMessagePaint();
        categoryPlot34.setBackgroundPaint(paint40);
        categoryPlot20.setRangeGridlinePaint(paint40);
        categoryPlot0.setDomainGridlinePaint(paint40);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryAxis21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        java.lang.Class<?> wildcardClass15 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Paint paint3 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, 100);
        java.lang.String str16 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Category Plot" + "'", str16, "Category Plot");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        boolean boolean16 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRenderer();
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryItemRenderer17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxis((int) (byte) 1);
        categoryPlot4.configureRangeAxes();
        org.junit.Assert.assertNull(categoryAxis6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge(0);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot9.setInsets(rectangleInsets10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = null;
        categoryPlot9.setFixedLegendItems(legendItemCollection12);
        java.awt.Paint paint14 = categoryPlot9.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint14);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot13.getRenderer((int) '4');
        java.util.List list16 = categoryPlot13.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot13.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot13.setRenderers(categoryItemRendererArray18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(0, axisLocation20, false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 100, categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.data.general.DatasetGroup datasetGroup27 = categoryPlot17.getDatasetGroup();
        categoryPlot17.configureRangeAxes();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(datasetGroup27);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) '#', 0, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        categoryPlot0.setRangeCrosshairValue((double) 100.0f, true);
        java.awt.Paint paint15 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot16.getRangeMarkers(layer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot16.setRenderer(categoryItemRenderer26, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot29.setRenderer(categoryItemRenderer36);
        java.awt.Paint paint38 = categoryPlot29.getRangeCrosshairPaint();
        categoryPlot16.setRangeCrosshairPaint(paint38);
        categoryPlot0.setOutlinePaint(paint38);
        boolean boolean41 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D42, rectangle2D43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        java.awt.Paint paint13 = categoryPlot6.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.removeChangeListener(plotChangeListener17);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getAxisOffset();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        java.lang.Object obj4 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.String str5 = categoryPlot0.getPlotType();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo13, point2D14);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot0.getDatasetGroup();
        boolean boolean15 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        int int25 = categoryPlot16.getIndexOf(categoryItemRenderer24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot16.drawBackgroundImage(graphics2D26, rectangle2D27);
        categoryPlot16.mapDatasetToRangeAxis((int) (short) 0, 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        categoryPlot32.markerChanged(markerChangeEvent33);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray36 = new org.jfree.chart.axis.ValueAxis[] { valueAxis35 };
        categoryPlot32.setRangeAxes(valueAxisArray36);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot32.setDomainGridlinePaint(paint38);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        categoryPlot40.markerChanged(markerChangeEvent41);
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = categoryPlot40.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot40.getRangeAxisLocation();
        java.awt.Stroke stroke46 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot40.setRangeCrosshairStroke(stroke46);
        categoryPlot32.setRangeCrosshairStroke(stroke46);
        categoryPlot16.setOutlineStroke(stroke46);
        categoryPlot0.setRangeGridlineStroke(stroke46);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(valueAxisArray36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertNotNull(axisLocation45);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int8 = categoryPlot0.getDomainAxisCount();
        categoryPlot0.mapDatasetToRangeAxis((int) '#', 100);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        categoryPlot2.markerChanged(markerChangeEvent3);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot2.getDomainAxisEdge((int) '4');
        categoryPlot2.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot2.setRenderer(categoryItemRenderer9);
        java.awt.Paint paint11 = categoryPlot2.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot2.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        java.awt.Paint paint20 = categoryPlot13.getRangeCrosshairPaint();
        categoryPlot2.setNoDataMessagePaint(paint20);
        categoryPlot0.setNoDataMessagePaint(paint20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot7.addChangeListener(plotChangeListener33);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        java.awt.geom.Point2D point2D37 = null;
        org.jfree.chart.plot.PlotState plotState38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot7.draw(graphics2D35, rectangle2D36, point2D37, plotState38, plotRenderingInfo39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        boolean boolean35 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot0.setDomainAxis(categoryAxis21);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot0.getRangeMarkers(100, layer24);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(collection25);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis();
        java.awt.Image image15 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 0, (double) 1L, plotRenderingInfo18, point2D19);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot9.setInsets(rectangleInsets10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot9.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot9.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot15.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot15.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot15.getRendererForDataset(categoryDataset19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot15.getRangeAxisLocation(100);
        categoryPlot9.setDomainAxisLocation(axisLocation22);
        categoryPlot0.setRangeAxisLocation(axisLocation22, true);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        java.lang.Object obj10 = categoryPlot0.clone();
        java.awt.Paint paint11 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        float float10 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        java.util.List list15 = categoryPlot0.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 10, 15);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot0.getDomainAxis((int) '4');
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryAxis22);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        categoryPlot0.setDataset(100, categoryDataset11);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation15, true);
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(sortOrder18);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        boolean boolean18 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray14 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot5.setRenderers(categoryItemRendererArray14);
        categoryPlot0.setRenderers(categoryItemRendererArray14);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(categoryItemRendererArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis7, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis(categoryAxis14);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot12.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot17.getRangeAxisLocation();
        categoryPlot12.setDomainAxisLocation(axisLocation22, false);
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation22, false);
        java.lang.String str27 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis(categoryAxis9);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plotOrientation8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getLegendItems();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxis((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray8 = new org.jfree.chart.axis.ValueAxis[] { valueAxis7 };
        categoryPlot4.setRangeAxes(valueAxisArray8);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(valueAxisArray8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        int int16 = categoryPlot0.getIndexOf(categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        int int27 = categoryPlot18.getDomainAxisIndex(categoryAxis26);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot18.getDataRange(valueAxis28);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        int int31 = categoryPlot18.getIndexOf(categoryItemRenderer30);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        categoryPlot33.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot33.getDomainAxisLocation();
        categoryPlot18.setDomainAxisLocation((int) (short) 1, axisLocation37, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setWeight((int) (short) -1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot16.setInsets(rectangleInsets17);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot16.getDomainAxisLocation((-1));
        categoryPlot0.setRangeAxisLocation(axisLocation20, false);
        float float23 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean11 = categoryPlot0.getDrawSharedDomainAxis();
        java.lang.String str12 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Category Plot" + "'", str12, "Category Plot");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(10, layer17);
        java.util.List list19 = categoryPlot0.getCategories();
        categoryPlot0.setForegroundAlpha((float) (short) -1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(list19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        boolean boolean24 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundImageAlignment(10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint1 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setAnchorValue((double) (short) 10, true);
        java.lang.String str5 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 0, marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] { valueAxis9 };
        categoryPlot6.setRangeAxes(valueAxisArray10);
        categoryPlot6.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean15 = categoryPlot6.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot6.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation16, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getInsets();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        categoryPlot12.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot12.getDomainAxisLocation();
        boolean boolean17 = categoryPlot12.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getDomainAxisEdge((int) '4');
        categoryPlot18.setAnchorValue((double) (short) 1);
        double double25 = categoryPlot18.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot26 = categoryPlot18.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray27 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot18.setRenderers(categoryItemRendererArray27);
        categoryPlot12.setRenderers(categoryItemRendererArray27);
        categoryPlot0.setRenderers(categoryItemRendererArray27);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(categoryItemRendererArray27);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) '4');
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertNotNull(sortOrder18);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue(0.0d, true);
        java.awt.Stroke stroke24 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot0.getRenderer((int) (byte) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(categoryItemRenderer26);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis7, false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation25);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(10, (int) (short) 10, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(sortOrder30);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot4.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot4.getDataset((-1));
        categoryPlot4.setRangeCrosshairValue(0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxisForDataset(1);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getRangeAxisLocation((int) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryItemRenderer20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo17, point2D18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryMarker categoryMarker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        categoryPlot19.clearDomainMarkers();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        categoryPlot0.clearRangeAxes();
        boolean boolean21 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        boolean boolean13 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxisForDataset(1);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getRangeAxisLocation((int) (short) 1);
        org.jfree.chart.plot.CategoryMarker categoryMarker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        categoryPlot0.setBackgroundImageAlpha(0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        categoryPlot21.clearRangeMarkers();
        java.awt.Paint paint23 = categoryPlot21.getOutlinePaint();
        categoryPlot0.setBackgroundPaint(paint23);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        java.util.List list15 = categoryPlot0.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        categoryPlot0.clearDomainMarkers((int) (byte) 10);
        boolean boolean20 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot0.setDomainAxis(categoryAxis21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        categoryPlot0.setDataset(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot0.setDataset(categoryDataset25);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = null;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) '#', layer2);
        java.awt.Stroke stroke4 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot5.setRenderer(categoryItemRenderer12);
        java.awt.Paint paint14 = categoryPlot5.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint14);
        java.util.List list16 = categoryPlot0.getCategories();
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace24);
        java.awt.Paint paint26 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        java.awt.Paint paint4 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNotNull(plot2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 10, marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.AxisLocation axisLocation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.plot.Marker marker8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        categoryPlot7.setWeight(1);
        boolean boolean35 = categoryPlot7.isSubplot();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot0.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent19);
        org.junit.Assert.assertNotNull(valueAxisArray4);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        java.lang.Class<?> wildcardClass11 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        double double16 = categoryPlot0.getAnchorValue();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot12.getIndexOf(categoryItemRenderer16);
        org.jfree.chart.plot.Plot plot18 = categoryPlot12.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot12.setRenderer(100, categoryItemRenderer20, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot12.setRenderer((int) (byte) 1, categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot12.getDomainAxis((int) (byte) -1);
        boolean boolean28 = categoryPlot12.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot29.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        int int32 = categoryPlot29.getDomainAxisIndex(categoryAxis31);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        categoryPlot29.setDomainAxis((int) (short) 100, categoryAxis34, false);
        org.jfree.chart.util.Layer layer37 = null;
        java.util.Collection collection38 = categoryPlot29.getRangeMarkers(layer37);
        categoryPlot29.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder41 = categoryPlot29.getRowRenderingOrder();
        categoryPlot12.setRowRenderingOrder(sortOrder41);
        categoryPlot0.setRowRenderingOrder(sortOrder41);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertNull(categoryAxis27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(collection38);
        org.junit.Assert.assertNotNull(sortOrder41);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        org.jfree.chart.axis.AxisLocation axisLocation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        categoryPlot6.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot6.markerChanged(markerChangeEvent27);
        java.awt.Paint paint29 = categoryPlot6.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] { valueAxis22 };
        categoryPlot19.setRangeAxes(valueAxisArray23);
        categoryPlot19.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean28 = categoryPlot19.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot19.getDomainAxisLocation();
        categoryPlot15.setDomainAxisLocation((int) (byte) 1, axisLocation29, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray32 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot15.setDomainAxes(categoryAxisArray32);
        categoryPlot0.setDomainAxes(categoryAxisArray32);
        org.jfree.chart.axis.AxisLocation axisLocation36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) 0, axisLocation36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(categoryAxisArray32);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), plotRenderingInfo11, point2D12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot14.getRangeAxisLocation();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot14.setRangeCrosshairStroke(stroke20);
        java.awt.Stroke stroke22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot14.setDomainGridlineStroke(stroke22);
        categoryPlot0.setDomainGridlineStroke(stroke22);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge((int) '4');
        categoryPlot25.setAnchorValue((double) (short) 1);
        double double32 = categoryPlot25.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot33 = categoryPlot25.getRootPlot();
        double double34 = categoryPlot25.getRangeCrosshairValue();
        int int35 = categoryPlot25.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot25.getRangeAxisLocation((int) ' ');
        boolean boolean38 = categoryPlot25.isRangeZoomable();
        java.awt.Paint paint39 = categoryPlot25.getBackgroundPaint();
        categoryPlot0.setRangeGridlinePaint(paint39);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke19 = categoryPlot0.getDomainGridlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean12 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        boolean boolean16 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot17.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot17.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot17.setDomainAxis((int) (short) 100, categoryAxis22, false);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot17.getRangeMarkers(layer25);
        categoryPlot17.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot17.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder29);
        float float31 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(sortOrder29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        categoryPlot0.setRangeCrosshairValue((double) 100.0f, true);
        java.awt.Paint paint15 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot16.getRangeMarkers(layer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot16.setRenderer(categoryItemRenderer26, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot29.setRenderer(categoryItemRenderer36);
        java.awt.Paint paint38 = categoryPlot29.getRangeCrosshairPaint();
        categoryPlot16.setRangeCrosshairPaint(paint38);
        categoryPlot0.setOutlinePaint(paint38);
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        categoryPlot0.setDomainAxis((int) (byte) 0, categoryAxis42);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] { valueAxis23 };
        categoryPlot13.setRangeAxes(valueAxisArray24);
        categoryPlot0.setRangeAxes(valueAxisArray24);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace27);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(valueAxisArray24);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        boolean boolean15 = categoryPlot0.isRangeZoomable();
        boolean boolean16 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot0.removeAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation((int) (byte) -1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        categoryPlot0.setAnchorValue((double) 10);
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer(categoryItemRenderer9, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        java.util.List list15 = categoryPlot0.getAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot0.setDataset(categoryDataset16);
        int int18 = categoryPlot0.getRangeAxisCount();
        boolean boolean19 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        boolean boolean9 = categoryPlot0.isOutlineVisible();
        java.lang.Object obj10 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.awt.Stroke stroke7 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray12 = new org.jfree.chart.axis.ValueAxis[] { valueAxis11 };
        categoryPlot8.setRangeAxes(valueAxisArray12);
        categoryPlot8.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot8.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot8.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint22 = categoryPlot8.getRangeCrosshairPaint();
        categoryPlot0.setDomainGridlinePaint(paint22);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(valueAxisArray12);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setBackgroundAlpha(0.5f);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot9.getDomainAxisEdge((int) '4');
        categoryPlot9.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot9.setRenderer(categoryItemRenderer16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot18.setInsets(rectangleInsets19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot18.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot18.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot24.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor27 = categoryPlot24.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot24.getRendererForDataset(categoryDataset28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot24.getRangeAxisLocation(100);
        categoryPlot18.setDomainAxisLocation(axisLocation31);
        categoryPlot9.setRangeAxisLocation(axisLocation31, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(categoryAnchor27);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        boolean boolean9 = categoryPlot0.isRangeGridlinesVisible();
        java.lang.Object obj10 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRendererForDataset(categoryDataset15);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot0.removeAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        int int29 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        java.awt.Paint paint13 = categoryPlot6.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        categoryPlot0.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        categoryPlot0.configureDomainAxes();
        double double37 = categoryPlot0.getAnchorValue();
        org.jfree.chart.plot.CategoryMarker categoryMarker39 = null;
        org.jfree.chart.util.Layer layer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(10, categoryMarker39, layer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot10.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean19 = categoryPlot10.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot10.getDomainAxisLocation();
        categoryPlot6.setDomainAxisLocation((int) (byte) 1, axisLocation20, false);
        categoryPlot0.setDomainAxisLocation(axisLocation20);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot7.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot7.setDomainAxis((int) (short) 100, categoryAxis12, false);
        java.awt.Image image15 = null;
        categoryPlot7.setBackgroundImage(image15);
        categoryPlot7.mapDatasetToDomainAxis((int) '#', 1);
        int int20 = categoryPlot7.getWeight();
        java.awt.Font font21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot7.setNoDataMessageFont(font21);
        categoryPlot0.setNoDataMessageFont(font21);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot11.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        int int14 = categoryPlot11.getDomainAxisIndex(categoryAxis13);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot11.setDomainAxis((int) (short) 100, categoryAxis16, false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot11.getRangeMarkers(layer19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot11.setRenderer(categoryItemRenderer21, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot24.markerChanged(markerChangeEvent25);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot24.getDomainAxisEdge((int) '4');
        categoryPlot24.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot24.setRenderer(categoryItemRenderer31);
        java.awt.Paint paint33 = categoryPlot24.getRangeCrosshairPaint();
        categoryPlot11.setRangeCrosshairPaint(paint33);
        categoryPlot0.setRangeGridlinePaint(paint33);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryMarker categoryMarker37 = null;
        org.jfree.chart.util.Layer layer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker37, layer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer21, false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = categoryPlot0.getNoDataMessagePaint();
        categoryPlot0.setBackgroundImageAlignment(15);
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        int int10 = categoryPlot0.getDatasetCount();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot0.markerChanged(markerChangeEvent11);
        java.lang.Class<?> wildcardClass13 = categoryPlot0.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        float float16 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = null;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) '#', layer2);
        java.awt.Stroke stroke4 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot5.setRenderer(categoryItemRenderer12);
        java.awt.Paint paint14 = categoryPlot5.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot16.setInsets(rectangleInsets17);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection19);
        java.lang.Object obj21 = categoryPlot16.clone();
        categoryPlot16.setDrawSharedDomainAxis(true);
        java.awt.Paint paint24 = categoryPlot16.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint24);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(layer26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        categoryPlot0.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot13.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot13.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot13.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot29.getDomainAxisLocation((-1));
        categoryPlot13.setRangeAxisLocation(axisLocation33, false);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation33, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(axisLocation33);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot0.getDomainAxis(0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryAxis27);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        double double13 = categoryPlot6.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot14 = categoryPlot6.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray15 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot6.setRenderers(categoryItemRendererArray15);
        categoryPlot0.setRenderers(categoryItemRendererArray15);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(categoryItemRendererArray15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        float float9 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor10 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset((int) (byte) 1, categoryDataset12);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot0.getDomainAxisIndex(categoryAxis14);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAnchor10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        boolean boolean15 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot13.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot13.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot13.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot29.getDomainAxisLocation((-1));
        categoryPlot13.setRangeAxisLocation(axisLocation33, false);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation33, true);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(axisLocation33);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer23, false);
        java.awt.Stroke stroke26 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        categoryPlot0.clearDomainMarkers();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (byte) -1, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setBackgroundAlpha((float) 15);
        java.awt.Font font21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font21);
        org.jfree.chart.plot.Marker marker23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        boolean boolean27 = categoryPlot0.isRangeZoomable();
        int int28 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        java.awt.Paint paint20 = categoryPlot14.getNoDataMessagePaint();
        categoryPlot0.setRangeCrosshairPaint(paint20);
        int int22 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge24);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot15.setInsets(rectangleInsets16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot15.setFixedLegendItems(legendItemCollection18);
        java.awt.Paint paint20 = categoryPlot15.getNoDataMessagePaint();
        categoryPlot14.setBackgroundPaint(paint20);
        categoryPlot0.setRangeGridlinePaint(paint20);
        org.jfree.chart.plot.Marker marker23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setBackgroundAlpha((float) 'a');
        categoryPlot0.setAnchorValue((double) (short) 100);
        java.awt.Paint paint17 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Image image18 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(image18);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        org.jfree.chart.plot.CategoryMarker categoryMarker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(1, categoryMarker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(categoryItemRenderer11, false);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] { valueAxis9 };
        categoryPlot6.setRangeAxes(valueAxisArray10);
        categoryPlot6.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot6.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot6.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot6.getRangeAxisLocation((int) '#');
        categoryPlot6.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot6.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint18 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(legendItemCollection10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D33, rectangle2D34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getDomainAxisLocation((-1));
        categoryPlot0.setDomainAxisLocation(axisLocation15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        boolean boolean11 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot0.getOrientation();
        java.awt.Stroke stroke16 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis18, true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 101, plotRenderingInfo15, point2D16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot14.setRenderer(categoryItemRenderer21);
        int int23 = categoryPlot14.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot14.setDomainAxis(categoryAxis24);
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        categoryPlot14.setRangeCrosshairValue((double) (byte) 1);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot14.setRangeCrosshairStroke(stroke30);
        categoryPlot0.setOutlineStroke(stroke30);
        java.lang.String str33 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Category Plot" + "'", str33, "Category Plot");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.clearRangeMarkers();
        java.awt.Paint paint20 = categoryPlot18.getOutlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint20);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray15 = new org.jfree.chart.axis.ValueAxis[] { valueAxis14 };
        categoryPlot11.setRangeAxes(valueAxisArray15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot11.setDomainGridlinePaint(paint17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot19.getRangeAxisLocation();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot19.setRangeCrosshairStroke(stroke25);
        categoryPlot11.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setRangeCrosshairStroke(stroke25);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot0.getRangeAxis((int) 'a');
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        categoryPlot22.markerChanged(markerChangeEvent23);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot22.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot22.getRangeAxisLocation();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot22.setRangeCrosshairStroke(stroke28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot22.setDomainGridlineStroke(stroke30);
        categoryPlot0.setDomainGridlineStroke(stroke30);
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 10, marker34, layer35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace47);
        org.jfree.chart.axis.AxisLocation axisLocation49 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.LegendItemCollection legendItemCollection50 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(axisLocation49);
        org.junit.Assert.assertNotNull(legendItemCollection50);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean18 = categoryPlot0.isDomainZoomable();
        java.awt.Stroke stroke19 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot17.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup22 = categoryPlot17.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] { valueAxis26 };
        categoryPlot23.setRangeAxes(valueAxisArray27);
        categoryPlot23.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean32 = categoryPlot23.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot23.getDomainAxisLocation();
        categoryPlot17.setRangeAxisLocation(axisLocation33, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        categoryPlot36.markerChanged(markerChangeEvent37);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray40 = new org.jfree.chart.axis.ValueAxis[] { valueAxis39 };
        categoryPlot36.setRangeAxes(valueAxisArray40);
        categoryPlot36.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot36.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation48 = categoryPlot36.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation33, plotOrientation48);
        categoryPlot0.setRangeAxisLocation(axisLocation33, true);
        java.awt.Graphics2D graphics2D52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        java.awt.geom.Point2D point2D54 = null;
        org.jfree.chart.plot.PlotState plotState55 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D52, rectangle2D53, point2D54, plotState55, plotRenderingInfo56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(valueAxisArray40);
        org.junit.Assert.assertNotNull(plotOrientation48);
        org.junit.Assert.assertNotNull(rectangleEdge49);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        double double12 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot0.setRenderer((int) (short) 1, categoryItemRenderer14, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = null;
        categoryPlot17.setFixedLegendItems(legendItemCollection20);
        java.lang.Object obj22 = categoryPlot17.clone();
        categoryPlot17.clearDomainMarkers(100);
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot17.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot17.setRangeAxis(valueAxis28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot17.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot0.setDomainAxis(categoryAxis32);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder34 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertNotNull(datasetRenderingOrder34);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.plot.Marker marker47 = null;
        org.jfree.chart.util.Layer layer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker47, layer48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        java.awt.Paint paint8 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer10, false);
        categoryPlot0.setForegroundAlpha((float) (short) 1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean24 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot25.setInsets(rectangleInsets26);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = null;
        categoryPlot25.setFixedLegendItems(legendItemCollection28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        categoryPlot30.markerChanged(markerChangeEvent31);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot30.getDomainAxisEdge((int) '4');
        categoryPlot30.setAnchorValue((double) (short) 1);
        double double37 = categoryPlot30.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot38 = categoryPlot30.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray39 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot30.setRenderers(categoryItemRendererArray39);
        categoryPlot25.setRenderers(categoryItemRendererArray39);
        categoryPlot0.setRenderers(categoryItemRendererArray39);
        java.awt.Stroke stroke43 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlineStroke(stroke43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(plot38);
        org.junit.Assert.assertNotNull(categoryItemRendererArray39);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        categoryPlot0.configureDomainAxes();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        boolean boolean41 = categoryPlot0.render(graphics2D37, rectangle2D38, (int) (byte) 10, plotRenderingInfo40);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        int int43 = categoryPlot0.getIndexOf(categoryItemRenderer42);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        java.lang.String str35 = categoryPlot19.getPlotType();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Category Plot" + "'", str35, "Category Plot");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        int int15 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        java.awt.Image image24 = null;
        categoryPlot16.setBackgroundImage(image24);
        categoryPlot16.mapDatasetToDomainAxis((int) '#', 1);
        int int29 = categoryPlot16.getWeight();
        float float30 = categoryPlot16.getBackgroundImageAlpha();
        java.awt.Stroke stroke31 = categoryPlot16.getRangeCrosshairStroke();
        categoryPlot0.setOutlineStroke(stroke31);
        org.jfree.chart.plot.CategoryMarker categoryMarker33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        categoryPlot0.setBackgroundAlpha((float) (short) 1);
        org.jfree.chart.plot.CategoryMarker categoryMarker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 10, categoryMarker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis(categoryAxis27);
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot0.getLegendItems();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis17, false);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        categoryPlot0.configureDomainAxes();
        double double37 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis39);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis(15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = categoryPlot0.getDataRange(valueAxis18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        categoryPlot0.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNull(range19);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        categoryPlot14.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str23 = categoryPlot14.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot24.markerChanged(markerChangeEvent25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray28 = new org.jfree.chart.axis.ValueAxis[] { valueAxis27 };
        categoryPlot24.setRangeAxes(valueAxisArray28);
        categoryPlot24.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean33 = categoryPlot24.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot24.getDomainAxisLocation();
        categoryPlot14.setRangeAxisLocation(axisLocation34);
        categoryPlot0.setDomainAxisLocation(axisLocation34, true);
        org.jfree.chart.axis.AxisSpace axisSpace38 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace38);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(valueAxisArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot1.setInsets(rectangleInsets2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = null;
        categoryPlot1.setFixedLegendItems(legendItemCollection4);
        java.awt.Paint paint6 = categoryPlot1.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer((int) (short) 100);
        boolean boolean10 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot0.getCategoriesForAxis(categoryAxis11);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        boolean boolean10 = categoryPlot0.isSubplot();
        java.lang.String str11 = categoryPlot0.getPlotType();
        categoryPlot0.mapDatasetToRangeAxis(10, 101);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) ' ', marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getColumnRenderingOrder();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(sortOrder6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        java.lang.Class<?> wildcardClass11 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        categoryPlot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray8 = new org.jfree.chart.axis.ValueAxis[] { valueAxis7 };
        categoryPlot4.setRangeAxes(valueAxisArray8);
        categoryPlot4.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean13 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot4.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation14, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray17);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation();
        boolean boolean20 = categoryPlot0.isDomainZoomable();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getBackgroundImageAlpha();
        categoryPlot0.setDomainGridlinesVisible(true);
        categoryPlot0.clearDomainMarkers((int) (byte) 1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge(101);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(rectangleEdge8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        double double7 = categoryPlot0.getAnchorValue();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        categoryPlot0.setDataset(categoryDataset8);
        org.jfree.chart.plot.Marker marker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        java.util.List list16 = categoryPlot0.getCategoriesForAxis(categoryAxis15);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxisForDataset((int) ' ');
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot8.setInsets(rectangleInsets9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = null;
        categoryPlot8.setFixedLegendItems(legendItemCollection11);
        java.lang.Object obj13 = categoryPlot8.clone();
        categoryPlot8.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot8.setDomainAxis((int) (short) 10, categoryAxis17, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = categoryPlot8.getRangeAxis((int) (byte) 1);
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) valueAxis21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot23.getRenderer();
        categoryPlot23.setBackgroundAlpha(0.0f);
        boolean boolean34 = categoryPlot23.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor35 = categoryPlot23.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor35);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        java.awt.geom.Point2D point2D39 = null;
        org.jfree.chart.plot.PlotState plotState40 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D37, rectangle2D38, point2D39, plotState40, plotRenderingInfo41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryItemRenderer31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(categoryAnchor35);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.mapDatasetToRangeAxis(0, 0);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        categoryPlot14.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean23 = categoryPlot14.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot14.setDomainAxis((int) (short) 0, categoryAxis25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot14.setInsets(rectangleInsets27, true);
        categoryPlot0.setInsets(rectangleInsets27, true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        categoryPlot0.notifyListeners(plotChangeEvent32);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        float float21 = categoryPlot16.getForegroundAlpha();
        categoryPlot16.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot16.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation24);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation24);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        java.util.List list25 = categoryPlot0.getCategoriesForAxis(categoryAxis24);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(rectangleEdge27);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 10, marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent11);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        int int21 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(10, layer17);
        java.util.List list19 = categoryPlot0.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot0.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray25 = new org.jfree.chart.axis.ValueAxis[] { valueAxis24 };
        categoryPlot21.setRangeAxes(valueAxisArray25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot21.setDomainGridlinePaint(paint27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot29.getRangeAxisLocation();
        java.awt.Stroke stroke35 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot29.setRangeCrosshairStroke(stroke35);
        categoryPlot21.setRangeCrosshairStroke(stroke35);
        categoryPlot0.setDomainGridlineStroke(stroke35);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        categoryPlot0.setRangeAxis(0, valueAxis40, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(valueAxisArray25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        categoryPlot16.setAnchorValue((double) (short) 1);
        double double23 = categoryPlot16.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot24 = categoryPlot16.getRootPlot();
        double double25 = categoryPlot16.getRangeCrosshairValue();
        int int26 = categoryPlot16.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot16.getRangeAxisLocation((int) ' ');
        boolean boolean29 = categoryPlot16.isRangeZoomable();
        java.awt.Paint paint30 = categoryPlot16.getBackgroundPaint();
        categoryPlot0.setOutlinePaint(paint30);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        int int3 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis(categoryAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis((int) (short) 10, valueAxis19, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        plot8.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot0.setRangeAxes(valueAxisArray19);
        categoryPlot0.setAnchorValue((-1.0d));
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(valueAxisArray19);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        java.lang.Object obj10 = categoryPlot0.clone();
        categoryPlot0.setRangeCrosshairValue((double) '#', false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setDrawSharedDomainAxis(true);
        int int25 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace47);
        boolean boolean49 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot4.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomDomainAxes((double) (short) 0, plotRenderingInfo9, point2D10);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sortOrder9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        categoryPlot19.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot19.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo29, point2D30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = categoryPlot19.getFixedDomainAxisSpace();
        categoryPlot19.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot19.getRangeAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(101, axisLocation35, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot0.zoomRangeAxes((double) 15, (double) (short) -1, plotRenderingInfo40, point2D41);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNull(axisSpace32);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot0.removeAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot0.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) 'a', (int) '4', plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        categoryPlot0.configureDomainAxes();
        java.lang.Class<?> wildcardClass17 = categoryPlot0.getClass();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot7.addChangeListener(plotChangeListener33);
        org.jfree.chart.plot.CategoryMarker categoryMarker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot7.addDomainMarker(categoryMarker35, layer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        java.awt.Stroke stroke15 = categoryPlot12.getRangeGridlineStroke();
        categoryPlot12.setDomainGridlinesVisible(true);
        double double18 = categoryPlot12.getRangeCrosshairValue();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder19 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder19);
        java.awt.Paint paint21 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(datasetRenderingOrder19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxisForDataset((int) ' ');
        float float8 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        categoryPlot0.configureDomainAxes();
        double double37 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(axisSpace38);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        double double18 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent13);
        java.awt.Paint paint15 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        categoryPlot11.setAnchorValue((double) (short) 1);
        java.awt.Paint paint18 = categoryPlot11.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint18);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot0.getRendererForDataset(categoryDataset22);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer23);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot7.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot7.setDomainAxis((int) (short) 100, categoryAxis12, false);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot7.getRangeMarkers(layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot7.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation22, false);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot0.getRendererForDataset(categoryDataset25);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(categoryItemRenderer26);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (short) -1, categoryItemRenderer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        categoryPlot0.setAnchorValue((double) 1L);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot0.getOrientation();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot7.getRangeAxisLocation();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot7.setRangeCrosshairStroke(stroke13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot7.setDomainGridlineStroke(stroke15);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot7.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(axisSpace18);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) 'a', layer9);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        java.awt.Paint paint7 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getRangeAxisCount();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        double double6 = categoryPlot0.getRangeCrosshairValue();
        java.lang.Class<?> wildcardClass7 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo14, point2D15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, 0, plotRenderingInfo20);
        java.awt.Paint paint22 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.lang.String str22 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Category Plot" + "'", str22, "Category Plot");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        org.jfree.chart.axis.AxisLocation axisLocation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot17.setDomainAxisLocation(axisLocation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getDomainMarkers(layer21);
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(collection22);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        categoryPlot7.setAnchorValue((double) (short) 1);
        double double14 = categoryPlot7.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot15 = categoryPlot7.getRootPlot();
        double double16 = categoryPlot7.getRangeCrosshairValue();
        int int17 = categoryPlot7.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot7.getRangeAxisLocation((int) ' ');
        categoryPlot4.setRangeAxisLocation((int) '4', axisLocation19, false);
        float float22 = categoryPlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        int int15 = categoryPlot0.getDatasetCount();
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo10, point2D11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot5.getRenderer();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        java.awt.Stroke stroke15 = categoryPlot5.getRangeCrosshairStroke();
        int int16 = categoryPlot5.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot5.setDataset((int) (byte) 0, categoryDataset18);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot10.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean19 = categoryPlot10.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        categoryPlot20.markerChanged(markerChangeEvent21);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot20.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot20.getRangeAxisLocation();
        categoryPlot10.setDomainAxisLocation(axisLocation25, true);
        categoryPlot0.setRangeAxisLocation(axisLocation25, false);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        float float6 = categoryPlot0.getForegroundAlpha();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot0.markerChanged(markerChangeEvent10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        categoryPlot0.clearRangeAxes();
        int int21 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot0.getRangeAxis((int) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot0.getRenderer((-1));
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNull(categoryItemRenderer25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        categoryPlot0.setAnchorValue((double) 100L, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer((int) (short) 0);
        int int14 = categoryPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot0.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot0.setDomainAxis(categoryAxis7);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint14 = categoryPlot0.getBackgroundPaint();
        boolean boolean15 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.clearAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot0.setRenderer(categoryItemRenderer25);
        categoryPlot0.setAnchorValue((double) 0.5f, false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        int int15 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] { valueAxis19 };
        categoryPlot16.setRangeAxes(valueAxisArray20);
        java.awt.Paint paint22 = categoryPlot16.getNoDataMessagePaint();
        boolean boolean23 = categoryPlot0.equals((java.lang.Object) paint22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint12 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent13);
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot11.setDomainAxes(categoryAxisArray28);
        categoryPlot0.setDomainAxes(categoryAxisArray28);
        org.jfree.chart.axis.AxisSpace axisSpace31 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNull(axisSpace31);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        categoryPlot0.clearRangeAxes();
        int int21 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot0.render(graphics2D22, rectangle2D23, 0, plotRenderingInfo25);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setRangeCrosshairValue(10.0d, true);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.setRangeGridlinesVisible(true);
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) -1, 101, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot17.getDomainAxisForDataset((int) (byte) -1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = categoryPlot17.removeAnnotation(categoryAnnotation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(categoryAxis28);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset((int) (byte) 100);
        categoryPlot0.setRangeCrosshairValue(10.0d, true);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint6 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 100, categoryMarker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray15 = new org.jfree.chart.axis.ValueAxis[] { valueAxis14 };
        categoryPlot11.setRangeAxes(valueAxisArray15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot11.setDomainGridlinePaint(paint17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot19.getRangeAxisLocation();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot19.setRangeCrosshairStroke(stroke25);
        categoryPlot11.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.axis.AxisSpace axisSpace31 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(axisSpace31);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(0, valueAxis13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(100, (int) '#', plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        int int15 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot0.getDomainAxisIndex(categoryAxis18);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = categoryPlot0.getDataRange(valueAxis18);
        categoryPlot0.setRangeCrosshairVisible(false);
        categoryPlot0.clearRangeMarkers((int) (byte) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNull(range19);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        java.awt.Paint paint8 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer10, false);
        categoryPlot0.setForegroundAlpha((float) (short) 1);
        boolean boolean15 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot8.getRangeMarkers(layer16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot8.setRangeAxes(valueAxisArray19);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot8.setDomainAxes(categoryAxisArray21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation23, false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent26);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeGridlinesVisible();
        float float5 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(1, categoryItemRenderer16, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        categoryPlot19.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot27.setInsets(rectangleInsets28);
        java.awt.Stroke stroke30 = categoryPlot27.getRangeGridlineStroke();
        categoryPlot19.setRangeCrosshairStroke(stroke30);
        categoryPlot0.setRangeGridlineStroke(stroke30);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer35);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        java.util.List list15 = categoryPlot0.getCategories();
        categoryPlot0.setRangeCrosshairValue((double) 'a');
        int int18 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke6 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot7.setRangeAxes(valueAxisArray11);
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer15);
        java.awt.Stroke stroke17 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.clearDomainMarkers((int) '#');
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis((int) 'a', valueAxis17, false);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean22 = categoryPlot13.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot13.setDomainAxis((int) (short) 0, categoryAxis24);
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot0.getDomainAxisEdge();
        java.awt.Paint paint29 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        boolean boolean10 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis24, false);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (short) 100);
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getDomainMarkers(layer12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(0, valueAxis15);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot0.removeAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot8.getRangeMarkers(layer16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot8.setRangeAxes(valueAxisArray19);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot8.setDomainAxes(categoryAxisArray21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation23, false);
        org.jfree.data.category.CategoryDataset categoryDataset27 = categoryPlot0.getDataset(15);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(categoryDataset27);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        int int18 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getDomainMarkers(layer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        java.util.List list22 = categoryPlot0.getCategoriesForAxis(categoryAxis21);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setRangeCrosshairPaint(paint9);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot13.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot13.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot13.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot29.getDomainAxisLocation((-1));
        categoryPlot13.setRangeAxisLocation(axisLocation33, false);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation33, true);
        org.jfree.data.category.CategoryDataset categoryDataset38 = categoryPlot0.getDataset();
        int int39 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.Marker marker41 = null;
        org.jfree.chart.util.Layer layer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) '4', marker41, layer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(categoryDataset38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot6.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot13.setInsets(rectangleInsets14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = null;
        categoryPlot13.setFixedLegendItems(legendItemCollection16);
        java.awt.Paint paint18 = categoryPlot13.getNoDataMessagePaint();
        categoryPlot12.setBackgroundPaint(paint18);
        categoryPlot6.setRangeCrosshairPaint(paint18);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot6.getRangeMarkers(10, layer22);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor24 = categoryPlot6.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot0.setRenderer((int) (short) 10, categoryItemRenderer27, false);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot0.setRangeAxis((int) (byte) 0, valueAxis31, false);
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNotNull(categoryAnchor24);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        int int18 = categoryPlot0.getDomainAxisIndex(categoryAxis17);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        java.lang.String str18 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxis(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot21.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo26, point2D27);
        categoryPlot21.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        double double38 = categoryPlot31.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot39 = categoryPlot31.getRootPlot();
        double double40 = categoryPlot31.getRangeCrosshairValue();
        categoryPlot21.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = categoryPlot21.getInsets();
        categoryPlot0.setInsets(rectangleInsets42, true);
        boolean boolean45 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Category Plot" + "'", str18, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(plot39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        double double16 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(categoryAxis17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        categoryPlot0.setWeight((int) (byte) 100);
        double double14 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        float float18 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        java.awt.Font font14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot0.getDataset((-1));
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) '4');
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        boolean boolean20 = categoryPlot0.render(graphics2D16, rectangle2D17, (int) '4', plotRenderingInfo19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot21.getDomainAxisEdge((int) '4');
        categoryPlot21.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot21.setRenderer(categoryItemRenderer28);
        categoryPlot21.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot21.getDomainMarkers(layer32);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot21.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation34);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        float float16 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge17);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes((double) 0.5f, plotRenderingInfo10, point2D11);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot11.setDomainAxes(categoryAxisArray28);
        categoryPlot0.setDomainAxes(categoryAxisArray28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        int int32 = categoryPlot0.getDomainAxisIndex(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis(1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        int int29 = categoryPlot19.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot19.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation31);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        int int7 = categoryPlot4.getDomainAxisIndex(categoryAxis6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis((int) (short) 100, categoryAxis9, false);
        java.awt.Image image12 = null;
        categoryPlot4.setBackgroundImage(image12);
        float float14 = categoryPlot4.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot15.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo20, point2D21);
        categoryPlot15.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge((int) '4');
        categoryPlot25.setAnchorValue((double) (short) 1);
        double double32 = categoryPlot25.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot33 = categoryPlot25.getRootPlot();
        double double34 = categoryPlot25.getRangeCrosshairValue();
        categoryPlot15.setParent((org.jfree.chart.plot.Plot) categoryPlot25);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = categoryPlot15.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets36);
        categoryPlot0.setAxisOffset(rectangleInsets36);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets36);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) -1, 101, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        categoryPlot6.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot6.setRenderer((int) (short) 100, categoryItemRenderer28, false);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        double double12 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot0.setRenderer((int) (short) 1, categoryItemRenderer14, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = null;
        categoryPlot17.setFixedLegendItems(legendItemCollection20);
        java.lang.Object obj22 = categoryPlot17.clone();
        categoryPlot17.clearDomainMarkers(100);
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot17.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot17.setRangeAxis(valueAxis28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot17.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot0.setDomainAxis(categoryAxis32);
        categoryPlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(drawingSupplier30);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        java.util.List list13 = categoryPlot0.getCategories();
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        java.awt.Paint paint16 = categoryPlot0.getOutlinePaint();
        java.lang.Object obj17 = categoryPlot0.clone();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRendererForDataset(categoryDataset11);
        org.jfree.chart.axis.AxisLocation axisLocation14 = null;
        categoryPlot0.setDomainAxisLocation(10, axisLocation14, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder18 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Paint paint19 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        double double11 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getRangeMarkers(layer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        int int17 = categoryPlot14.getDomainAxisIndex(categoryAxis16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis((int) (short) 100, categoryAxis19, false);
        java.awt.Image image22 = null;
        categoryPlot14.setBackgroundImage(image22);
        categoryPlot14.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot14.markerChanged(markerChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot14.getInsets();
        categoryPlot0.setInsets(rectangleInsets29);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        java.awt.Paint paint8 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer10, false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot0.getDataset();
        int int14 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo17, point2D18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis22);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation18 = null;
        categoryPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation18, true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) '4');
        boolean boolean9 = categoryPlot0.isSubplot();
        categoryPlot0.setAnchorValue((-1.0d));
        org.jfree.chart.plot.Marker marker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Stroke stroke18 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.Plot plot20 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot6.getColumnRenderingOrder();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot6.mapDatasetToRangeAxis((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(sortOrder25);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(categoryItemRenderer12, false);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        categoryPlot13.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation19);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(plotOrientation19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Stroke stroke18 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setWeight(15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer22);
        java.awt.Paint paint24 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        categoryPlot17.clearDomainMarkers();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        categoryPlot0.setWeight((int) (short) -1);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getDomainAxisLocation(10);
        org.jfree.chart.axis.AxisLocation axisLocation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(15, categoryItemRenderer12, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation15, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        int int22 = categoryPlot0.getWeight();
        java.awt.Stroke stroke23 = categoryPlot0.getRangeGridlineStroke();
        int int24 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot0.getOrientation();
        java.awt.Stroke stroke16 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint18 = categoryPlot17.getRangeGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) '4');
        boolean boolean9 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(15, categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(valueAxis11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] { valueAxis8 };
        categoryPlot5.setRangeAxes(valueAxisArray9);
        categoryPlot5.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean14 = categoryPlot5.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot5.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation15);
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation15, plotOrientation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis();
        java.awt.Image image15 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset((int) (byte) 100);
        categoryPlot0.setRangeCrosshairValue(10.0d, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        double double21 = categoryPlot14.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot22 = categoryPlot14.getRootPlot();
        double double23 = categoryPlot14.getRangeCrosshairValue();
        int int24 = categoryPlot14.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot25.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        int int28 = categoryPlot25.getDomainAxisIndex(categoryAxis27);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        categoryPlot25.setDomainAxis((int) (short) 100, categoryAxis30, false);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot25.getRangeMarkers(layer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot25.setRenderer(categoryItemRenderer35, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        categoryPlot38.markerChanged(markerChangeEvent39);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = categoryPlot38.getDomainAxisEdge((int) '4');
        categoryPlot38.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot38.setRenderer(categoryItemRenderer45);
        java.awt.Paint paint47 = categoryPlot38.getRangeCrosshairPaint();
        categoryPlot25.setRangeCrosshairPaint(paint47);
        categoryPlot14.setRangeGridlinePaint(paint47);
        categoryPlot14.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = categoryPlot51.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = null;
        int int54 = categoryPlot51.getDomainAxisIndex(categoryAxis53);
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        categoryPlot51.setDomainAxis((int) (short) 100, categoryAxis56, false);
        org.jfree.chart.util.Layer layer59 = null;
        java.util.Collection collection60 = categoryPlot51.getRangeMarkers(layer59);
        categoryPlot51.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder63 = categoryPlot51.getRowRenderingOrder();
        categoryPlot14.setColumnRenderingOrder(sortOrder63);
        categoryPlot0.setRowRenderingOrder(sortOrder63);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(categoryAxis52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(collection60);
        org.junit.Assert.assertNotNull(sortOrder63);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        boolean boolean10 = categoryPlot0.isSubplot();
        java.lang.String str11 = categoryPlot0.getPlotType();
        categoryPlot0.mapDatasetToRangeAxis(10, 101);
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        float float9 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor10 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset((int) (byte) 1, categoryDataset12);
        categoryPlot0.setBackgroundImageAlpha((float) 1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAnchor10);
    }
}

