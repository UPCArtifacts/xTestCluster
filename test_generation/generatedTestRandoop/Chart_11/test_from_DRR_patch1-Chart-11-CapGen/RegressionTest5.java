import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 10, (float) 10, (float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, rectangleAnchor21, (double) (short) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) 0, 0.0f, (float) 10);
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
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) 0, (float) 10L, (float) ' ');
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 100, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape23, 0.0d, (float) (byte) -1, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', 100.0f, 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 0.0d, (double) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) 1.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape18);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 0.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass28 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, 0.0d, (double) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, rectangleAnchor27, (double) (byte) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) (-1), (float) (short) -1, (float) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape35);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 0, (double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, rectangleAnchor40, 1.0d, (double) 10L);
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
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 1.0f, (float) (short) 0, (float) 1L);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) (byte) 0, (double) (byte) 1);
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
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 0);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor21, 100.0d, (double) 1);
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
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) 1L);
        java.awt.Shape shape6 = null;
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) ' ', (double) 0);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1.0f), (float) (byte) -1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100L, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 0.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) -1, (double) 10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 100.0f, (float) (-1), (float) 100);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (short) 10, (double) (short) 100);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape26);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 1, (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) ' ', (double) (byte) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 10.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 100.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (short) -1, (float) (byte) 10, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) 100L, (float) 0L, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 100, (double) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(100.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 0, (double) 10L);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 10, (double) (-1L));
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor21, (double) (-1.0f), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) ' ', (double) (short) 1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor26, (double) 10L, (double) 1);
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
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 0.0d, (-1.0f), (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) 100L, (double) 0L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape22);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, 0.0d, 0.0d);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape31);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) (-1), 10.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 10.0f, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (-1L), (float) (byte) 100, (float) (short) 10);
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 1.0d, (double) (byte) 0);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.lang.Class<?> wildcardClass13 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (-1.0d), (float) (short) 100, (float) '#');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor16, 100.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 0, (double) 1L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 'a', (float) (-1), 100.0f);
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
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 0, (float) (-1L), (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) '4', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor17, (double) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (-1.0d), (double) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape23);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape16);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, 0.0d, (float) '4', (float) (-1));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, 0.0d, (double) (short) 0);
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) 0, (double) 10);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) 100, (double) (byte) 1);
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
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape43);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 100L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, (float) (byte) 100, 0.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 0, (float) (short) -1, (float) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, rectangleAnchor21, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 0, (float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.lang.Class<?> wildcardClass23 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, 100.0d, (float) (byte) 10, (float) 0);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (-1), 0.0d);
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
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape27);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape27);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape30);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, 100.0d, (float) (byte) -1, (float) (byte) 10);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (byte) 1, 0.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape40);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 1, 100.0d);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (-1L), (double) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 100.0d, (double) '#');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 100.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (byte) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (-1.0f), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (-1), (double) 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor13, (double) (-1L), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (-1.0d), (float) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape26);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape28);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (-1.0f));
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape40);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape47, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape47, (double) 100.0f, (double) ' ');
        boolean boolean55 = org.jfree.chart.util.ShapeUtilities.equal(shape44, shape47);
        boolean boolean56 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape44);
        boolean boolean57 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape40);
        java.awt.Shape shape60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100L, (double) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shape60);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor14, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 1, (float) 1L, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.lang.Class<?> wildcardClass10 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 10, (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 100, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) '4', 0.0f);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) (short) 1, (float) 'a', 0.0f);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape32, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape36);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape36);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape26);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) (-1L), (double) (short) 100);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape23);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 100.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) ' ', (float) 10L, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) (short) 0, (float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) '#', (double) (byte) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 0.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass12 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (-1.0d), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) (short) 100);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 'a', (double) 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor6, (double) 1L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) 0L, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) '#', (double) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100L, (double) 1.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10.0f, (float) '4', (float) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (byte) 1, (float) (byte) 1, (float) 0);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) 1L, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, (float) 0, (float) (-1));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10L, (float) (short) 100, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 0);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 100.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor16, (double) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) ' ', 1.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, (double) 10.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 1, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, (float) (short) 10, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', 100.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 10, (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 'a');
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) '4');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 100.0f, (float) '#', (float) 1L);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 10, (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, 10.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 0);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 10L, 0.0f, 0.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 10, (double) 100.0f);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 0, (float) 10L, (float) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 100, (double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor23, 1.0d, (double) '#');
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
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 10, (float) (-1));
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape18);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (-1.0d), 100.0f, 10.0f);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape61 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape57, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtilities.clone(shape57);
        java.awt.Shape shape65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape57, 100.0d, 0.0d);
        boolean boolean66 = org.jfree.chart.util.ShapeUtilities.equal(shape54, shape57);
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
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, 0.0d, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) 0, 0.0f, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100L, (float) ' ', (float) '4');
        java.lang.Class<?> wildcardClass20 = shape19.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) (-1), (float) (short) -1, (float) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape35);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 0, (double) (short) 100);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape39, (double) '4', 10.0f, (float) 100);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, (double) ' ', (double) 'a');
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
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape46);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 100L, (double) 0L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) -1, (float) (byte) 100, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (short) 10, (float) ' ', (float) 10L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) (byte) -1, 10.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) 0L, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (short) -1, (float) 10, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 0, (float) 10L, (float) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape29);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape29);
        java.lang.Class<?> wildcardClass32 = shape19.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (-1.0d), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, 0.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100.0f, (double) (short) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape36);
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
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 10, 0.0f, (float) (short) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) (-1L), (double) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 100.0f, (float) 1L, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) 10L, (float) (byte) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) -1, (float) (byte) 1, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1.0f, 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 0, (double) (-1L));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, 0.0f, (float) 10);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 100L, 0.0f, (float) '4');
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape34);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape27);
        java.awt.Shape shape37 = null;
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape37);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, 100.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 1.0f, 0.0d);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 100L, 100.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, 100.0d, (float) 10L, (float) 100);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (-1.0d), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape13);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape34);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape34);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        java.lang.Class<?> wildcardClass18 = shape8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor13, (double) 1, (double) 1L);
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
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (byte) -1, (float) 10, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 0, (double) 'a');
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
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1, (double) ' ');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) -1, (float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 0L, 100.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 10, (double) 1.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor9, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) '4', (float) '4', (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100, 0.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) 100);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape19);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 0, (float) 'a', (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) '4', (float) 1, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 'a', 10.0d);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 0.0f, (float) ' ', 100.0f);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, 1.0d, (float) '#', (float) 1L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, rectangleAnchor27, (double) (byte) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (byte) 0, (double) 10L);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape14);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, 0.0d, 0.0f, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 100, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 100L);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, 0.0d, (float) '4', (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (short) -1, (float) (short) 10, (float) (short) -1);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10L, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1), (double) 'a');
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
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 100L, (float) (short) -1);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor8, (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 0, 1.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, 0.0d, (float) (short) -1, 100.0f);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape22);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 0.0f, (double) 100L);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape29);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, 100.0d, (double) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (-1));
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) 0);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 100, (float) (byte) 100, (float) (byte) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10, (double) (short) 0);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape19);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 10, (float) 100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, 0.0d, (double) (-1L));
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape43, (double) (byte) -1, 0.0f, 0.0f);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.clone(shape50);
        boolean boolean52 = org.jfree.chart.util.ShapeUtilities.equal(shape43, shape50);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape43, (-1.0d), 100.0f, (float) 1);
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
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 'a');
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (short) 1, 0.0f, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) (short) 0, (float) '#', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape27);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape27);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape30);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) 0.0f, (double) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor16, (double) (byte) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 100, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) 0, (float) (byte) 100, (float) 1L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, rectangleAnchor12, 1.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (short) 10, (float) (byte) 0);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, 1.0f, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '#', (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (-1.0d), (double) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 0.0d, (double) '4');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 1.0f, 10.0f, (float) (-1));
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, rectangleAnchor27, (double) 100L, (double) (-1.0f));
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
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 10.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100L, (float) (short) 0, (float) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor13, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, 0.0f, (float) '4');
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 'a', (double) 10.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.lang.Class<?> wildcardClass17 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (short) -1, (float) (byte) 0, (float) (short) -1);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (byte) 1, (float) (byte) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) '4', (float) (-1), (float) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, 1.0d, (double) 100L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 100L, (double) 0L);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape29);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, 0.0d, 0.0d);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape29);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', 0.0f, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 100, (double) (-1.0f));
        java.lang.Class<?> wildcardClass32 = shape3.getClass();
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
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (-1));
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.lang.Class<?> wildcardClass7 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape7 = null;
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, 0.0f, (float) 10);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, 0.0d, (double) 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) (short) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100, (float) ' ', 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 0, 0.0f, (float) 10L);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (-1.0d));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 100.0f, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) 100.0f, (double) ' ');
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape34);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape32);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) '#', (double) (short) 0);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape42, (double) (short) 100, (double) 100.0f);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.clone(shape47);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape48, (double) (short) 0, (double) (-1L));
        boolean boolean52 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape51);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (short) 1);
        boolean boolean56 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape55);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        boolean boolean58 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape57);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) '4', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 10, (float) ' ', (float) 10L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0.0f, (double) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, 100.0f, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) (short) 100, (float) 100, (float) 100L);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape43, (double) (short) 100, (float) 100L, 10.0f);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape47, (double) (short) 100, (float) 10, (float) 0);
        java.lang.Class<?> wildcardClass52 = shape47.getClass();
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
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, 1.0f, 10.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 0.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape20);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) 1L, (double) 1.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape32);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, rectangleAnchor34, (double) (-1), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) 10L, (float) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) ' ', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor14, (-1.0d), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 1, 10.0d);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape32);
        java.lang.Class<?> wildcardClass34 = shape15.getClass();
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
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 100, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) (short) 0, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape18);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 0, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape13);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) (byte) 0, (float) 0L);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) 100L, (float) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor27, (double) (-1), (double) 1.0f);
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
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 1L, 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor7, 100.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, 100.0d, 0.0f, (float) (short) 0);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 1.0f, (float) 1, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 0, (float) 1L, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) 0L, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) 1, (float) 0L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 1, (double) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) -1, (float) (byte) 100, (float) (byte) 100);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) 1L);
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) 'a', (float) (short) 1, (float) 0);
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (-1.0d), (double) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 0.0d, (double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor17, (double) 1L, (double) 100L);
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
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100.0f, (float) 1L, (float) 0L);
        java.lang.Class<?> wildcardClass10 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 1, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) (byte) -1);
        java.awt.Shape shape4 = null;
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (-1L), (double) 10L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape22);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape22);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 1.0f, (float) (short) 0, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape32, 10.0d, 100.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) '4');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, 1.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, 0.0d, (float) (short) -1, 100.0f);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape22);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 0.0f, (double) 100L);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape29);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape15);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1L), (float) 10, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) (byte) 0, (float) (byte) 100, (float) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 0.0d);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) (short) 0, (float) (byte) -1, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 0.0d, (double) (-1));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, 0.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor7, (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, 10.0d);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 100.0d, (double) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10.0f, (float) (short) 1, 0.0f);
        java.lang.Class<?> wildcardClass9 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) 10L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) 0L, (float) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) (-1L), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10L, (float) (byte) 0, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) (-1), 100.0f, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1.0f, (float) (short) -1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 10, (float) (byte) 100, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) -1, (double) ' ');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1L, 0.0f, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 0.0f, (float) '4');
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 'a', (double) 10.0f);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape20, (double) 10, (float) (short) 100, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape30);
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
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) '4', (float) (-1), (float) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, rectangleAnchor12, (double) (-1.0f), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor15, (double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 0.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 'a', (double) 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 10.0d, (double) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 1, (double) 0L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 10L, (float) (byte) 0, (float) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (short) -1, 0.0f, (float) 0);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape36, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape36, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.clone(shape36);
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape45);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (short) 1);
        boolean boolean50 = org.jfree.chart.util.ShapeUtilities.equal(shape45, shape49);
        boolean boolean51 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape45);
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
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', 0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor28, (double) '#', (double) 1L);
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
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) (short) 1, (double) (-1L));
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
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 100L, (double) 0L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, 0.0d, 0.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, 1.0d, 0.0f, (float) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 10, (float) 100L, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 0.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.lang.Class<?> wildcardClass14 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (-1.0f));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.lang.Class<?> wildcardClass10 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (short) 100, (float) ' ', (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) (short) -1, (float) (short) -1, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10L, (double) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) -1);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) 10L, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10.0f, (float) (byte) 1, (-1.0f));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape24, (double) (short) -1, 0.0f, (float) 0);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10L, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (-1));
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor7, (-1.0d), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor9, 10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 'a', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 0, (double) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1, 0.0d);
        java.lang.Class<?> wildcardClass5 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) -1, (double) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 10, (double) 0.0f);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape13);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 1.0f, (double) '#');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 1.0d, 0.0f, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) (short) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) 1L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (-1.0f), (float) '#', (float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, (double) 10L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) 0L, (float) 0L, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) ' ');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) (short) -1);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor20, (double) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (byte) 1, (float) 1, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape20);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape20);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) '#', (double) 0);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, (double) 1.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1L, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) (byte) 10, (float) (byte) 1, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0L, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) '#', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 100.0d, (float) (byte) 100, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) ' ', (double) (short) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, 10.0d);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100, (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, (double) 10L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, (float) 0, (-1.0f));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 100.0d, (double) 10);
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
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) (short) 0, (float) '#', (float) (byte) -1);
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, rectangleAnchor25, (double) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 1);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 'a');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), 0.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10, (double) (short) 1);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (short) 0, 0.0d);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape23);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, (float) (byte) 1, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.lang.Class<?> wildcardClass10 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1.0f), 0.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (byte) 0);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (-1.0f), 0.0d);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, 1.0d, (double) (byte) 0);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.clone(shape33);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape34);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape34, (double) 0.0f, (double) 0L);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape34, (-1.0d), (float) (-1L), (float) '4');
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape43);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0.0f, (float) 0, (float) 'a');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 10.0f, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) (short) -1);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape23);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) (-1), (double) 0L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, (double) '4', (float) (short) 100, (float) 'a');
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 0, (double) 10L);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape16);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, 1.0d, (float) (byte) 10, (float) (byte) -1);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape12);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor80 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape83 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, rectangleAnchor80, (double) (short) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 0, (float) 'a', (float) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor15, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) (byte) 1, (float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (-1.0d), 0.0d);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, 100.0d, (float) (byte) -1, (float) 1L);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape30);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 10L, (float) (short) 1, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 1, 100.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), (double) (-1.0f));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        java.lang.Class<?> wildcardClass21 = shape18.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) (byte) 1, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, (double) (byte) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor8, (double) (byte) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, 0.0f);
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 'a', (double) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor8, 0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 'a', (double) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0, (float) 'a', (float) 0L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 100);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape11);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 1.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) -1, 0.0f, (float) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape19);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 1, 10.0d);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape32);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.lang.Class<?> wildcardClass35 = shape34.getClass();
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
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) '4', (double) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape24);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) ' ', (double) (short) -1);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) 'a', 0.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) 10, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) ' ', (float) 1L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, (double) 100L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor13, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 10.0d, (float) (short) 100, (float) (byte) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape22);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 100, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 100, (float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 1.0f, 10.0f, (float) '#');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) 10, (double) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 0L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (-1L), (float) (-1L), (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 1.0d, (double) (byte) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (byte) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '4', 1.0f, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10L, (double) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) -1);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.lang.Class<?> wildcardClass14 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) (short) -1);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape23);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) (-1), (double) 0L);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, (double) 0, 0.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (byte) 10, 1.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (-1.0d), 0.0d);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 100.0f, (double) (short) 10);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape24);
        java.lang.Class<?> wildcardClass29 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 10L, (float) (byte) 100);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), 0.0f, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) (short) 1, (float) (byte) 1, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '#', (float) 'a', (float) (short) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, rectangleAnchor23, (double) (byte) 10, (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (-1), (float) (byte) 1, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 100, (float) 1, 10.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 10, (float) (short) 10, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) 1.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 10, (double) (short) 1);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 0, (double) 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor21, (double) 1, 0.0d);
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
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, 0.0f, (float) '4');
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 'a', (double) 10.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, 0.0d, (double) 1L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape32);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape33);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (short) 10, (float) (byte) 10, (float) '4');
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape38);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) (-1));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) (short) -1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), 0.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 10, (double) (short) 100);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 10.0d, (double) (byte) 1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100L, (-1.0f), (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, (double) (byte) 100, (float) (short) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) (short) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) (byte) 10, (double) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 1.0f, 10.0d);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) (short) 1, 0.0d);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape29);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) 100.0f, (double) ' ');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape18);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) 100L, (float) ' ', (float) '4');
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape29);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) (byte) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) 100L, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) '4');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) -1);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 1.0d, (float) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1L), (double) 10L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1.0f, (float) '#', (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) 0L, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, 1.0d, (float) (short) 100, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1L, (double) (byte) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor8, (double) 10.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, (float) 0, (-1.0f));
        java.lang.Class<?> wildcardClass24 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 0.0f, (float) '4');
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 'a', (double) 10.0f);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 0.0d, (double) 1L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 0.0d, (float) (byte) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, 0.0d, 0.0f, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) 'a', (float) (-1), 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10.0f, (float) (byte) 1, (-1.0f));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape41 = null;
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape41);
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
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, 10.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) -1, (double) ' ');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.lang.Class<?> wildcardClass10 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (short) -1, (-1.0f));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), (double) ' ');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor11, 0.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) -1, (double) 1L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor9, (double) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 1L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor10, (double) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, rectangleAnchor25, (double) 100L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (-1L), (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, 0.0d, (float) 'a', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 1, (double) 10.0f);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) 1, (double) ' ');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 1.0f, (double) (-1L));
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape27);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) ' ', (float) 1, 1.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, rectangleAnchor17, 1.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 10);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.lang.Class<?> wildcardClass8 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1.0f), 0.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (byte) 0);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (-1.0f), 0.0d);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, 1.0d, (double) (byte) 0);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.clone(shape33);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape34);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 100, (double) 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor9, 10.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, 0.0d, (float) (short) 1, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) (short) 0, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) (short) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 0, (double) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) '#', (double) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100.0f, (float) (short) 100, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (-1.0d), (-1.0f), 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor21, (double) 10L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 100.0f, 0.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 10);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, (float) (short) 100, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, rectangleAnchor34, (double) (short) -1, (double) (short) 10);
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
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape18);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape33);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, 0.0d, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape33, 10.0d, (float) 1, 0.0f);
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
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 100, (double) 10.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 100L, 0.0f, (float) '4');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) 'a', (double) 10.0f);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, 0.0d, (double) 1L);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape21);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) (byte) 10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) (short) -1, (float) 1L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor12, (double) ' ', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, 1.0f, 10.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 0.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, rectangleAnchor22, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.lang.Class<?> wildcardClass11 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 0, (float) (byte) 10, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) (-1.0f));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 1L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 1.0d, (double) (short) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape28);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) ' ', (double) (short) -1);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape32);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) 100.0f, (float) (short) 0, (float) '#');
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape35);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape32);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape32);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '4', (float) (short) 1, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) '#', (-1.0f));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 'a', (float) 10, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        java.lang.Class<?> wildcardClass24 = shape22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0L, (double) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '#', (float) 'a', (float) (short) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, 100.0d, (float) ' ', 0.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) 10.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 100);
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (short) 1);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape43);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape45, (double) 0.0f, (float) 100L, (float) 100);
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
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape45);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) '#', (float) '#');
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.clone(shape48);
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape49, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape49, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.clone(shape56);
        java.awt.Shape shape60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape57, (double) (byte) 10, (double) 0);
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape57, (double) 1.0f, 10.0d);
        boolean boolean64 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape57);
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
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(shape60);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 100, 0.0f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 100, (double) (byte) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10L, (float) ' ', 1.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape15);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1L), (float) 10, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) '4', (float) ' ', (float) '4');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, 1.0f, 10.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape28);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape26);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape24);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        java.lang.Class<?> wildcardClass33 = shape32.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (-1), (float) (-1), (float) (short) 10);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, 0.0d, (float) 10L, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 1, (double) 0L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 0.0d, 10.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 'a');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100, (double) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (short) 1, (float) (byte) 1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) 10L, (float) 10L, (float) (byte) 100);
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, 1.0d, (double) (short) 100);
        java.awt.Shape shape28 = null;
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 10, (float) 10, 1.0f);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape30);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape28);
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 1);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass6 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1L, (float) (-1), 10.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (-1L), (float) (byte) 0, (float) '4');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 0.0f, (float) '#', (float) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) (byte) 10, (float) 10L, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100, (double) 1.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 0.0d, (float) 1, (float) ' ');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) -1, (float) 10L, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) '#', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, 1.0d);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (-1.0d), 0.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) 100.0f, (double) (short) 10);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) (-1L), (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (-1), (float) (short) -1, (float) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 0, (float) (byte) 0, (float) (-1L));
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape15);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 'a', 10.0d);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 0.0f, (float) ' ', 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) 100, (float) (-1L), (float) 100L);
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
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 10.0d, (float) (byte) 10, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, rectangleAnchor17, (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 'a', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 10.0d, (double) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 'a', (float) (byte) 100, 10.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) '#', 1.0f, (float) (short) 1);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 100.0f, (double) ' ');
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape27);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape24, (double) ' ', (float) 1, 1.0f);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape39, 0.0d, (float) 1L, (float) 10L);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape39);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 'a', (double) 10.0f);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (-1L), (float) 100, 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape21);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        java.lang.Class<?> wildcardClass28 = shape24.getClass();
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor6, (double) (byte) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, (double) (byte) 1, 100.0d);
        boolean boolean48 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape44);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape42, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape52, (double) 1.0f, 0.0d);
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) ' ');
        boolean boolean59 = org.jfree.chart.util.ShapeUtilities.equal(shape52, shape58);
        boolean boolean60 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape52);
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
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (-1.0f));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 0, 1.0f, (float) '#');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) (short) 1, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1L), (double) 10L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) ' ', (float) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (-1.0f));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1), (float) (byte) 1, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) -1, (float) 0, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) -1, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (-1.0d), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) 1L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), 100.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, 10.0d, 100.0f, (float) 'a');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape24);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) -1, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

