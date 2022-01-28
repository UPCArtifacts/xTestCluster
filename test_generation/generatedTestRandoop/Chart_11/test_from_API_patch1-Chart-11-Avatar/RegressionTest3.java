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
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) 0L, (float) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor7, (double) (short) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) 10L, (float) (byte) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) '4', (double) 100.0f);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (byte) 1, (float) (byte) 1, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 1, (double) (byte) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 0, 1.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) (byte) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (-1), (float) ' ', (float) 10);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor12, (double) 10L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) ' ', (float) 100L, 0.0f);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) (byte) 100, (float) '4');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) (byte) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1.0f), 0.0d);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape6 = null;
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape6);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor22, (double) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 100, (float) (-1L), (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) 1L, (float) 0, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0.0f, (double) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100L, 1.0f, (float) (short) 100);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (-1), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1), (double) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1), (double) 10.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) 100, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) -1, (float) (byte) -1, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 10.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 0, (double) 10L);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape22);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape22);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1), (double) '4');
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape34);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.lang.Class<?> wildcardClass14 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (short) 0, 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, (float) (byte) 0, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) (byte) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10.0f, (float) 0L, (float) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor6, (double) (byte) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100L, 1.0f, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape16, (double) (short) 100, (float) '#', (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) 100.0f, (double) ' ');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape27);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape31);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape27);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1L), (float) 10, (float) 'a');
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape37);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 10, (float) 10, (float) 1);
        java.lang.Class<?> wildcardClass43 = shape42.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) 1, 1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0L, (-1.0f), (float) 100L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) ' ', (double) (short) -1);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 100.0f, (float) (short) 0, (float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape18);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 0.0f, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 0L, (float) 1L, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) (short) -1, 0.0f, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 0.0f, 10.0f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) '#', (float) '4', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10, 1.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 'a', 100.0f, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) (short) 100, 100.0f, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, 100.0d, 0.0f, (float) '4');
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) (byte) 0, 0.0f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, (double) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) -1, 1.0d);
        java.lang.Class<?> wildcardClass14 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 'a', (double) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 0, (float) '4', (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, 10.0d, (double) (-1L));
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.lang.Class<?> wildcardClass17 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 1.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 0.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 1, (float) 100L, (float) '4');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (double) '4', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 10, (float) 'a');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, 10.0d, (double) '4');
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) (byte) 1, 100.0d);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape32);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape32, 1.0d, (float) '4', (float) (short) 10);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) 0.0f, 10.0d);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape40);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.clone(shape40);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, rectangleAnchor46, (-1.0d), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape45);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) -1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (byte) 10, 100.0f, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, 0.0d);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0L, (double) (-1L));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, (float) (short) -1, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) 10L, 0.0f, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, 1.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 1.0f, (float) 10L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) (byte) 10);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, (double) (byte) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) ' ', (float) (byte) 10, (float) 1L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 10, 10.0f, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1, (float) 1L, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1), (float) 'a', 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) '#', (double) (short) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 100, (double) 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, rectangleAnchor33, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, (double) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) '#', (float) (byte) 100, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 1.0d, (double) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1.0f, (double) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 10, (double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor8, (double) 'a', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, (float) (short) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (short) 0, 1.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape20);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape20);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 100L, (float) 0, (float) (byte) 1);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (byte) -1, (float) 1, (float) (short) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) 10, (float) (byte) 10, 1.0f);
        java.lang.Class<?> wildcardClass36 = shape27.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor6, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor7, (double) (byte) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 1, 100.0d);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) 1, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) 100, (float) (short) 10, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 100.0f, (double) ' ');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape22);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) '#', (double) (short) 0);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) (short) 100, (double) 100.0f);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape35);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.clone(shape38);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape39);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape45);
        boolean boolean47 = org.jfree.chart.util.ShapeUtilities.equal(shape39, shape42);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        java.lang.Class<?> wildcardClass49 = shape48.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 10, (double) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        java.lang.Class<?> wildcardClass10 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, 1.0d);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape24);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) '#', (float) (short) -1);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) -1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, 1.0d, (float) 0, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 10, (float) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) (byte) 10, (float) 100);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 0, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (short) -1, (float) (byte) 1, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) (byte) 0, (float) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor25, (double) '#', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1L, (double) 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (-1.0f), 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape20);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape16, (double) (-1L), (float) 10L, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (-1), (float) (-1), (float) (short) 10);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (byte) 10, (float) 10, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (byte) 1, (float) (byte) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) -1, 0.0f, (float) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape24);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) '#', (double) 100L);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 100L, (double) 1.0f);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape33);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (short) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 10, 1.0d);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (-1.0d), 0.0d);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) 100.0f, (double) (short) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape32);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape32);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, 10.0d, (double) 100.0f);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape39);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, rectangleAnchor44, (double) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 0L, (double) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 0, (double) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1L), 0.0f, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 0.0d, (double) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1L), (double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor14, (double) 100.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 1L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) '#', (double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor7, (double) (byte) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 100, (float) (-1), (float) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor23, (double) 0.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) (byte) 1, 100.0d);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape28);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, 1.0d, (float) '4', (float) (short) 10);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) 0.0f, 10.0d);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape36);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) 0, 0.0d);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) 100.0f, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape46);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) -1, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 0, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, (double) 'a', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) 1, 1.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, 100.0f, (float) (byte) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) (-1.0f));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (short) 1, (double) 10L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, (double) (short) 0, (float) 1, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) -1, (float) ' ', (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) '4');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) -1, 100.0f, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 100, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 10, (float) 10, 1.0f);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, (double) 10.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor11, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 0, (float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor23, (double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 1.0d, (float) 0L, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 1, (float) 'a', 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape18);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 0.0d, (double) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor25, 10.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (short) 10, (float) 10, (float) 0);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape20, (double) 10L, (float) '4', (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (-1.0f));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 100.0f, (double) ' ');
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape29);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape26);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape22);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 100, (float) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor44, (double) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape43);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) '#', (float) (short) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 0, (float) ' ', (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1.0f), (float) (byte) 10, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 1.0d, (double) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 10, (float) (-1), (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape21, (double) 1L, (float) (-1), 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (-1), (float) 10L, (float) 10);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 10.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape9);
        java.lang.Class<?> wildcardClass11 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) -1, 100.0f, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 100L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (short) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 10.0d, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) (byte) 1, (float) 100, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (-1.0d), (float) 'a', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, 100.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 10, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (short) 10, (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 1, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.lang.Class<?> wildcardClass21 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) (short) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 1, 100.0d);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 0L, (double) '4');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) ' ', (float) 1, (float) 0);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape23);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, 10.0f, (float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 0, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 10, (double) (-1L));
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor26, (double) (byte) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 'a', (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 1.0f, 10.0f, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape14);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape14);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (byte) 10, (float) (byte) 0, 0.0f);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape30);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 0.0f, (float) '4', 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape35, (double) 0.0f, (float) ' ', (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 1, (float) '4', (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 100, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) '4', 0.0f, (float) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor12, (double) (byte) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 1L, (float) (byte) 0, (float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, rectangleAnchor22, (double) 0.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (byte) 1, 100.0d);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape18);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape32, (double) (-1.0f), 10.0f, (float) 100);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape32);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape43);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape47, (double) 1.0f, (double) 100L);
        boolean boolean51 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape47);
        boolean boolean52 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape40);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, (double) (byte) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 10, (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 1L, (float) (short) -1, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, 0.0d, 0.0f, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 1);
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape24);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape24);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape35);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape24, (double) 0L, 10.0f, (float) 1);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape40);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) (short) 100, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 1, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (short) 10, (float) 10, (float) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (short) 10, (double) 100L);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, (double) 1L, (float) 0L, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 1.0f, 10.0f);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) -1, (double) ' ');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 100, (float) 1L, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) (byte) 100, (float) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor18, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 1, 100.0d);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor21, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 100L);
        java.lang.Class<?> wildcardClass9 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, (double) (byte) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 10, (double) 1.0f);
        java.lang.Class<?> wildcardClass17 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape20);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) '#', (double) (short) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape32, (double) (-1), (float) (short) -1, (float) 10);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape36);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape38, (double) 10, (float) (short) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape38);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, (float) '#', (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, rectangleAnchor16, (double) (short) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (-1.0d), (float) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape12);
        java.lang.Class<?> wildcardClass21 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass9 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 1, (float) (short) 0, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, (double) 1.0f);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) '#', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 10L);
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor5, (double) (byte) 1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor10, 10.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 1.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor13, 10.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) (short) 100);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 0L, (float) 'a', (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape20);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) '#', (double) (short) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (short) 100, (double) 100.0f);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) (short) 0, (double) (-1L));
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape39);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) (byte) 1, (float) 1, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape30, (-1.0d), (float) 100, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (short) -1, (-1.0f));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (-1.0f), (float) 0L, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (byte) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass5 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) 0);
        java.lang.Class<?> wildcardClass15 = shape14.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) 10, (double) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 1.0f, 10.0d);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (short) 1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) (-1), 0.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape32);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.clone(shape40);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape41, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape41, (double) (byte) 0, (double) 10L);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape37, shape41);
        boolean boolean50 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape41);
        boolean boolean51 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape25);
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (short) 1, 10.0d);
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape54, (double) (byte) 1, (float) 'a', (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNotNull(shape58);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, 10.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape18);
        java.lang.Class<?> wildcardClass20 = shape18.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (short) 0, 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (-1.0f), (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1L), (double) 1.0f);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1, (float) (byte) 100, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1.0f), 0.0d);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 10.0d, (double) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 'a', (double) (short) -1);
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) (byte) 10, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (short) 0, 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 10, (float) 'a', (float) 1L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (short) 1, (double) '4');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape23);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) '4', (double) 100L);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, rectangleAnchor30, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 100);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (short) 1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 10.0d, (-1.0f), 1.0f);
        java.lang.Class<?> wildcardClass13 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (short) -1, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) '4', (float) 100L, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) 10L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (-1.0f), (float) 10, (float) (byte) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor14, (double) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0.0f, (double) '#');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, 1.0f, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor16, (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 10, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) 100L, (float) (short) 1, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (short) 100, (float) 100, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 0, 0.0f, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) (byte) 100, (float) 0, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (-1.0f), 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (short) 10, (double) (short) 100);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (-1.0f), 0.0d);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape18);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, 1.0d, (double) (byte) 0);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape18);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (-1));
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape34);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 1L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) '#', (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) (short) 1, (float) ' ', (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 100, (double) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 100.0d, (float) 1, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0.0f, (float) 0, (float) 'a');
        java.lang.Class<?> wildcardClass10 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 0, (double) 10L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape24);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape24);
        java.lang.Class<?> wildcardClass28 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (short) 1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (-1.0f), (float) (byte) 0, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (-1.0f));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 100.0f, (double) ' ');
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape29);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape26);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape22);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 100, (float) (-1L));
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape43);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) '#', (float) (short) 0, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) (byte) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 0, (double) 10L);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 10, (double) (-1L));
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape33);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape33);
        java.lang.Class<?> wildcardClass36 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 0.0f, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 100, (float) 100, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 1.0f, 10.0f);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) -1, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 0.0f);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape21, (double) (byte) 100, (float) 0, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1L), (double) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, 0.0f, (float) (-1));
        java.lang.Class<?> wildcardClass16 = shape15.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, 0.0f, (float) '4');
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 1.0d, (float) 100L, (float) (byte) 10);
        java.lang.Class<?> wildcardClass14 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) 10L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.lang.Class<?> wildcardClass17 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor9, (double) (byte) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) 10.0f, (float) 1L, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 1.0f, 0.0d);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100L, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) 10.0f, (float) '4', (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) ' ');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) ' ', (double) 0);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 100, (float) (byte) 100, (float) (byte) -1);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 1.0d, (float) 0, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) ' ', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) (short) 0, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (byte) -1, (float) '4', (float) (byte) 100);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 1, 100.0d);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 100, (float) '#', (float) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, 10.0d, 0.0f, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, 1.0d, (float) (byte) 10, (float) (byte) -1);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, 0.0f, (float) '4');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 1L, (double) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, 100.0d, (float) ' ', (float) 'a');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 0.0d, (double) (byte) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor12, (double) 1L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100L, (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0L, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 100, (float) (-1L), (float) (short) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) -1, (float) (byte) 1, (float) (short) 0);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) '#', (float) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape23, (double) (-1L), (float) 10L, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) '4', (double) 10L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor11, (double) ' ', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 0L, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor6, (double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) '#', (float) (byte) 10, (float) 10);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) (byte) 1, (float) '4');
        java.lang.Class<?> wildcardClass14 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, (double) '4', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) (-1L), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (-1), (float) (-1), (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, 1.0f, (float) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '4', (float) (-1), (float) 100);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 100, 100.0f, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (-1.0d), 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 10, (double) (short) 1);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) (-1L), (float) (-1L), 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 10L, (float) (byte) 1, 10.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor21, (double) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (short) 1);
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape19);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape23);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape19);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (-1L), (float) 10, (float) 'a');
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape29);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, (float) 0, (-1.0f));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 100L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 1, (double) 0);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape29);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 1L, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 0, 1.0f, (float) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) 10, (double) 0L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (-1), (double) 1.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (double) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor10, (double) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), 0.0d);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, 1.0d, (double) (byte) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100L, (float) (byte) 10, 1.0f);
        java.lang.Class<?> wildcardClass28 = shape22.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) 10L, (float) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 1, (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor15, (double) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), 0.0d);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, 1.0d, (double) (byte) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape22);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor25, (double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 100L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 10L, (float) (byte) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor8, (double) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (short) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (short) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 10, 1.0d);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (-1.0d), 0.0d);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) 100.0f, (double) (short) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape32);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape32);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, 10.0d, (double) 100.0f);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape39);
        java.lang.Class<?> wildcardClass44 = shape39.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) (short) 10, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) 0.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, (double) 0);
        java.lang.Class<?> wildcardClass9 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 10, (float) 'a');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, 10.0d, (double) '4');
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, 10.0d, (float) 10, (float) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape30);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape12);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape24, (double) 0L, (float) 1L, 1.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, rectangleAnchor29, (double) 1.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) 'a', (float) 10, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, (double) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) -1, 1.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 1.0d, (float) (-1), (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) (short) 0, (float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) ' ', (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1.0f, (float) 100L, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 0, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.lang.Class<?> wildcardClass15 = shape14.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 100, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) '4', 0.0f);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) (short) 10, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) (byte) 10, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) (short) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 'a', (float) ' ', (float) (short) -1);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, (double) (-1));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (short) 0, (float) (short) 10, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape14);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape23);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape27);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape21);
        java.lang.Class<?> wildcardClass34 = shape21.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor4, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 0, (double) 100.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 1.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0.0f, (float) (short) 0, 0.0f);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.lang.Class<?> wildcardClass16 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10, (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) 0);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor10, (double) (short) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape13);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape19);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) 100.0f, (double) ' ');
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) 100.0f, (double) ' ');
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape42);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape40);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape46, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.clone(shape53);
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape54, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape61 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtilities.clone(shape61);
        java.awt.Shape shape66 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape62, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape69 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape62, (double) (byte) 0, (double) 10L);
        boolean boolean70 = org.jfree.chart.util.ShapeUtilities.equal(shape58, shape62);
        boolean boolean71 = org.jfree.chart.util.ShapeUtilities.equal(shape46, shape62);
        boolean boolean72 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape46);
        java.awt.Shape shape75 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) (short) 1, 10.0d);
        boolean boolean76 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape40);
        java.awt.Shape shape79 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) (-1.0f), (double) (short) 10);
        java.lang.Class<?> wildcardClass80 = shape40.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertNotNull(shape69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(shape75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(shape79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (-1.0f), 0.0d);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 1.0d, (double) (byte) 0);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape23);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) 1L, (float) 100L, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), 0.0d);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (float) '#', (float) (short) 1);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100L, 1.0f, (float) (short) 100);
        java.lang.Class<?> wildcardClass16 = shape15.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 0, 0.0f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) 'a', (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 100L, (float) 100L, (float) ' ');
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10L, (-1.0f), (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100.0f, (float) (byte) -1, 100.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 100.0f, (double) ' ');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape22);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) (byte) 1, 100.0d);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape31);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, 1.0d, (float) '4', (float) (short) 10);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, (double) 0.0f, 10.0d);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape39);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape22);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape47, (-1.0d), (float) (short) 0, (float) (-1L));
        boolean boolean52 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape51);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape51, rectangleAnchor53, (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape16);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 0, 0.0f, 100.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 0L, (float) '#', (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 1, 100.0d);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), (double) (-1.0f));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) '#', (float) 'a', (float) (byte) 10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 10.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, 0.0d, (float) '#', (float) (short) -1);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape24);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0L, 10.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 1, 100.0d);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) (byte) 1, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100, (float) ' ', 0.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 0L, (float) (short) 10, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 100.0d, 0.0f, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) 10L, (float) (byte) -1, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 1, 100.0f, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (-1), (float) ' ', (float) 1L);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 100, (float) 1, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) '#', (double) 1.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1.0f, (float) (short) 10, (float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (-1), 100.0f, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, rectangleAnchor19, (double) (short) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) -1, (float) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor14, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 1, 0.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape9);
        java.lang.Class<?> wildcardClass11 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) 100L, (float) (short) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (-1));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 10.0f, 1.0f, (float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, rectangleAnchor24, (double) ' ', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) (-1));
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor8, (double) (short) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, 1.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 10.0d, 0.0f, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.lang.Class<?> wildcardClass18 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 1.0f, (double) (-1.0f));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (-1));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) -1, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape12);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) (byte) 10, (float) (byte) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 0L);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 100.0d, (double) '#');
        java.lang.Class<?> wildcardClass5 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        java.lang.Class<?> wildcardClass5 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 10.0f, (float) ' ', (float) (byte) 10);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) '4');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 1, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, 0.0d);
        java.lang.Class<?> wildcardClass8 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, (float) 0, (-1.0f));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 100L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 1, (double) 0);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape29);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape35);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) (-1L), (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) 100, (double) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) -1, 100.0f, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) -1, (float) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, (double) 100L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 1, (float) 'a', 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, (double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor9, (double) 1L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1), (float) (-1), (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, 1.0f, 10.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 10, (float) 'a');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (-1), 100.0f, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), (float) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 100.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) 10L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) (short) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, 1.0f, 10.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100, (float) 1L, 100.0f);
        java.lang.Class<?> wildcardClass15 = shape14.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 1, 10.0f, (float) (byte) -1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10, (-1.0f), (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.lang.Class<?> wildcardClass11 = shape7.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 10L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 0);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 100.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.lang.Class<?> wildcardClass17 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.lang.Class<?> wildcardClass12 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 0, (float) 100, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1.0f, 10.0d);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass21 = shape20.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 100, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor11, (double) (short) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 100.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) '4', (double) 100L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape27);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) ' ', (double) (short) -1);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape31);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape31);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor35, (-1.0d), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, (-1.0f), (float) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape21, (double) '#', (float) 10L, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.lang.Class<?> wildcardClass5 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor9, (double) 100.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 100, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor15, (double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 0, (float) 'a', (float) 'a');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, 100.0d, (double) 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 1.0f, (double) 100L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, (double) (byte) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 1, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) ' ', (float) (byte) -1, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) '#', (float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, (double) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor5, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 10, (float) 'a');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, 10.0d, (double) '4');
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, 0.0d, (float) 100L, (float) 10);
        java.awt.Shape shape32 = null;
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape34);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape31, shape32);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.clone(shape32);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape38);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) ' ', (double) (short) -1);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape16);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 100.0f, (float) (short) 0, (float) '#');
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (short) 1, 10.0d);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape16, (double) 10L, (float) (byte) 0, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor12, (double) (short) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 10L, (float) (byte) 1, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, rectangleAnchor13, 1.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) (short) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 0, (double) 10L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor14, (double) 0.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) 100.0f, (double) ' ');
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape32);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape36);
        java.awt.Shape shape38 = null;
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape38);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape38);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (-1));
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0, (double) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1, (float) 100L, (float) (short) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (-1.0d), (double) (byte) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 10.0d, 100.0f, (float) 'a');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 10.0f, (float) (short) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, 0.0d, 0.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (short) 0, (float) (short) 100, (float) '4');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) (short) 0, (float) (short) 10, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) (byte) 1, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) 1L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) 0L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) ' ', 0.0f, 100.0f);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) (-1.0f));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape16);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, 0.0d, (float) (short) -1, 100.0f);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape28);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10, (double) (byte) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, rectangleAnchor8, (double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1L), 0.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 1, 100.0d);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 1.0d, (float) '4', (float) (short) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 0.0f, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) (byte) 0, (float) (byte) 1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 0, (double) 10L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape24);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape24);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) 10);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape30);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) 1, (double) 10.0f);
        java.lang.Class<?> wildcardClass35 = shape34.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) 10);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 'a', (float) ' ', (float) (short) -1);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 0.0d, 1.0f, 10.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 0.0f, 0.0f, (float) (byte) 0);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 'a');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 100L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, (float) (byte) 100, 0.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass18 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }
}

