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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) 10);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 'a');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) 0, (double) (short) -1);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 0L, (float) (short) -1, (float) (byte) -1);
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
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) ' ', (float) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 1L, (float) (byte) 10, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 10L, 0.0d);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 0, (double) 10L);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (byte) -1, 10.0f, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 10.0f, 1.0f, (float) (byte) 10);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) '#');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0, (double) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1, (float) 100L, (float) (short) -1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1), (float) (short) 10, 1.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 0L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (-1.0d), 0.0d);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) 10, (double) (short) 1);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape18);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (byte) 0, (double) 100.0f);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, (double) (byte) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) (-1), 10.0f);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, (double) 1L, 100.0f, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape34, (double) 0L, (double) (-1.0f));
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
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 10, (float) 1, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1L), (float) (byte) 1, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) (byte) 0);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) '4', (float) (-1), (float) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, 1.0d, (double) 100L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) (byte) 10, (float) 0L, (float) ' ');
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.clone(shape37);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape37);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape19);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (-1L), (float) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor13, 100.0d, 100.0d);
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
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) (byte) -1, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 1L, (double) 100);
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) 10, 1.0d);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (-1.0d), 0.0d);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) 100.0f, (double) (short) 10);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) (byte) 10, 1.0f, (float) (byte) 10);
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
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, 0.0d, (double) '4');
        java.awt.Shape shape35 = null;
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape35);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, 0.0f, (float) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) (byte) -1, 10.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape11);
        java.lang.Class<?> wildcardClass14 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, 0.0d, (float) 10, (float) (short) 0);
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape23);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape26, (double) 10, 0.0f, (-1.0f));
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
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), 1.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1L), (float) (short) 1, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape29);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape38, (double) (-1.0f), 0.0d);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape38);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape38, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape38, 1.0d, (double) (byte) 0);
        boolean boolean50 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape49);
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape54, (double) (-1.0f), 0.0d);
        boolean boolean58 = org.jfree.chart.util.ShapeUtilities.equal(shape52, shape54);
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape54, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape54, 1.0d, (double) (byte) 0);
        java.awt.Shape shape66 = org.jfree.chart.util.ShapeUtilities.clone(shape65);
        boolean boolean67 = org.jfree.chart.util.ShapeUtilities.equal(shape49, shape66);
        java.awt.Shape shape70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape66, (double) 0.0f, (double) 0L);
        boolean boolean71 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape66);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape66, 0.0d, (float) 100L, (float) (-1L));
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
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape65);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shape70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 10, 0.0d);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, 10.0d, (double) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 'a', (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) (-1L), 0.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (short) -1, (float) (-1), (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 100.0d, (float) (byte) -1, (float) 1L);
        java.lang.Class<?> wildcardClass17 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 10, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.lang.Class<?> wildcardClass24 = shape19.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1, (float) (short) 1, 10.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 100, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 'a');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, 0.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (-1.0d), (double) (short) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (short) 100, 1.0f, 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor11, (double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (byte) 10, (float) 1, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 'a', (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0, (float) 'a', (float) 0L);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor13, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) '4');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) -1, (float) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, (double) '4');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) 10, (-1.0f));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass15 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, 0.0f, (float) '4');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 1.0d, (float) 100L, (float) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1L), (double) 1);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) '#', (float) '#', (float) (short) 10);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape23);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) (short) 100, (float) 0, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape17);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor29, (double) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, 10.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 1.0d, (double) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 100.0d, (double) 10.0f);
        java.awt.Shape shape18 = null;
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape18);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape22);
        java.awt.Shape shape24 = null;
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape24);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape29);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape33);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 0);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape44, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, (double) 100.0f, (double) ' ');
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean54 = org.jfree.chart.util.ShapeUtilities.equal(shape51, shape53);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean58 = org.jfree.chart.util.ShapeUtilities.equal(shape53, shape57);
        boolean boolean59 = org.jfree.chart.util.ShapeUtilities.equal(shape41, shape53);
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape41, (double) (-1L), (float) 10, (float) 'a');
        boolean boolean64 = org.jfree.chart.util.ShapeUtilities.equal(shape33, shape63);
        boolean boolean65 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape69 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, rectangleAnchor66, (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
            java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor35, (double) 'a', (double) (-1L));
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) '#');
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
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
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass25 = shape16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 100, (double) 1.0f);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape43, (double) (short) 10, (float) (byte) 100, (float) 100L);
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
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape47);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 100, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 10, (float) 10, 1.0f);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 0.0f, 1.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 100.0f, (float) (-1L), (float) 100);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) 100L, 0.0f);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) 1, (float) (short) 10, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (-1L), (double) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (double) (byte) -1, (double) (short) -1);
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 1.0d, (double) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) '#', (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) 'a', (float) 10, (float) ' ');
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
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1L, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.lang.Class<?> wildcardClass41 = shape32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) 10L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) 100, (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100, (-1.0d));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 100, 1.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 'a', (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0, (float) 'a', (float) 0L);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), (double) 100L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, 10.0d);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (short) 10, (double) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 10, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 10, (float) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 'a');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1.0f, (double) 1L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), 100.0d);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 0.0d, (double) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1L), (double) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100.0f, (double) ' ');
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 100.0f, (double) ' ');
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape33, shape35);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape33);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) '#', (double) (short) 0);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape43, (double) (short) 100, (double) 100.0f);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.clone(shape48);
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape49, (double) (short) 0, (double) (-1L));
        boolean boolean53 = org.jfree.chart.util.ShapeUtilities.equal(shape43, shape52);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape43, (double) (short) 100, (float) 100, (float) 100L);
        java.awt.Shape shape61 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape57, (double) (short) 100, (float) 100L, 10.0f);
        boolean boolean62 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape61);
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(shape63);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, (-1.0f), (float) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1), (float) ' ', (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape24, (double) 100, (float) 10, (float) (short) 100);
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
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) '#', (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
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
        org.junit.Assert.assertNotNull(shape53);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 1L);
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 0L, (double) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 0, (double) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) 1L);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape17);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) (short) 1, (double) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 0L);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape29);
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
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 0, (float) (byte) 100, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) '#', 100.0f, 0.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) (byte) -1);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (-1.0d), (float) 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) 0.0f, (float) 10L, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (-1.0f), (float) (short) -1);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, 100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) ' ', (double) (short) 1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 10L, (double) (short) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.lang.Class<?> wildcardClass36 = shape33.getClass();
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.Class<?> wildcardClass28 = shape27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 10);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 1L, (float) (short) -1, (float) '#');
        java.lang.Class<?> wildcardClass17 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) ' ', (double) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape17);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 10L, (float) ' ');
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape26);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) 1L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) 0L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 100.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100, 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.lang.Class<?> wildcardClass18 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) 1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) (-1L), 0.0f, (float) 100L);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (byte) 10, 1.0f, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) ' ', (float) (byte) 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (short) 1, (float) 10, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) (short) 10, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (-1));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 0, (double) (short) 100);
        java.lang.Class<?> wildcardClass14 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, 100.0f, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 100, (float) (byte) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100.0f, (double) 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor5, (double) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) 10L, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.lang.Class<?> wildcardClass8 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape21);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape24, (double) 10.0f, 0.0f, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 0, 1.0f, (float) 100L);
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, 10.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) 0L, (float) (byte) 1, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', 10.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 100, (float) 100L, (float) ' ');
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
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 100, (float) (short) -1, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass5 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) 1, 1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) (short) -1, (float) (short) 10);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) 0, (double) 100.0f);
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
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, (double) 100.0f, (float) 1, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape15, (double) (byte) 1, (float) (short) 0, (float) 10);
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.lang.Class<?> wildcardClass6 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) 'a', (float) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100L, (-1.0d));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        java.lang.Class<?> wildcardClass14 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 'a', (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1L), (float) (byte) 10, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.lang.Class<?> wildcardClass5 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        java.lang.Class<?> wildcardClass36 = shape34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10L, (-1.0f), (float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor6, (double) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100, (float) ' ', 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) 100.0f, (float) (byte) -1, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 10, (float) (byte) 0, 0.0f);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
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
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor4, (double) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape3 = null;
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) ' ');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape7);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (short) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (short) -1, (float) (short) 10, (float) (short) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) -1, (float) (-1L), (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) (short) 0, 0.0f, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '#', (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100L, (double) 10L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) -1, (float) 0, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 100.0f, (double) ' ');
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) 100.0f, (double) ' ');
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape37, shape39);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape37);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape37, (double) '#', (double) (short) 0);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape49, (double) (-1), (float) (short) -1, (float) 10);
        boolean boolean54 = org.jfree.chart.util.ShapeUtilities.equal(shape47, shape53);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape47, (double) (short) 0, (double) (short) 100);
        boolean boolean58 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape57);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) ' ', (double) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor12, (double) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) (byte) -1, (float) (byte) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (-1.0d), 100.0f, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) '#', (double) 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (-1));
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 1, (float) 1L, (float) (-1L));
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor16, (double) 10L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) -1, (float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) '4', (float) (-1L), (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor11, (double) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 1.0d, (-1.0f), 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, rectangleAnchor39, (double) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 1.0d, (double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor10, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 10, (float) (-1), (float) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, rectangleAnchor21, (double) (-1L), (double) (short) 1);
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
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 100.0f, (float) (byte) 100, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, (double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, 10.0d);
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10.0f, (float) (short) 0, (float) (-1));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape20);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape20);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape20);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape39);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape33, shape36);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape36);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) '#', 10.0d);
        boolean boolean48 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape20, (double) 10L, (float) 10L, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 0);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 100.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (short) -1, (double) 'a');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape19);
        java.lang.Class<?> wildcardClass24 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1.0f), 0.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        java.lang.Class<?> wildcardClass12 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.lang.Class<?> wildcardClass55 = shape19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor20, (double) 'a', (double) (byte) 10);
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
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) 100, (double) 10);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape32);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) (byte) 0, (double) 10L);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.clone(shape40);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) 10, (double) 0.0f);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape44);
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
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', 100.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) '#', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, rectangleAnchor36, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100.0f, (double) (short) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 10L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 100, (float) 10L, (float) '#');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) 1L, (float) (byte) 100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, 1.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1, (float) 0, (float) 10L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) 1, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 1L, (float) '4', (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100L, (double) 0L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape18);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (short) -1, 0.0f, (float) 0);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor25, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (-1.0f), 0.0d);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 1.0d, (double) (byte) 0);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 100L, (float) (byte) 10, 1.0f);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape30);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape56 = org.jfree.chart.util.ShapeUtilities.clone(shape55);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.clone(shape55);
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtilities.clone(shape55);
        java.awt.Shape shape61 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean62 = org.jfree.chart.util.ShapeUtilities.equal(shape55, shape61);
        java.awt.Shape shape66 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape61, (double) 1.0f, (float) (short) 10, (float) (short) 10);
        java.awt.Shape shape67 = org.jfree.chart.util.ShapeUtilities.clone(shape66);
        boolean boolean68 = org.jfree.chart.util.ShapeUtilities.equal(shape51, shape66);
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
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertNotNull(shape67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 100L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) -1, (double) '4');
        java.awt.Shape shape9 = null;
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (short) 10, 0.0f, (float) (byte) 100);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape23);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape23);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape34);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape34, (double) 0, (float) (-1), (float) (short) 1);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape42, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape51, (double) 10, (double) (byte) 10);
        boolean boolean55 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape51);
        boolean boolean56 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape51);
        boolean boolean57 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape51);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, 0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor9, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 0.0f, (float) (short) 0, 0.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, 10.0d, (float) (short) 100, (float) (byte) 100);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) -1, (float) ' ', (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 10);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass7 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 'a', (double) '#');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0, (float) 'a', (float) 0L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, 1.0d, (float) 100, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (-1.0d), (float) (-1), (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) ' ', (double) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.lang.Class<?> wildcardClass12 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 'a', 10.0d);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 100L, 0.0f, (float) '4');
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, 1.0d, (float) 100L, (float) (byte) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) (-1L), (double) 1);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) '#', (float) '#', (float) (short) 10);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape39);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) (byte) 1, (float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 1, (float) 'a', (float) (byte) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 1L, 10.0f, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100L, (double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor5, (double) 100.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, 0.0d, (float) (short) 0, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 100, (double) (byte) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor7, (double) ' ', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape16);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, 0.0d, (double) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor23, (double) '#', 10.0d);
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
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (-1));
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.Class<?> wildcardClass24 = shape20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (short) 100, 0.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) '4', 0.0f, (float) (-1));
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape15, (double) (byte) 0, (float) (short) -1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '#', (double) (byte) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, 0.0d, 1.0f, (float) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor15, (double) (byte) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 1.0f, (float) 1, (float) (short) 10);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, rectangleAnchor19, (double) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) (short) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) ' ', (double) (short) 1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100, (double) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 1.0d, (double) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (short) -1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 1L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 10, (float) (-1), (float) (short) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 0, 1.0f, (float) 100L);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape21);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) 100.0f, (double) ' ');
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape34);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape36, (double) (byte) 10, (float) (short) 1, (float) 1L);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape40);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) ' ', (double) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 'a', 0.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1L, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 10, (float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 10.0f, (double) (-1));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 10, 1.0f, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) -1, (double) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor16, (double) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 10, (float) '#', (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) ' ', (double) (short) -1);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100, (double) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '#', (double) 10.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100L, (double) 10L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape12);
        java.lang.Class<?> wildcardClass15 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 10, (double) 1.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor9, 100.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 0, (float) (short) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 10L, (-1.0f), (float) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) '#', (float) (byte) 10, 1.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (short) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) (byte) 1, (float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.lang.Class<?> wildcardClass14 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 1, 100.0d);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 1.0d, (float) '4', (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) 100, (float) 10L, (-1.0f));
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 1L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 0.0d, 100.0f, (float) (byte) 1);
        java.lang.Class<?> wildcardClass8 = shape7.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        java.lang.Class<?> wildcardClass24 = shape3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1L), (double) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 10L, 0.0f, 0.0f);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 1, (double) 10L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 0, (double) 1L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 0L, (-1.0d));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.lang.Class<?> wildcardClass12 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10L, (float) (byte) 0, (float) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape28);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape28);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape28);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, 0.0f, (float) '4');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) ' ', (float) ' ', (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 1, (float) 1);
        java.lang.Class<?> wildcardClass14 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 0.0f);
        java.lang.Class<?> wildcardClass17 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 1, (float) (short) 1, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 'a');
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) '4');
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.awt.Shape shape31 = null;
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape31);
        java.lang.Class<?> wildcardClass33 = shape28.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 100.0d, (float) (byte) -1, (float) 1L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100, 1.0f, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 0, 1.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 10, (float) 0L, (float) ' ');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, 1.0d, (float) '4', (float) (-1L));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 'a', (double) '#');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0, (float) 'a', (float) 0L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, (double) ' ', 0.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor4, (double) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 10.0d, (float) 10L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape8, (double) (-1), 10.0f, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, (double) 100.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, (double) (-1.0f));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) (byte) 0, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (byte) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, (float) 10L, (float) (byte) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor9, (double) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) 10L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100, (double) 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, 0.0d, (float) 1, (float) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (-1L), (double) (byte) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', (double) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 0.0f);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, 0.0d, (float) '4', (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) '4');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, 0.0f, (float) '4');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, 0.0f, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
            java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, rectangleAnchor30, (double) 0.0f, 0.0d);
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, (double) 10.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) 100, (float) (short) 0, (float) (-1L));
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, (float) (byte) 1, 10.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape15, (double) (short) 0, 1.0f, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0L, (double) (-1.0f), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 0, (double) 10L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 10, (double) (-1L));
        java.lang.Class<?> wildcardClass17 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape13);
        java.lang.Class<?> wildcardClass18 = shape13.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (short) 1, (double) 10L);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape17);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) ' ', (double) (short) 1);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, 0.0d, 10.0f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) -1, (double) (byte) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 1, (float) (short) 100, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) 10L, (float) (byte) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) '4', (double) 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, 1.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (double) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1, (float) (byte) 1, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 100, (float) (short) 10, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) 0, (float) (byte) 10, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 0, (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) 1, 1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) (short) -1, (float) (short) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape35);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape32);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape29);
        java.lang.Class<?> wildcardClass41 = shape27.getClass();
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
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (-1.0d), 0.0d);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) 10, (double) (short) 1);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape18);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) (byte) 0, (double) 100.0f);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape18);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1.0f, (double) (byte) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, 100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 10);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, 0.0d, (float) 100L, (float) (short) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (short) 10, (float) 100L, (float) 1);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) (short) -1, (float) 100, (float) (-1L));
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (short) 10, (double) 100L);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (byte) -1, (float) (byte) -1, (float) 10);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape43);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, 0.0d, (double) 100);
        boolean boolean48 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape47);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape47);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100L, (double) (short) -1);
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
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor11, (double) 0.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) -1, 0.0f, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100, (float) 100L, (float) (short) -1);
        java.lang.Class<?> wildcardClass6 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1L, 100.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), (double) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) (byte) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (-1.0d));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (byte) 1);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (short) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 1.0f, (double) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass13 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 0.0d, (double) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) 10.0f, (float) (short) 100, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, (float) (short) 1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) (short) 10, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (double) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (short) -1, (float) (byte) 10, 0.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.clone(shape37);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape38, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape41, (double) 1.0f, (double) 100L);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape41);
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape30, shape41);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean52 = org.jfree.chart.util.ShapeUtilities.equal(shape48, shape51);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        boolean boolean56 = org.jfree.chart.util.ShapeUtilities.equal(shape48, shape55);
        boolean boolean57 = org.jfree.chart.util.ShapeUtilities.equal(shape41, shape48);
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
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, 100.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, 0.0f, (float) '4');
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 'a', (double) 10.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) -1, (double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, rectangleAnchor20, (double) 10L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) (-1), (float) 10L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 'a', (double) 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) -1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, 1.0d, (float) (short) 100, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100.0f, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape23);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) '#', (double) (short) 0);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) (short) 100, (double) 100.0f);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape36);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape40);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 100, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 10, (float) 10L, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape38, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.clone(shape38);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape31, shape42);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape44);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, rectangleAnchor47, (double) 100L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shape46);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 100, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) '4', 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor18, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10, (float) 10, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0, (float) ' ', (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1, (double) 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.lang.Class<?> wildcardClass13 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1L), (double) 10L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) ' ', (float) (byte) 0, 100.0f);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) ' ', (float) 0L, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape17, (double) '#', (float) 10L, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1.0f, (float) (short) 10, (float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (-1), 100.0f, 10.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) '#', (double) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (short) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) 100.0f, (double) ' ');
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape31);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape29);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape43, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.clone(shape50);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape51, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape51, (double) (byte) 0, (double) 10L);
        boolean boolean59 = org.jfree.chart.util.ShapeUtilities.equal(shape47, shape51);
        boolean boolean60 = org.jfree.chart.util.ShapeUtilities.equal(shape35, shape51);
        boolean boolean61 = org.jfree.chart.util.ShapeUtilities.equal(shape29, shape35);
        java.awt.Shape shape64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) (short) 1, 10.0d);
        boolean boolean65 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape64);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shape64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 'a', (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100L, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (byte) 1, (float) 10L, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 10, (float) (byte) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (byte) 1, 100.0d);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 10.0d, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape32, (double) (short) 1, (float) 0, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 0.0d, (float) (short) 100, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (short) 10, (double) 0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 10, (float) (byte) 100);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
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
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 0, (double) 10L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) (short) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (byte) 0, (double) 10L);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape30);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape30);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (short) -1, (float) (byte) 0, (float) 0L);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape43);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape43, rectangleAnchor45, (double) 1.0f, 0.0d);
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
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 0, (float) 0L, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1.0f), 0.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100.0f, (double) (byte) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor11, (double) 10L, (double) 100);
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
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 10L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (byte) 1, 100.0d);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape30);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, 0.0d, (double) 1);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape27);
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
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 100, (float) 100L, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) -1);
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, 10.0f, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, 10.0d, (float) (byte) 0, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        java.awt.Shape shape31 = null;
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape31);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100.0f, (double) ' ');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) ' ', (float) 1, 1.0f);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 10.0d, (float) (short) 100, (float) '4');
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 10, (float) 100L, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 1, 100.0d);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) ' ', (float) 100L, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 10.0d, 0.0d);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) '#', (-1.0f));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 'a', (float) 10, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape22);
        java.lang.Class<?> wildcardClass24 = shape22.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 0, (double) (short) 1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 10, 0.0f, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, 0.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) '#', (float) (byte) 10, (float) 10);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape19);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (-1L), (double) 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) (short) 0, (float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1, (float) 0, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (short) 100);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 100.0f, 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor11, (double) (byte) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 100.0d, (float) 0, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, (double) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, (double) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (double) 0L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, (double) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, rectangleAnchor8, 0.0d, (double) (byte) 100);
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.awt.Shape shape0 = null;
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
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape44);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape44, (double) (byte) 1, (double) 0);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shape48);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 1L, (double) 1.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1), (double) '#');
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100L, (double) 0L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape19);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100, (double) 1.0f);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) (short) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor2, 10.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10L, (double) (short) -1);
        java.lang.Class<?> wildcardClass29 = shape28.getClass();
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
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0, (double) (byte) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, (double) 100L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) (-1.0f));
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, 0.0d, (float) 100, (float) (short) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 100, (-1.0d));
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape27);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 0, (float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.clone(shape38);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape38);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape35, shape38);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape35);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape35);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) '#', 10.0d);
        boolean boolean47 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape35);
        java.lang.Class<?> wildcardClass48 = shape19.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) 10, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, (double) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape17);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape17);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) 0L);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape31, (double) (byte) 100, (float) 10L, (float) (byte) -1);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) '4', (double) 100.0f);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape35);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, rectangleAnchor40, (double) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 10L, (double) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, (double) (short) 0, (double) (byte) 1);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape22);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 1.0d, (float) '#', (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) ' ', (float) (-1L), (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass8 = shape7.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 100, (float) (-1L), (float) (short) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (byte) -1, (float) (byte) 1, (float) (short) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 100, (float) (-1L), (float) (-1L));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape33);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, 0.0d, (float) (byte) 1, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (-1.0d), 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 1, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape20, 0.0d, (float) 'a', (float) ' ');
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
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) '#');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, 10.0f, (float) (-1));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (-1L), (float) 10, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 1.0f, (double) (byte) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor10, 10.0d, (double) 0);
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
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) (short) 0, (float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) '#', (double) (byte) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 0.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass12 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 0);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 10L, 100.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor17, (double) (short) 10, (double) ' ');
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
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (short) 100, (double) (byte) -1);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) 10L, 0.0d);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape24);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) (-1), (float) (-1), 0.0f);
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
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100L, (double) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, 100.0f, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) ' ', 0.0f, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0, (double) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, rectangleAnchor18, (double) 100L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) '#', (double) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 100L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (byte) 1, 100.0d);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape19);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 100, (float) '#', (float) (-1));
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape32);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) (-1.0f), 10.0f, (float) 100);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape33);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.clone(shape33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape39, (double) (byte) 1, (float) (byte) 100, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) -1, (float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) 100L, (float) (short) 100, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 1L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape37, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape37);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean47 = org.jfree.chart.util.ShapeUtilities.equal(shape44, shape46);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape50, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean55 = org.jfree.chart.util.ShapeUtilities.equal(shape44, shape50);
        boolean boolean56 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape44);
        java.awt.Shape shape59 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape59, (double) 100L, (double) (byte) 10);
        boolean boolean63 = org.jfree.chart.util.ShapeUtilities.equal(shape44, shape59);
        boolean boolean64 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape44);
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
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shape59);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 0, (float) (short) 10, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (-1));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 100.0f, (double) ' ');
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (short) 10, (float) 10, (float) 0);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape27);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        org.junit.Assert.assertNotNull(shape2);
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 1.0d, (double) (short) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', 1.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (-1));
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) (byte) -1, (float) 10L, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) (short) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) ' ');
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) (short) -1);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        java.lang.Class<?> wildcardClass20 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, 0.0d, (float) (short) 1, (float) (short) 1);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 10.0d, (double) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 'a', (float) (byte) 100, 10.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 0.0f, 100.0d);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, 0.0d);
        java.lang.Class<?> wildcardClass8 = shape7.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (byte) 1, (double) 100L);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) ' ', (float) 0L, (float) (byte) 10);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) (-1L), (float) (-1L), 0.0f);
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
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 100, (double) (byte) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 0, (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, (double) 1.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 1.0f, (double) 100L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (-1.0f), 0.0d);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) 100.0f, (double) (byte) 1);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, 1.0d, (double) 1);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape27);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100, (double) 1.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape31);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (short) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (short) 10, 10.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.lang.Class<?> wildcardClass12 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0L, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) '4', (float) 1, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor11, (double) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (byte) 1, 100.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 100L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) (-1), 100.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 100L);
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 100.0f, (double) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100.0f, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape23);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) '#', (double) (short) 0);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) (short) 100, (double) 100.0f);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape36);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape40);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, (float) '#', (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape45, (double) (short) 100, (float) 1, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shape45);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, rectangleAnchor26, (double) (byte) 0, (double) 0.0f);
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
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) '4', (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (short) 10, (float) (byte) 10, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1, (float) (byte) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 100, (float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (-1.0d), 0.0f, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) 1L, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (short) 1);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor7, (double) 0.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), (double) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

