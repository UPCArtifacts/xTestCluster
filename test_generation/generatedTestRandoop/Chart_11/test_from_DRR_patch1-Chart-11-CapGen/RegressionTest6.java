import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (-1.0f), 0.0d);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, 1.0d, (double) (byte) 0);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape18);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) (-1.0f), 0.0d);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape23);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, 1.0d, (double) (byte) 0);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.clone(shape34);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape35);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) 0.0f, (double) 0L);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape39);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.clone(shape39);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape41);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) 1, (float) 0L, (float) 0L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 100.0d, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) (byte) 10, (float) '4');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (-1), (float) (byte) 10, (float) (byte) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, 1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape15);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) 10L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 0.0d, (float) 100L, (float) (byte) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) (short) -1);
        java.lang.Class<?> wildcardClass9 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) 10, 1.0d);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, (double) 'a', 100.0f, (float) 10);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) 0.0f, (float) 'a', 10.0f);
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
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, (double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor9, (-1.0d), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (short) 100, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 1.0f, (float) 1, (float) (short) 10);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, rectangleAnchor28, (double) '#', (double) (short) 100);
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
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 10.0d, (float) (short) 0, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (short) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, rectangleAnchor5, 100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 0, (float) (short) 0, (float) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, rectangleAnchor18, (double) 100L, (double) (byte) 100);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        java.lang.Class<?> wildcardClass21 = shape4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (byte) 100, 0.0f, (float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, 0.0d, (float) '#', (float) '#');
        java.lang.Class<?> wildcardClass19 = shape18.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) '#', (double) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 10, (float) 1L, 1.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, 0.0d, (double) (-1L));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 100L, (float) '#', 0.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) (-1.0f), 0.0d);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape33);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 1, (float) (byte) 0, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) (short) -1, (float) 1L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 10, (double) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 1, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (byte) 1, (float) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (double) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 100, (float) (byte) 100, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100.0f, (double) ' ');
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) 10, (double) 0.0f);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 10.0d, (float) '#', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (byte) 0);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 100, 0.0d);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) -1, (double) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor11, (double) 10.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) (short) 100);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (-1.0d), (double) (short) 0);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, (double) '4', (float) 0, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor45, (double) (byte) 0, 10.0d);
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
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (-1.0f), (float) (short) -1);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        java.lang.Class<?> wildcardClass8 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100L, (double) 0L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) (-1.0f), (double) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 10, (-1.0f), (float) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (short) 1, (double) 10L);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape14);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (-1L), (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape25, (double) 1L, (float) 10L, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.lang.Class<?> wildcardClass6 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) 1L, 0.0f, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, (float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1.0f, (double) 1L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 100.0d);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape16);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape16);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 10L, (double) 1L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, (float) (byte) 10, (float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) (byte) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (-1));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 0, (double) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape30);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape27);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape27);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) '#', 10.0d);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape27);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (-1.0f));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape23);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) 100.0f, (double) ' ');
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape30);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape27);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, 100.0d, (float) 100, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 10, (float) 100, (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor8, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 1L);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) (byte) -1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10.0f, (double) (short) -1);
        java.lang.Class<?> wildcardClass7 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 1, (double) 1.0f);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 0.0f, (double) (short) -1);
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
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 0.0d, (float) (-1), (float) '#');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) (-1.0f), 0.0d);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, rectangleAnchor24, (double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 100, 1.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) ' ', (float) (byte) 0, 100.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) (byte) -1, (double) ' ');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) 100, (double) (short) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        java.lang.Class<?> wildcardClass29 = shape28.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 'a');
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor7, (double) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) ' ', (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, (float) (byte) 100, 0.0f);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) '4', 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) ' ', (float) (short) 10, (float) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, rectangleAnchor22, (double) (short) 10, (double) '4');
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
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) 10);
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) '4', (float) 0, 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor19, 100.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 0L, (double) '4');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) ' ', (float) 1, (float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, 0.0f);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape18);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) -1, (float) (short) 10, (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 10, (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 0.0f);
        java.awt.Shape shape5 = null;
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape5);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (float) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor10, 1.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, (float) 1L, 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0, (float) (byte) 10, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (short) -1, (-1.0f));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor8, (double) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) -1, 0.0f, (float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor13, (double) (byte) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 0.0f, (float) (short) 1, (float) (short) 1);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, 0.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, 0.0f, (float) '4');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor23, (double) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (byte) 100, 0.0f, (float) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 0.0d, (float) '#', (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, 0.0d, 0.0f, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) (short) 0, (double) 10.0f);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.clone(shape30);
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
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape15);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape26);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 0L, 10.0f, (float) 1);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape15);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 100.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 0.0d, (float) (-1), (float) '#');
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 100L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) 'a', (float) 10, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) '#', (float) (-1), (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) 10, (-1.0f));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (byte) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 1, 100.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 100, (float) 'a', (float) (byte) 10);
        java.lang.Class<?> wildcardClass9 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1L, (double) 'a');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape26, (double) 100L, 0.0f, (float) '4');
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape30);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean36 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape23);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape37);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape37);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10L, 0.0f, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 10, (float) 10, (float) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) (short) 10, (double) 100L);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 'a', (float) 10L, (float) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, rectangleAnchor33, (double) 100, (double) 0L);
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
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) 1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, 0.0d, (float) 1L, (float) (-1));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, 0.0f);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape18);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) (short) 100, (float) 1, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        java.lang.Class<?> wildcardClass33 = shape29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (short) 1, (float) 1L, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (-1), 0.0f, (float) (short) 0);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, 0.0d, (float) 1, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) 'a');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) 0L, (float) ' ', (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) '4');
        java.lang.Class<?> wildcardClass7 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) 100.0f);
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
        org.junit.Assert.assertNotNull(shape46);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
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
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape45);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor6, (double) (-1.0f), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1.0f, (-1.0f), (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) '#', (float) (byte) 100, (float) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1.0f), 1.0f, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 10, (double) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) -1, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape6, (double) 1.0f, (float) (short) 10, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
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
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) 1, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor6, (double) 100L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) 10L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (short) 1, (double) 10L);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape16);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) ' ', (double) (short) 1);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape16);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 1.0f, (float) '4', (float) (byte) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (-1.0d), 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (short) 1, (double) 10L);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape17);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 100L, 0.0f, (float) '4');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.lang.Class<?> wildcardClass23 = shape6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) 1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor12, (double) (short) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (-1L), (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 1L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 10L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, (float) (byte) 10, (float) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) '4');
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) (short) 0, (double) (short) 100);
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
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, rectangleAnchor32, (double) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 100, (double) (byte) -1);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 10, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) '#', (-1.0f));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 'a', (float) 10, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape22);
        java.lang.Class<?> wildcardClass24 = shape7.getClass();
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
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 1, (double) 0L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) 1, (float) '#');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor4, (double) (short) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, 10.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) 10, 0.0f, (float) (short) 0);
        java.lang.Class<?> wildcardClass16 = shape6.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, 10.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, 0.0f);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 'a', 1.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape24);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape24);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape24);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) (-1), (float) (short) 0, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100L, (double) 0L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape13);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 0.0d, 0.0d);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (byte) 100, (double) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) '#');
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 1);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) -1, (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) (-1), (float) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) 100L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor13, (double) (byte) -1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) 100, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) '4', (float) (-1L), (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) 1L, (float) 0L, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) '4');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, 100.0f, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) 10L, (float) 1);
        java.lang.Class<?> wildcardClass7 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (short) 1);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 100.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape19);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) '4', (double) 100L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape34, shape36);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) ' ', (double) (short) -1);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape40);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape19, shape40);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape40);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1L), (float) (byte) 0);
        boolean boolean47 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape46);
        boolean boolean48 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape40);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, 0.0d, (double) (short) 100);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape11);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) ' ');
        java.lang.Class<?> wildcardClass26 = shape25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (-1.0f), (float) (byte) -1, (float) 1L);
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
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (float) (byte) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 1.0d, (double) 1L);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 'a', (double) '#');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 0, (float) 'a', (float) 0L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) 0L, (float) ' ');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) (short) 1);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape27);
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
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, 0.0f, (float) 10L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, 0.0d, (double) 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 10, (float) (short) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100.0f, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape13);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape13);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape24);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape29, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, 0.0d, (double) (byte) 0);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape36, (double) (-1L), (double) (short) 100);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape39);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (-1.0f), (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', 0.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape22);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 100, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) -1, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, 0.0d, (float) (byte) 100, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0.0f, (double) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) '4', (double) 1L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 10, (float) (short) 10, 1.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) -1, (float) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 'a', (double) (-1));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10.0f, (-1.0d));
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, 0.0d, (double) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape6);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (short) -1);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, 0.0d, (float) (byte) 100, (float) 0);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (-1.0d), (float) 0L, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape7);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1L), (double) 'a');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 1, (double) 0L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (-1.0d), (float) 1, (float) 1);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (-1.0f), 10.0f, (float) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) ' ');
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape29);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape26);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape26);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) '#', 10.0d);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 'a', (double) '#');
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape26);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 1L);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) (byte) 10, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) 10L, (float) (short) -1, (float) (short) 1);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape40);
        java.lang.Class<?> wildcardClass42 = shape40.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 1, (double) ' ');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 1.0f, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) (short) 1, 0.0f, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) 1L, (float) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 1, 0.0d);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 'a', (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (short) 0, (float) (byte) 0, 0.0f);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) -1, (double) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, (float) (-1), (float) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape18);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) ' ');
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape26);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape18);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, 0.0d, (float) (short) -1, 100.0f);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape30);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape37, (double) 0.0f, (double) 100L);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape37);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape18);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, 0.0f, (float) '4');
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 1.0d, (float) 100L, (float) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) '#', (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape21, (double) 'a', (float) (short) 1, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1L), (double) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100L, (float) (short) 0, (float) (-1L));
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 100, (float) (-1L), (float) (short) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, 1.0d, 0.0f, (float) (byte) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape21);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) '#');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape3);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape21);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) 10L, 0.0d);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (byte) 10, 0.0d);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (short) -1, 100.0d);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape31);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) 100.0f, (double) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, rectangleAnchor36, (double) 'a', (double) (-1.0f));
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
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 100, (float) (short) 1, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (short) 100);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 100L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) (-1), (float) (short) 10, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape7, (double) (-1), (float) (-1), (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, 1.0d, (float) (-1), 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) 0L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) (short) -1, 100.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, 10.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1L), (double) 1L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape24, (double) (short) 0, 10.0f, (float) 0);
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
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (short) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) (byte) 100, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, 10.0d, (float) (byte) 0, (float) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 1L, (double) 0L);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape20);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 0, (double) 100);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.clone(shape26);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) ' ', (double) 0);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape30);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape26);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) ' ', (double) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor8, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100L, (double) 1L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 100, (double) ' ', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), 0.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10, (double) (short) 1);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 0, (double) 100.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 10.0f, 0.0f, (float) 1L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape28);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.clone(shape28);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) 100.0f, (double) 'a');
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) ' ', (float) (byte) 0, 100.0f);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, (double) (byte) -1, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 100, (double) (byte) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, 1.0d, (float) '4', 0.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 0L);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape19, (double) (byte) 1, 0.0f, (float) 100L);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, rectangleAnchor25, (double) 'a', (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (byte) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape15);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) (short) 10, (float) 100L, (float) 1);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) (short) -1, (float) 100, (float) (-1L));
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (short) 10, (double) 100L);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape22);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) 0L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.lang.Class<?> wildcardClass6 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, (float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 1L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, 1.0d, (double) (short) 10);
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape16);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (-1.0d), (double) (short) 0);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor8, (double) '4', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (-1.0f));
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape45, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.clone(shape49);
        boolean boolean51 = org.jfree.chart.util.ShapeUtilities.equal(shape42, shape50);
        java.awt.Shape shape54 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape57 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape61 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape57, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape57, (double) 100.0f, (double) ' ');
        boolean boolean65 = org.jfree.chart.util.ShapeUtilities.equal(shape54, shape57);
        boolean boolean66 = org.jfree.chart.util.ShapeUtilities.equal(shape50, shape54);
        java.awt.Shape shape70 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape50, (-1.0d), (float) (-1L), 0.0f);
        boolean boolean71 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape50);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape75 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor72, (double) (-1), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertNotNull(shape64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(shape70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, 0.0d, (double) (byte) 1);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape28, (double) (byte) 1, 0.0f, (float) 'a');
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 10.0d, 100.0f, (float) 'a');
        java.lang.Class<?> wildcardClass8 = shape3.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) '4');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) 1, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, (float) (short) 10);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) '#');
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        java.lang.Class<?> wildcardClass21 = shape5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), 0.0f, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) ' ');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor6, (double) (byte) 1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100.0f, (double) ' ');
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape9);
        java.lang.Class<?> wildcardClass18 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) (byte) 10);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (-1), (float) (short) -1, (float) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape17);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape24);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape28);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape22);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape37, (double) 100L, (double) (byte) 10);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape37);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape22, (double) (byte) -1, 10.0f, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape17);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape17);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) (byte) 10, (float) (byte) 0, 0.0f);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape33);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape28, (double) 100L, (-1.0f), (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 1, (float) 'a', 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape18);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        java.lang.Class<?> wildcardClass22 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) (short) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) ' ', (float) 1, (float) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) (byte) -1, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), (double) (-1));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) (-1));
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape6);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) 0L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, (float) (-1), (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) ' ', (float) (byte) 1, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 0, (float) (byte) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100.0f, 0.0f, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) -1);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) 10.0f, (float) (short) 10, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape43);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape43);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) 100, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (-1L));
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 0, (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 100.0d, (float) (short) -1, (-1.0f));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) (byte) 0, (float) (short) 1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (-1L));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, 0.0d, 100.0f, (float) '4');
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 1L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, (double) (-1.0f), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 0.0f, (float) (-1), (float) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor36, 10.0d, (double) '#');
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
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (short) 10, (float) (byte) 0, (float) (byte) 100);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 0, (float) (short) 0, (float) (short) 10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 10.0f, (double) 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (short) -1, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) 0);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape5);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 100, (float) (byte) 100, (float) (byte) -1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0L, (float) (short) 10, (float) ' ');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) 100.0f, (double) ' ');
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape33, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape33, (double) 100.0f, (double) ' ');
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape42);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape40);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape40, (double) '#', (double) (short) 0);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape47, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape50, (double) (short) 100, (double) 100.0f);
        boolean boolean54 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape53);
        boolean boolean55 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape20);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1L, (double) (byte) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 0, (float) 0, (float) (short) -1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 100, (double) (-1));
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) '#', 10.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (short) 100, 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) 10L);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) -1, (double) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1, (float) (byte) 100, 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1L, (float) 1L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, 1.0d, (double) (short) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) ' ', (float) (short) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape12, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape18);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (double) ' ', (double) (short) -1);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape22);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 100.0f, (float) (short) 0, (float) '#');
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape22, (double) (short) 0, 0.0f, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.lang.Class<?> wildcardClass4 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 1.0d, 0.0f, (float) (byte) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100.0f, (double) ' ');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 10, 1.0d);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (-1.0d), 0.0d);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 100.0f, (double) (short) 10);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape30);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 1, 1.0f, (float) 100);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) 100, (float) (byte) 0, (float) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100.0f, (float) (short) 0, (float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) (short) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', 100.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1L, (float) 10L, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.lang.Class<?> wildcardClass8 = shape7.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) (short) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1L), (double) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, 0.0f, (float) (-1));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) '4', (float) 0, 0.0f);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) (short) -1, (float) 1L, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 0L, 10.0f, (float) (short) 0);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1.0f), (float) '4', (float) (-1));
        java.lang.Class<?> wildcardClass14 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) (short) 1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor6, (double) (-1L), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1), 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (-1), (float) (short) -1, (float) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, rectangleAnchor15, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) 1, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100, (double) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) ' ', (float) (short) 1);
        java.lang.Class<?> wildcardClass7 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (-1), (float) (short) 10, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, rectangleAnchor39, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) 1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1), (double) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) ' ', (float) 1, 1.0f);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, rectangleAnchor25, (double) 1.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) '4');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 100.0d, (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10.0f, (float) (short) 1, 0.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.lang.Class<?> wildcardClass13 = shape4.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) 1, (float) 0L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor6, (double) '#', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) 100, 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor18, 100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 100L, (double) (-1L));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 1.0d, (float) (short) 1, (float) '4');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) '#', (float) 'a', (float) (short) 10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, 10.0d, 0.0f, (float) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, rectangleAnchor23, 100.0d, (double) (byte) 10);
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
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), 1.0f);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) (-1), (float) '4', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape13 = null;
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape11, shape13);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) '4', (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (short) -1, 0.0f, (float) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (-1.0f), 0.0d);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape17);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, 1.0d, (double) (byte) 0);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, 0.0d, (float) (byte) 1, (float) 10L);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape28);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 'a');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        boolean boolean7 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape8 = null;
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0.0f, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, 1.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 10.0d, (float) 10L, (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        boolean boolean33 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape32);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, rectangleAnchor34, (double) 1L, (double) '#');
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 100, (float) 1, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 0.0d, (double) 'a');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 100);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor10, 10.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, (float) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) 1, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape9, (double) (short) 1, (float) (-1L), (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1), (float) (short) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) 1.0f, (-1.0d));
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, 100.0d, 100.0f, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1L, 1.0d);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (short) 1);
        java.awt.Shape shape11 = null;
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) ' ', (float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor11, (double) ' ', (double) 10L);
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
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, (float) (byte) 1, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 100, (double) 1.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 0, (float) 0L, 100.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (byte) 1, 100.0d);
        boolean boolean8 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (-1.0d), 0.0d);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape13, (double) (byte) 10, 0.0f, (float) ' ');
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
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape39, rectangleAnchor44, (-1.0d), (double) (short) 0);
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
        org.junit.Assert.assertNotNull(shape43);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 100L, (float) 100L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, 10.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10L, (double) (short) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 0, (double) '#');
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape20);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, (double) 100L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, 100.0d, (double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor10, (double) (byte) 100, 0.0d);
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
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, 0.0f, 100.0f);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass12 = shape11.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) '4', (float) 100, (float) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 10.0d, (double) 'a');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (double) (-1), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 1, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 10.0d, 100.0f, (float) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) 100.0f, (double) ' ');
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) ' ', (float) 1, 1.0f);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, 0.0d, 10.0d);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape26);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1.0f), 0.0d);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (byte) 0);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) (byte) 100);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) -1);
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (short) 0, (float) 100, (float) 0L);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) (short) 1, (double) 10L);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape31, shape35);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) ' ', (double) (short) 1);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        boolean boolean48 = org.jfree.chart.util.ShapeUtilities.equal(shape21, shape35);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shape51);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) 100L);
        java.lang.Class<?> wildcardClass13 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) (byte) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 0);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, 0.0d, 1.0f, 10.0f);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 0.0f, 0.0f, (float) (byte) 0);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape20);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape40, 10.0d, (float) 10, (float) 10);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape36, shape40);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape36, (double) (short) 100, (float) 10L, 0.0f);
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
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (double) 1L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1), (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, (double) 1L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) 0L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) ' ', 0.0f, 100.0f);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape14);
        java.lang.Class<?> wildcardClass16 = shape14.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape5, (double) (-1), (float) 10, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (short) 0, (float) (-1L), (float) (short) 100);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 0, 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (-1.0f), 0.0d);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 1.0d, (double) (byte) 0);
        boolean boolean21 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape20);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (-1.0f), 0.0d);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape25);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape25, (double) 100.0f, (float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, 1.0d, (double) (byte) 0);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.clone(shape36);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape37);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape20);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) (-1));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor4, (double) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) '#', (double) 100L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 10L, (-1.0f), (float) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape14);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape21);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1L));
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 0.0d, (double) ' ');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100, (float) (short) 10, (float) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) 1L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 0.0d, (float) '4', 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 0, 0.0f, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), 0.0d);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, 0.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape19);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape19);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape19);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) 'a', (float) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 1.0f, (float) (short) 10, (float) (short) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 0.0f, (double) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor18, 100.0d, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, 10.0f, (float) (-1));
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (short) 1, 1.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) 10L, 100.0f, (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape15, (double) '#', 0.0d);
        java.lang.Class<?> wildcardClass23 = shape15.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10, (float) (byte) 1);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape33);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) (short) 10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape37, (double) 10, (float) (short) 10, (float) 100);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape37, (double) (byte) 0, (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 100, 0.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, 1.0d, (double) 10);
        java.lang.Class<?> wildcardClass20 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) 'a');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) ' ', (float) (short) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) 1);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape11, (double) (short) 0, (float) (byte) 1, 1.0f);
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
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        boolean boolean3 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (-1.0f));
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 0L, (float) 0, (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape18, (double) 100.0f, (float) 'a', (float) (byte) 100);
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
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, (double) '#', (float) 'a', (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) 1, (float) (byte) 0, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 10, (double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor6, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor7, 10.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10, (float) (short) 1, (float) ' ');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) (short) 1, 0.0f, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 100, 0.0d);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, 1.0d, (double) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, 10.0d, (float) (short) 100, (float) (byte) 100);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape21);
        java.lang.Class<?> wildcardClass28 = shape16.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (-1));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) (byte) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape21);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 100L, (float) (byte) 10, (float) (-1L));
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) 0.0f, (double) (byte) 0);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape27, (double) (short) 0, (float) 'a', (float) 100L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) -1, 0.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, 0.0d, 100.0f, (float) '4');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) 100.0f, (double) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 100, 100.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) (short) 100, (float) (byte) 100, (float) (short) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) (byte) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (-1.0d), 0.0d);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 10, (double) (short) 1);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape14, shape16);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) (byte) 0, (double) 100.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) 10.0f, 0.0f, (float) 1L);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape28);
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) 100L, (double) 0L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) (-1.0f), (float) 10, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape16, (double) 1, (float) (byte) 10, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, 0.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) 0);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) (short) 10);
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) -1, (float) 'a', 100.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (short) 10, (float) (byte) 1, (float) '4');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, rectangleAnchor15, 100.0d, 0.0d);
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
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 1, 100.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 100, (float) 'a', (float) (byte) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) ' ');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, rectangleAnchor4, (double) (byte) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 100, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) 0, (float) (byte) 100, (float) 1L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) (byte) 100);
        boolean boolean16 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape15);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, 10.0f, (float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (-1), (double) (-1L));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, 100.0d, (double) '#');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1L), (double) 'a');
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 0.0f, (float) (-1), (float) (-1));
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape35, (double) (byte) -1, (float) 'a', (float) (short) 10);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
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
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(shape40);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10.0f, (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) -1, (double) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, 0.0d, (double) 0.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 10, (double) (byte) 1);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (short) 0, (double) (byte) 10);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 0, (float) (byte) 0, (float) '4');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) (byte) -1, (double) 10);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape14);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape14, (double) 100L, (-1.0f), (float) (byte) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, (double) 10.0f, 100.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) '#');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor15, (double) (byte) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0L, (double) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1.0f, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (byte) -1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 10, (double) 100L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (short) -1, (double) '4');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, 0.0d, (float) 0, (float) ' ');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, 1.0d);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape18, (-1.0d), 0.0d);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 0.0f, (float) 1, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (-1.0d), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, (double) 1.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
            java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape21, rectangleAnchor23, (double) 10.0f, 0.0d);
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
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) ' ', (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) 1.0f);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10L, (double) 1L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (-1.0f), (float) '#', (float) 0);
        java.lang.Class<?> wildcardClass15 = shape14.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        boolean boolean11 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor12, (double) 10L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (-1.0f), 0.0d);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) (byte) 10, (double) 100L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape14, (double) (-1L), (float) 100, (-1.0f));
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
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape9);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 1.0f, (float) 1, (float) (short) 10);
        boolean boolean18 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (short) -1, (float) (byte) 1, (float) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (-1), (float) (short) -1, (float) 10);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0, (float) (byte) 0, (float) (-1L));
        java.lang.Class<?> wildcardClass10 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (-1.0f), (double) 100L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 1, (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 10.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 1L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (-1.0d), (double) (short) 0);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape6);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) ' ');
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100.0f, (double) ' ');
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape25);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) (byte) 10, 1.0d);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape32, (-1.0d), 0.0d);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) 100.0f, (double) (short) 10);
        boolean boolean39 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape35);
        boolean boolean40 = org.jfree.chart.util.ShapeUtilities.equal(shape4, shape35);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape35, shape43);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape43);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '4', (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shape48);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (short) 10, (float) 10L, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (-1));
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, 100.0d, (double) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10.0f, (float) (short) 1, 0.0f);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, rectangleAnchor11, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape22, (double) 1L, (double) 1L);
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
        org.junit.Assert.assertNotNull(shape30);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 0, 1.0f, (float) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (short) 10, (double) 0L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 1, (float) 1L);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape12, rectangleAnchor14, (double) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (-1.0d), (double) (byte) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100, (float) (short) -1, (float) 1L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '4', (float) ' ');
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape30, (double) 'a', (double) '#');
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape30, (double) 0, (float) 'a', (float) 0L);
        boolean boolean38 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape30);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) (-1.0f), (double) 100L);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) (short) 1, 10.0d);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape28, 1.0d, (float) (byte) 0, (float) (short) 10);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape48);
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
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) 'a');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) 'a');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 0.0f, 0.0f, (float) (short) 10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, (double) 100L, 0.0f, (float) '4');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape15, shape22);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape15, 1.0d, (float) 100L, (float) (byte) 10);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape15);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape29);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.clone(shape29);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape31);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (-1));
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) ' ', 0.0f, 0.0f);
        java.lang.Class<?> wildcardClass9 = shape8.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) ' ', (float) '#', (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape12, (double) (short) 0, (float) (byte) -1, (float) 1);
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
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.clone(shape43);
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
        org.junit.Assert.assertNotNull(shape48);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) (byte) 0, (double) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 100.0f, (double) ' ');
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 100.0f, (double) ' ');
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape27, shape29);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape27);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape27, (double) '#', (double) (short) 0);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape34, (double) (byte) 0, (double) (short) 10);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape37, (double) (short) 100, (double) 100.0f);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape43, (double) (short) 0, (double) (-1L));
        boolean boolean47 = org.jfree.chart.util.ShapeUtilities.equal(shape37, shape46);
        java.awt.Shape shape51 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape37, (double) (short) 100, (float) 100, (float) 100L);
        java.awt.Shape shape55 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape51, (double) (short) 100, (float) 100L, 10.0f);
        java.awt.Shape shape59 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape55, (double) (short) 100, (float) 10, (float) 0);
        boolean boolean60 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape59);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape59, rectangleAnchor61, (double) (short) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (float) '#');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 'a', (float) 'a', (float) '#');
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 1.0d, (double) (-1L));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, rectangleAnchor10, (double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 'a', (float) 10L);
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape2, (double) (byte) 10, (float) 1L, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, (double) (-1L), (double) 10);
        java.lang.Class<?> wildcardClass10 = shape9.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 10, (float) (-1));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) 100L, 0.0f, (float) '4');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 1.0f, (double) 0.0f);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape10, shape14);
        boolean boolean20 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape10);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape10, (double) 10.0f, 1.0f, (float) 0);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) '4', (double) 100);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, 0.0f);
        boolean boolean31 = org.jfree.chart.util.ShapeUtilities.equal(shape24, shape30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape24, (double) 1.0f, 100.0f, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 100L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 10.0d, (float) 1, 0.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) (byte) 10, (double) 0L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10, (float) '4');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 0L, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.awt.Shape shape0 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor1, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0L, 10.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (-1.0f), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (double) (byte) 10, (float) 100, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 100L, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape3, (double) (byte) 100, 100.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 1);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape6, shape8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, rectangleAnchor10, (-1.0d), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1L, (float) 100L, (float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (-1L), (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) 'a', (float) 0L, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape17, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, (double) (byte) 0, (double) 10L);
        boolean boolean25 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape17);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape17, rectangleAnchor27, (double) (byte) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 10);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 'a');
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (byte) 10, (double) (short) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 1.0f, (float) (short) 1, (float) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, rectangleAnchor6, (double) (byte) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape29, (double) 100, (-1.0d));
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
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (byte) 1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) (byte) 0);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) (short) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 10, (float) '4');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) ' ');
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, 100.0d, (double) '#');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 10.0f, (float) (short) 1, 0.0f);
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape4);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 'a', (float) (byte) -1, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        java.lang.Class<?> wildcardClass45 = shape24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 'a');
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) 10L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0L, (double) (byte) 1);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100L, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10L);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 1.0f, (float) 1, (float) (short) 10);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape3, (double) 10, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape10, (double) 1.0f, (float) (byte) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, (double) (-1.0f), 100.0f, (float) (byte) -1);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (-1), 10.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        java.awt.Shape shape39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape25, (double) 1, (double) 0);
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
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 100.0f, (double) ' ');
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 100, (float) (short) 0, (float) 10);
        java.lang.Class<?> wildcardClass18 = shape17.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 10, (float) 10, 1.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 0, (double) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (-1L));
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (-1));
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) (-1.0f), 0.0d);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape7);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 10, (double) 100L);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape13, (double) 1.0f, (float) (short) 100, (float) (byte) 1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) 10, (double) (byte) 10);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) (byte) -1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1.0f), (double) (short) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1, (float) (byte) 100, (float) 1);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 'a', (float) 0L);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape20, (double) 100L, (double) 0L);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape23, (double) (-1.0f), (float) 10, (float) (short) 10);
        boolean boolean29 = org.jfree.chart.util.ShapeUtilities.equal(shape12, shape23);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, 0.0d, 0.0d);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtilities.clone(shape23);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape23);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape9);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, (float) (byte) 10);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.clone(shape10);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (-1.0d), (float) 0, (float) (-1L));
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 0, (double) 10L);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape11);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, 1.0d, (float) (byte) 10, (float) (byte) -1);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape25);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) (short) 0, (double) (-1L));
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        boolean boolean32 = org.jfree.chart.util.ShapeUtilities.equal(shape26, shape31);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape31, (double) '4', (double) 100L);
        boolean boolean37 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape36);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) 1, 0.0d);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape4);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (short) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 100L, (float) (byte) 10, (float) (short) -1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape9, (double) (byte) 1, 100.0d);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape9);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (byte) 0, (-1.0d));
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (-1.0d), (double) (short) -1);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape19, 0.0d, (double) '4');
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape22);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 1, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor4, (double) 0L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 0L);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        boolean boolean4 = org.jfree.chart.util.ShapeUtilities.equal(shape0, shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape7, (double) (-1L), (double) 10L);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean22 = org.jfree.chart.util.ShapeUtilities.equal(shape18, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape18);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (byte) 0, (double) (short) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape6, (double) (byte) 10, (float) (short) 10, (float) '#');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, (double) 1L, (double) (-1.0f));
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '4', (float) (-1));
        java.lang.Class<?> wildcardClass3 = shape2.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) '4');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 10L, 1.0f);
        boolean boolean9 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape8);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) -1, (float) 1L);
        java.awt.Shape shape4 = null;
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, (double) 100, (float) (byte) 10, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape22, (double) (byte) -1, (float) (byte) 0, (float) 'a');
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.clone(shape22);
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
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape31);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape28, (double) (short) 10, (double) 0.0f);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 10, (float) (short) 1);
        boolean boolean41 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape40);
        boolean boolean42 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape40);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape25);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor45, (double) 100.0f, (double) (-1L));
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
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, (double) (short) 0, (double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape13, rectangleAnchor17, (double) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape4, 10.0d, (float) (short) -1, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 'a', (float) ' ', (float) (short) -1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (-1), 0.0f, (float) (byte) -1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape5, (double) (byte) -1, (float) (byte) -1, (float) 10);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, 0.0d, (double) 100);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape20, (double) 1.0f, 10.0f, (float) (-1));
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape26, (double) 100.0f, (double) '#');
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape17, shape29);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape4, (double) 10L, 0.0d);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape8, (double) (byte) 10, 0.0d);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 10.0d, (double) (byte) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape11, (double) 'a', (float) (byte) 100, 10.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape18, 10.0d, (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (float) (short) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 'a');
        boolean boolean6 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape5, (double) 'a', (double) '4');
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, rectangleAnchor11, (double) 1.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        boolean boolean5 = org.jfree.chart.util.ShapeUtilities.equal(shape1, shape4);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 1L, (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 1.0f, (float) 10L, (float) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape16, (double) 100L, 0.0d);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 1, 10.0f);
        boolean boolean26 = org.jfree.chart.util.ShapeUtilities.equal(shape22, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape25);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape25);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (float) (short) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, rectangleAnchor3, (double) (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) '#', (float) 10);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (-1.0d), (float) (short) 0, (float) (-1L));
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) '#', (float) 100L, (float) (short) 1);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape10, 1.0d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(graphics2D0, shape19, (double) (short) -1, 10.0f, (float) (byte) 0);
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
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape0, 0.0d, (float) (short) -1, (float) 100);
        org.junit.Assert.assertNull(shape4);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 100, (float) (byte) 1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 10, (float) 100L, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 0, (double) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 1L, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (short) 1, (double) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape6, 0.0d, 10.0d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 10L, (float) (byte) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (float) 10L);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape8, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) '#', (double) 1);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape20);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape21, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) (byte) 10);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.clone(shape31);
        boolean boolean34 = org.jfree.chart.util.ShapeUtilities.equal(shape28, shape31);
        boolean boolean35 = org.jfree.chart.util.ShapeUtilities.equal(shape25, shape31);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0, (float) (byte) 0);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape38, (double) 100, (float) 10, (float) (short) 10);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.equal(shape31, shape42);
        java.awt.Shape shape47 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape42, (double) 0, (float) (-1), (float) (short) 1);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.clone(shape42);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape42);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape23, (double) '4', (double) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (short) 100, 0.0f);
        boolean boolean30 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape29);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) 0, (float) (short) 1);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape36, (double) (byte) -1, (float) (byte) 0, (float) (short) 10);
        java.awt.Shape shape43 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 100, (float) '#');
        boolean boolean44 = org.jfree.chart.util.ShapeUtilities.equal(shape40, shape43);
        boolean boolean45 = org.jfree.chart.util.ShapeUtilities.equal(shape33, shape43);
        boolean boolean46 = org.jfree.chart.util.ShapeUtilities.equal(shape23, shape43);
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
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) 100L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (float) (short) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) -1, (float) (byte) 0);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, (double) 100L, (float) (short) 0, (float) (-1L));
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 100.0d, 0.0f, (float) '4');
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape3, 0.0d, (float) (-1), (float) '#');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 1, (float) (short) 10);
        boolean boolean19 = org.jfree.chart.util.ShapeUtilities.equal(shape3, shape18);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) '#', 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (-1L), (float) 100, (float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape6);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) (short) 0, (float) (byte) 100, (float) 1L);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape7);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) (-1), (double) (-1L));
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape14, (double) 1L, 1.0d);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) (short) 10);
        boolean boolean23 = org.jfree.chart.util.ShapeUtilities.equal(shape20, shape22);
        boolean boolean24 = org.jfree.chart.util.ShapeUtilities.equal(shape7, shape22);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 10, (float) 0L);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (byte) 0, (float) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) ' ', (float) (short) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 1, 0.0f, (float) 100L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 100.0f, (double) ' ');
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) '#');
        boolean boolean12 = org.jfree.chart.util.ShapeUtilities.equal(shape9, shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, (double) (byte) 10, (double) (byte) 10);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape15);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) (short) 10, (float) 10, (float) 0);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.clone(shape16);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 0L, (float) 1L);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape24, (double) (short) 10, (double) 100L);
        boolean boolean28 = org.jfree.chart.util.ShapeUtilities.equal(shape16, shape27);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) 'a', (float) 10L, (float) (short) 1);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100L, (float) (byte) 100);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape35, (double) ' ', (double) (byte) 100);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtilities.clone(shape35);
        java.awt.Shape shape44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape41, (-1.0d), 0.0d);
        java.awt.Shape shape45 = org.jfree.chart.util.ShapeUtilities.clone(shape41);
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) 0, (float) 10);
        boolean boolean49 = org.jfree.chart.util.ShapeUtilities.equal(shape41, shape48);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtilities.clone(shape41);
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape41, (double) (short) 1, (double) (byte) 100);
        boolean boolean54 = org.jfree.chart.util.ShapeUtilities.equal(shape32, shape41);
        java.lang.Class<?> wildcardClass55 = shape41.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((float) 100L);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape1, (double) (-1), (double) (-1L));
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.clone(shape1);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, 0.0d, (float) '#', (float) 100);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 0.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) 1L, (double) '#');
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (float) ' ');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape2, (double) (-1L), (double) 10L);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) 1.0f, (float) '#', (float) '4');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape2, (double) (byte) 10, (float) (byte) -1, 0.0f);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) 100, (float) (-1L));
        boolean boolean17 = org.jfree.chart.util.ShapeUtilities.equal(shape13, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape16, (double) ' ', (float) (byte) 0, 100.0f);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtilities.clone(shape21);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
        java.lang.Class<?> wildcardClass2 = shape1.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) '4', (double) (-1L), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (short) -1, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean10 = org.jfree.chart.util.ShapeUtilities.equal(shape5, shape9);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape9, (double) 0.0f, (float) (byte) 0, 1.0f);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtilities.clone(shape14);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((float) (byte) 100, (float) (short) 10);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) '#');
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape4, (double) 0.0f, 100.0f, (float) 0);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtilities.clone(shape8);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((float) (-1L), (float) (short) 100);
        boolean boolean13 = org.jfree.chart.util.ShapeUtilities.equal(shape8, shape12);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.clone(shape12);
        boolean boolean15 = org.jfree.chart.util.ShapeUtilities.equal(shape2, shape12);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtilities.clone(shape2);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createDiamond((float) 0);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape1, (double) (byte) 10, (float) 1L, 1.0f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtilities.clone(shape5);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtilities.rotateShape(shape7, (double) '4', (float) (-1), (float) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtilities.clone(shape11);
        java.lang.Class<?> wildcardClass13 = shape12.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

