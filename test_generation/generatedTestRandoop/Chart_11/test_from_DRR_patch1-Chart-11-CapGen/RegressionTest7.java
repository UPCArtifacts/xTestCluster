import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1, 10.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) ' ');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor4, (double) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (byte) 1, (float) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, 0.0d, 1.0f, 10.0f);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) -1, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape26 = null;
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape26);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (byte) 0, (double) (short) 1);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape30);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) 1, 1.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, 100.0f, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) (short) 0, (double) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, 100.0d, 100.0f, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 'a', 10.0d);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 0.0f, (float) ' ', 100.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, 1.0d, (float) '#', (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) 10, (float) (short) 0, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (-1.0d), (double) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass6 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 'a', (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0, (float) 'a', (float) 0L);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape18);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, 0.0d, 0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor23, (double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) (short) -1, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 10.0d, (float) 10L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, (double) 0.0f, (float) 0, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1L, (double) 1.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (-1), (double) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) 0L, (float) (byte) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, rectangleAnchor29, (double) '#', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) (short) -1, (float) 1L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 'a', (double) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '#', (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 10, (float) 0L, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) (byte) 10, 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100.0f, (double) ' ');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) 100.0f, (double) ' ');
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape26);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) '#', (double) (short) 0);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) (short) 100, (double) 100.0f);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.clone(shape41);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape42, (double) (short) 0, (double) (-1L));
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape45);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, 0.0d, (double) (-1L));
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape56 = org.jfree.chart.util.ShapeUtilities.clone(shape55);
        java.awt.Shape shape60 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape56, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape60, (double) 100L, (double) 0L);
        java.awt.Shape shape64 = org.jfree.chart.util.ShapeUtilities.clone(shape63);
        boolean boolean65 = org.jfree.chart.util.ShapeUtilities.equal(shape52, shape63);
        boolean boolean66 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape52);
        boolean boolean67 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape52);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(shape60);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertNotNull(shape64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape39, 10.0d, (float) 10, (float) 10);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape35, shape39);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) 100L, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape47);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 10, (float) 100L, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 0, (double) 10L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100L, (float) (byte) -1);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape13);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (-1.0f), 0.0d);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) (byte) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) 1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1L), (double) (short) -1);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape21);
        java.lang.Class<?> wildcardClass23 = shape21.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) '4', 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1, (double) (-1L));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0L, (float) (byte) -1, 10.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape14);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor18, (double) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) 10, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 1, 100.0d);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) '4');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, 0.0f, (float) '4');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 1L, (double) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 100, 0.0d);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 100, 1.0f, (float) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) (-1.0f), (double) 0.0f);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape27);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (short) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape20);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape20);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 0L);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape34, (double) (byte) 100, (float) 10L, (float) (byte) -1);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape38, (double) '4', (double) 100.0f);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape38);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape38);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (-1.0d), (double) (short) 0);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 10L, 0.0f, 0.0f);
        java.lang.Class<?> wildcardClass22 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (-1.0d), (float) (short) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (short) 10, (float) 1L, (float) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, (double) 1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 10, (float) 0, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0L, 10.0f, (float) (short) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), (double) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor13, (double) (-1.0f), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 10L, 0.0f, 0.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) -1, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, 10.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) '#', (double) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 10L, (-1.0f), (float) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape14);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 1L, (double) (short) 0);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, 1.0f);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape28);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) (byte) 10, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor4, (double) 1.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) -1, (float) (short) 0, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), 0.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) 10.0f, (float) (-1L), 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 1L, 0.0f, 10.0f);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10L, (-1.0f), (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1L, (float) 100, (float) (-1));
        java.awt.Shape shape10 = null;
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) (byte) 1, 100.0d);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape20);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (-1.0d), (double) (short) -1);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, 0.0d, (double) '4');
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape30);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape30);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor9, (double) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100, (double) (short) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 1.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10, (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1.0f, (double) 1L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 1.0d, 0.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 0, (float) (-1L), (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, 1.0d);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (-1.0d), 0.0d);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 100.0f, (double) (short) 10);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape31);
        java.awt.Shape shape33 = null;
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape31, shape33);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, 10.0d, (-1.0f), (float) 100);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 1.0f, (double) 100L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '4', (float) (byte) 0, (float) (byte) -1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (-1.0f), 0.0d);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (short) 1, 0.0d);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, rectangleAnchor31, 0.0d, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 10, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, 100.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 0, (float) (byte) 10, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) ' ');
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape28);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape31);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, 100.0d, (float) (byte) -1, (float) (byte) 10);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) (short) 0, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape39, (double) (-1), (float) 10L, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 100, (float) (short) -1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor12, (-1.0d), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 10);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 1, 0.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 100.0d, (float) (short) -1, (-1.0f));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) (-1.0f), (double) ' ');
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape23);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) (short) 0, (double) (-1L));
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape38);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, 0.0d, (double) (-1L));
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape42, (double) 0.0f, (float) (short) 100, 0.0f);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.clone(shape46);
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
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape47);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (-1.0d), (double) (byte) 10);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape12);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 100.0d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape13);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) '4', (float) 0, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) ' ', (float) '4', (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (double) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 'a', (float) (short) 100, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) (short) 0, (double) (-1));
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape41, (double) 10, 0.0f, (float) (byte) 0);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, 0.0f);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape45, shape48);
        boolean boolean50 = org.jfree.chart.util.ShapeUtilities.equal(shape38, shape45);
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
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, 1.0f, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (-1.0f), 0.0d);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape7);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, 10.0d, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (byte) 100, (float) (-1), 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) 100L, (float) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) -1, (float) 100, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 0.0d, (double) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 0, (double) 10L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 10, (double) (-1L));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape27);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape32);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape32, (double) 100, 1.0f, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 1, (double) (byte) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) (byte) -1);
        java.awt.Shape shape3 = null;
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1L), (double) 10L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape21);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape21);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) 'a', (float) 100, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1.0f, 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 100L, 100.0d);
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 'a', (float) 100L, (float) (byte) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape22);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) '4', (double) 100L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape28);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0.0f, (float) 0, (float) 'a');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 1, 100.0d);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (-1.0d), (double) (short) -1);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape33);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape26);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, 1.0d, (double) 100L);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape26);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape41, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape45, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape49, 0.0d, (double) 0.0f);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape49, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape59 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape55, (double) (-1), 0.0f, (float) (short) 0);
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        boolean boolean63 = org.jfree.chart.util.ShapeUtilities.equal(shape55, shape62);
        boolean boolean64 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape62);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape59);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '#', (float) 'a', (float) (short) 10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, 10.0d, 0.0f, (float) '4');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) '#');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, rectangleAnchor27, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 10.0f, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, 0.0d, (float) (byte) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) 100L, (float) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) -1, (float) 100, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 0, (float) 10, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) '#', (float) (short) 0, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) (short) 100);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 10.0d, (double) (byte) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) (byte) 0);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) (-1L), (-1.0f), (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) '4', (float) (-1L), (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1L), (double) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 0, (double) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 0, 1.0f, (float) 100L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (-1.0d), (float) (-1L), (float) (short) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 100, (float) (short) 10, 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 10.0f, (double) '4');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100.0f, (double) ' ');
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 1, (double) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (-1.0d), 0.0d);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape34, (double) 10, (double) (short) 1);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape34);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape32);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 1L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '4');
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10, (float) (byte) -1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass12 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) 100L, 0.0f, (float) '4');
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape30);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape23);
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
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 10, (float) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 0, (double) 1L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape24, (double) (byte) 10, (float) ' ', (float) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100.0f, (float) 1, (float) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor10, (double) 1.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 'a', (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0, (float) 'a', (float) 0L);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape18);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) -1, (float) (short) 100, (float) (short) -1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, 100.0d, (float) 'a', 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, rectangleAnchor28, (double) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 0.0d, (double) 0);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.lang.Class<?> wildcardClass10 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, 10.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 'a', (double) 100.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (short) 0, 1.0f, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) 0.0f, (float) 0, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10L, (double) '4', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 1, (double) (byte) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (-1.0f), (float) 0, (float) (-1));
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) 1);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (short) 10, (float) (-1), (float) '#');
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 1L, 100.0d);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape34);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (short) 10, (double) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (byte) 1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) (byte) 0);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 0, 1.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 10, (float) ' ', (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1L), (float) (byte) 100, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (short) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) ' ');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) (short) 100, (float) 100, (float) 100L);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape44, (double) (short) 100, (float) 100L, 10.0f);
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape48, (double) 0L, (float) (-1L), (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape48, (double) ' ', 10.0f, (float) ' ');
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
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape52);
    }
}

