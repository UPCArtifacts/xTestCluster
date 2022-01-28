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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = grayPaintScale13.equals(obj21);
        java.awt.Paint paint24 = grayPaintScale13.getPaint((double) 10.0f);
        java.awt.Paint paint26 = grayPaintScale13.getPaint((double) 1.0f);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) paint26);
        java.lang.Class<?> wildcardClass28 = paint26.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = grayPaintScale7.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) 10.0d);
        double double15 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        double double24 = grayPaintScale21.getUpperBound();
        boolean boolean26 = grayPaintScale21.equals((java.lang.Object) ' ');
        double double27 = grayPaintScale21.getLowerBound();
        double double28 = grayPaintScale21.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale21.getPaint((double) 100.0f);
        double double31 = grayPaintScale21.getLowerBound();
        boolean boolean32 = grayPaintScale12.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        double double11 = grayPaintScale7.getLowerBound();
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale22.getPaint(10.0d);
        java.lang.Class<?> wildcardClass25 = grayPaintScale22.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale22);
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) 100L);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double18 = grayPaintScale17.getUpperBound();
        double double19 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        double double21 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint6 = grayPaintScale4.getPaint((double) (short) 0);
        double double7 = grayPaintScale4.getUpperBound();
        double double8 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale4.getPaint((double) (short) 100);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) paint10);
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(35.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (-1.0f));
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10.0f);
        double double16 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass17 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 52.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double6 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) ' ');
        boolean boolean15 = grayPaintScale5.equals((java.lang.Object) boolean14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) wildcardClass17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (byte) -1);
        double double24 = grayPaintScale21.getLowerBound();
        double double25 = grayPaintScale21.getLowerBound();
        boolean boolean26 = grayPaintScale5.equals((java.lang.Object) grayPaintScale21);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) boolean26);
        java.lang.Class<?> wildcardClass28 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, 100.0d);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        double double27 = grayPaintScale24.getLowerBound();
        boolean boolean29 = grayPaintScale24.equals((java.lang.Object) 1);
        double double30 = grayPaintScale24.getLowerBound();
        double double31 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale24.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint38 = grayPaintScale36.getPaint(10.0d);
        boolean boolean39 = grayPaintScale24.equals((java.lang.Object) grayPaintScale36);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 1);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale5.getLowerBound();
        double double10 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 1.0f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '#');
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 1L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) ' ');
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 0L);
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 10);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, 35.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 10.0d);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) ' ');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint18 = grayPaintScale14.getPaint((-1.0d));
        double double19 = grayPaintScale14.getUpperBound();
        double double20 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) (byte) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) 1L);
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 10);
        double double20 = grayPaintScale2.getUpperBound();
        double double21 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1L);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) 0L);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass5 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (-1));
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double12 = grayPaintScale11.getUpperBound();
        double double13 = grayPaintScale11.getLowerBound();
        java.lang.Object obj14 = grayPaintScale11.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = grayPaintScale0.equals(obj14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((-1.0d));
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, 52.0d);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) 0L);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass11 = grayPaintScale5.getClass();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        double double5 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale2.equals(obj15);
        java.lang.Class<?> wildcardClass17 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) grayPaintScale29);
        double double32 = grayPaintScale29.getLowerBound();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double17 = grayPaintScale16.getLowerBound();
        java.lang.Object obj18 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 35.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint20 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 52.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double10 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean15 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (short) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double17 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale16.equals(obj25);
        double double27 = grayPaintScale16.getUpperBound();
        java.lang.Object obj28 = grayPaintScale16.clone();
        boolean boolean29 = grayPaintScale2.equals(obj28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(32.0d);
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint(100.0d);
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint15 = grayPaintScale5.getPaint((double) (short) 1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint24 = grayPaintScale2.getPaint(97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double28 = grayPaintScale27.getLowerBound();
        boolean boolean30 = grayPaintScale27.equals((java.lang.Object) 0L);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, 97.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass6 = grayPaintScale5.getClass();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double8 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale5.getPaint(97.0d);
        java.lang.Class<?> wildcardClass12 = grayPaintScale5.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass21 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) 0);
        boolean boolean30 = grayPaintScale24.equals((java.lang.Object) grayPaintScale27);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) '4');
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) 100L);
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) grayPaintScale24);
        double double26 = grayPaintScale17.getLowerBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) 0);
        double double33 = grayPaintScale30.getUpperBound();
        double double34 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint36 = grayPaintScale30.getPaint(10.0d);
        double double37 = grayPaintScale30.getLowerBound();
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 1.0d);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double15 = grayPaintScale5.getLowerBound();
        double double16 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (short) 1);
        double double22 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale19.getPaint(0.0d);
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 'a');
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) paint19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 10);
        double double13 = grayPaintScale12.getLowerBound();
        double double14 = grayPaintScale12.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 10);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 10.0d);
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) (-1.0d));
        double double11 = grayPaintScale6.getLowerBound();
        double double12 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 10);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        double double26 = grayPaintScale23.getUpperBound();
        java.lang.Object obj27 = grayPaintScale23.clone();
        double double28 = grayPaintScale23.getUpperBound();
        double double29 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = grayPaintScale32.equals(obj33);
        java.awt.Paint paint36 = grayPaintScale32.getPaint((double) 10.0f);
        double double37 = grayPaintScale32.getUpperBound();
        java.lang.Class<?> wildcardClass38 = grayPaintScale32.getClass();
        boolean boolean39 = grayPaintScale23.equals((java.lang.Object) grayPaintScale32);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100L);
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        double double19 = grayPaintScale16.getUpperBound();
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) double19);
        double double21 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 10);
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) paint23);
        java.lang.Object obj25 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj20 = grayPaintScale2.clone();
        double double21 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint14 = grayPaintScale10.getPaint(10.0d);
        java.awt.Paint paint16 = grayPaintScale10.getPaint(32.0d);
        java.lang.Object obj17 = grayPaintScale10.clone();
        double double18 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) ' ');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double18 = grayPaintScale11.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 1);
        boolean boolean16 = grayPaintScale12.equals((java.lang.Object) 10L);
        java.awt.Paint paint18 = grayPaintScale12.getPaint((double) (short) -1);
        double double19 = grayPaintScale12.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass22 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '#');
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(10.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        double double11 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) (short) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double17 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getUpperBound();
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 52.0d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10L);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double10 = grayPaintScale8.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(35.0d);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale9.clone();
        double double13 = grayPaintScale9.getUpperBound();
        double double14 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) (-1L));
        java.awt.Paint paint18 = grayPaintScale9.getPaint((double) (-1));
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) 1);
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) (short) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = grayPaintScale14.equals(obj22);
        java.awt.Paint paint25 = grayPaintScale14.getPaint(10.0d);
        java.lang.Object obj26 = grayPaintScale14.clone();
        java.awt.Paint paint28 = grayPaintScale14.getPaint((double) (byte) 0);
        java.awt.Paint paint30 = grayPaintScale14.getPaint((double) 10);
        double double31 = grayPaintScale14.getUpperBound();
        java.lang.Class<?> wildcardClass32 = grayPaintScale14.getClass();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 10);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint((double) (short) 1);
        double double18 = grayPaintScale11.getUpperBound();
        double double19 = grayPaintScale11.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj21 = grayPaintScale11.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        double double15 = grayPaintScale11.getLowerBound();
        double double16 = grayPaintScale11.getUpperBound();
        double double17 = grayPaintScale11.getLowerBound();
        boolean boolean18 = grayPaintScale6.equals((java.lang.Object) double17);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double20 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double5 = grayPaintScale4.getLowerBound();
        double double6 = grayPaintScale4.getLowerBound();
        java.lang.Object obj7 = grayPaintScale4.clone();
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        double double10 = grayPaintScale4.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale4);
        double double12 = grayPaintScale4.getUpperBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(100.0d);
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale18.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) wildcardClass21);
        java.awt.Paint paint24 = grayPaintScale2.getPaint((double) 100L);
        java.lang.Object obj25 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (-1L));
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100.0f);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(1.0d);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1L));
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 32.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double18 = grayPaintScale17.getUpperBound();
        double double19 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) 0);
        double double23 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Class<?> wildcardClass13 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) -1);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) 100L);
        double double10 = grayPaintScale5.getLowerBound();
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale15.getPaint((double) 10);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) paint19);
        java.lang.Class<?> wildcardClass21 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Class<?> wildcardClass14 = paint13.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) 100);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 10);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(1.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (short) 100);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (-1L));
        boolean boolean23 = grayPaintScale8.equals((java.lang.Object) grayPaintScale17);
        double double24 = grayPaintScale8.getUpperBound();
        java.lang.Class<?> wildcardClass25 = grayPaintScale8.getClass();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) wildcardClass25);
        double double27 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass19 = grayPaintScale16.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass22 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) (short) 10);
        java.lang.Object obj14 = grayPaintScale6.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double7 = grayPaintScale6.getUpperBound();
        java.lang.Class<?> wildcardClass8 = grayPaintScale6.getClass();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) wildcardClass8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) '#');
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 35.0d);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (short) 100);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (-1L));
        boolean boolean23 = grayPaintScale8.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (-1.0f));
        java.lang.Object obj26 = grayPaintScale17.clone();
        boolean boolean27 = grayPaintScale2.equals(obj26);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(32.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 1L);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.lang.Object obj16 = grayPaintScale9.clone();
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) 10);
        double double20 = grayPaintScale9.getLowerBound();
        double double21 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale9.getPaint((double) 1.0f);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100.0f);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) 100);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 100);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double14 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (short) 100);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double22 = grayPaintScale21.getLowerBound();
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        double double24 = grayPaintScale21.getLowerBound();
        boolean boolean25 = grayPaintScale7.equals((java.lang.Object) double24);
        double double26 = grayPaintScale7.getUpperBound();
        double double27 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.awt.Paint paint6 = grayPaintScale2.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = grayPaintScale9.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) 10.0f);
        double double14 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) (short) 0);
        double double17 = grayPaintScale9.getLowerBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale14.getClass();
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (short) -1);
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 52.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 1L);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, 100.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) ' ');
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double15 = grayPaintScale5.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj17 = grayPaintScale5.clone();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) (short) 100);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) double9);
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 100L);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 1);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale14.getClass();
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint(100.0d);
        double double29 = grayPaintScale23.getUpperBound();
        boolean boolean30 = grayPaintScale10.equals((java.lang.Object) double29);
        java.lang.Object obj31 = grayPaintScale10.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean34 = grayPaintScale32.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint36 = grayPaintScale32.getPaint((-1.0d));
        java.lang.Object obj37 = grayPaintScale32.clone();
        java.awt.Paint paint39 = grayPaintScale32.getPaint((double) 10);
        java.awt.Paint paint41 = grayPaintScale32.getPaint((double) '#');
        double double42 = grayPaintScale32.getLowerBound();
        double double43 = grayPaintScale32.getLowerBound();
        double double44 = grayPaintScale32.getLowerBound();
        double double45 = grayPaintScale32.getUpperBound();
        java.lang.Class<?> wildcardClass46 = grayPaintScale32.getClass();
        boolean boolean47 = grayPaintScale10.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        double double12 = grayPaintScale5.getLowerBound();
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getUpperBound();
        double double15 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale5.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale2.equals(obj13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        java.awt.Paint paint11 = grayPaintScale9.getPaint(35.0d);
        double double12 = grayPaintScale9.getLowerBound();
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 100.0f);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 10.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) (short) 0);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 10L);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) paint10);
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 10);
        double double20 = grayPaintScale2.getUpperBound();
        java.lang.Object obj21 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale6.equals(obj9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint14 = grayPaintScale2.getPaint(35.0d);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (byte) -1);
        double double10 = grayPaintScale7.getLowerBound();
        double double11 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) (short) -1);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint16 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (byte) 100);
        double double11 = grayPaintScale5.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale2.equals(obj8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint(35.0d);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) ' ');
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) 1L);
        java.lang.Object obj16 = grayPaintScale7.clone();
        double double17 = grayPaintScale7.getUpperBound();
        double double18 = grayPaintScale7.getUpperBound();
        double double19 = grayPaintScale7.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint(97.0d);
        java.lang.Object obj23 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) '4');
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass22 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10);
        java.awt.Paint paint20 = grayPaintScale2.getPaint(10.0d);
        double double21 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 10.0f);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1.0f));
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) 100);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean19 = grayPaintScale10.equals((java.lang.Object) grayPaintScale18);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale18);
        double double21 = grayPaintScale0.getLowerBound();
        double double22 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 52.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 0L);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale16.getPaint((double) 0L);
        boolean boolean21 = grayPaintScale7.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double15 = grayPaintScale2.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        double double18 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint23 = grayPaintScale21.getPaint(1.0d);
        java.awt.Paint paint25 = grayPaintScale21.getPaint((double) 100);
        java.awt.Paint paint27 = grayPaintScale21.getPaint((double) (-1.0f));
        java.lang.Object obj28 = grayPaintScale21.clone();
        boolean boolean29 = grayPaintScale2.equals(obj28);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1L));
        boolean boolean27 = grayPaintScale12.equals((java.lang.Object) grayPaintScale21);
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) (-1.0f));
        double double30 = grayPaintScale21.getLowerBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj16 = grayPaintScale15.clone();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (-1));
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) (-1L));
        double double21 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale15.getPaint((double) 0);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj25 = grayPaintScale15.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (-1.0f));
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 1.0f);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) '4');
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, 100.0d);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale10.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale22);
        double double28 = grayPaintScale22.getLowerBound();
        double double29 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale22.getClass();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) wildcardClass30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 1);
        boolean boolean15 = grayPaintScale11.equals((java.lang.Object) 10L);
        java.awt.Paint paint17 = grayPaintScale11.getPaint((double) (byte) 100);
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) 100L);
        double double20 = grayPaintScale11.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getUpperBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) ' ');
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = grayPaintScale6.getClass();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) wildcardClass17);
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) (short) 10);
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        double double15 = grayPaintScale2.getLowerBound();
        double double16 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 1L);
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 10L);
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) 10L);
        double double20 = grayPaintScale11.getUpperBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, 52.0d);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass19 = grayPaintScale16.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = grayPaintScale2.clone();
        java.awt.Paint paint23 = grayPaintScale2.getPaint((double) '4');
        double double24 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 10);
        double double6 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint23 = grayPaintScale15.getPaint((double) 1);
        boolean boolean24 = grayPaintScale10.equals((java.lang.Object) 1);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) boolean24);
        double double26 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        java.awt.Paint paint17 = grayPaintScale10.getPaint((double) (short) 10);
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale10.equals(obj18);
        java.awt.Paint paint21 = grayPaintScale10.getPaint((double) 10.0f);
        java.awt.Paint paint23 = grayPaintScale10.getPaint((double) 1.0f);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) paint23);
        double double25 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 100.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale33.getPaint(0.0d);
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean42 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) 100);
        java.awt.Paint paint19 = grayPaintScale6.getPaint((double) 1L);
        double double20 = grayPaintScale6.getLowerBound();
        java.lang.Object obj21 = grayPaintScale6.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(32.0d);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        double double23 = grayPaintScale15.getLowerBound();
        java.lang.Object obj24 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 1L);
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) (byte) 100);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) (short) 10);
        java.lang.Object obj13 = grayPaintScale5.clone();
        java.awt.Paint paint15 = grayPaintScale5.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (-1.0f));
        double double21 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale18.getPaint(100.0d);
        boolean boolean24 = grayPaintScale5.equals((java.lang.Object) grayPaintScale18);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 1.0d);
        double double18 = grayPaintScale17.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 100);
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) paint10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, 100.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(32.0d);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (-1.0f));
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10.0f);
        double double16 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) ' ');
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) 0);
        boolean boolean21 = grayPaintScale15.equals((java.lang.Object) grayPaintScale18);
        double double22 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale15.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double28 = grayPaintScale27.getLowerBound();
        double double29 = grayPaintScale27.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale27.getPaint((double) (byte) 10);
        boolean boolean32 = grayPaintScale15.equals((java.lang.Object) grayPaintScale27);
        double double33 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale15.getPaint((double) (-1L));
        boolean boolean36 = grayPaintScale12.equals((java.lang.Object) grayPaintScale15);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) boolean36);
        double double38 = grayPaintScale2.getLowerBound();
        double double39 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 100);
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint14 = grayPaintScale2.getPaint(32.0d);
        double double15 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 10L);
        boolean boolean15 = grayPaintScale9.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) 100.0f);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) paint17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getUpperBound();
        double double18 = grayPaintScale2.getUpperBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        double double23 = grayPaintScale15.getLowerBound();
        double double24 = grayPaintScale15.getLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 100);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) 10);
        java.awt.Paint paint23 = grayPaintScale2.getPaint((double) 100);
        java.lang.Class<?> wildcardClass24 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Class<?> wildcardClass2 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double15 = grayPaintScale2.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 100L);
        java.lang.Class<?> wildcardClass20 = paint19.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) 100);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 100.0f);
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) paint15);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 100L);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass11 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint(100.0d);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) (byte) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        boolean boolean20 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double22 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (byte) 100);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 10);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass12 = grayPaintScale8.getClass();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        double double17 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100L);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        double double14 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1.0f);
        double double13 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale11.getPaint((double) 10L);
        double double16 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0.0f);
        double double19 = grayPaintScale11.getLowerBound();
        boolean boolean20 = grayPaintScale5.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 10.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) 1.0f);
        boolean boolean26 = grayPaintScale11.equals((java.lang.Object) paint25);
        double double27 = grayPaintScale11.getUpperBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 'a');
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) ' ');
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double15 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (short) 0);
        double double18 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double15 = grayPaintScale5.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean21 = grayPaintScale5.equals((java.lang.Object) double20);
        java.lang.Object obj22 = grayPaintScale5.clone();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 10);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getUpperBound();
        double double18 = grayPaintScale6.getUpperBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) ' ');
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 10);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint14 = grayPaintScale12.getPaint(10.0d);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getLowerBound();
        java.lang.Object obj17 = grayPaintScale12.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) (byte) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        boolean boolean20 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double22 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj12 = grayPaintScale11.clone();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint18 = grayPaintScale11.getPaint(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) (-1));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) (short) 10);
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 1L);
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getUpperBound();
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 100.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        java.awt.Paint paint19 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 52.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10);
        java.awt.Paint paint20 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint25 = grayPaintScale21.getPaint(0.0d);
        double double26 = grayPaintScale21.getUpperBound();
        double double27 = grayPaintScale21.getLowerBound();
        double double28 = grayPaintScale21.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale2.equals(obj8);
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 'a');
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        java.awt.Paint paint9 = grayPaintScale2.getPaint(1.0d);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 'a');
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) (byte) 1);
        double double18 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale9.getPaint(52.0d);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        double double19 = grayPaintScale5.getLowerBound();
        double double20 = grayPaintScale5.getUpperBound();
        double double21 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100.0f);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 100, 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale12.getPaint((double) (byte) 1);
        java.awt.Paint paint22 = grayPaintScale12.getPaint((double) 10);
        java.awt.Paint paint24 = grayPaintScale12.getPaint((double) 1L);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        double double23 = grayPaintScale15.getLowerBound();
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale15.equals(obj24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 0);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) grayPaintScale8);
        double double12 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale17.getPaint((double) (byte) 10);
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale17);
        double double23 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale5.getPaint((double) (-1L));
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) (short) 0);
        java.lang.Object obj32 = grayPaintScale29.clone();
        double double33 = grayPaintScale29.getUpperBound();
        boolean boolean35 = grayPaintScale29.equals((java.lang.Object) 100);
        java.awt.Paint paint37 = grayPaintScale29.getPaint((double) (byte) 10);
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        java.lang.Object obj39 = grayPaintScale29.clone();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Object obj21 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale5.getPaint(10.0d);
        java.awt.Paint paint9 = grayPaintScale5.getPaint(52.0d);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) paint9);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 1L);
        double double21 = grayPaintScale2.getUpperBound();
        double double22 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale2.getPaint(97.0d);
        java.lang.Object obj25 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 1.0f);
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (byte) 0);
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 0);
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        double double12 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) ' ');
        java.awt.Paint paint16 = grayPaintScale5.getPaint((double) 1.0f);
        java.lang.Object obj17 = grayPaintScale5.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        java.lang.Class<?> wildcardClass19 = obj17.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 0);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) grayPaintScale10);
        double double14 = grayPaintScale7.getUpperBound();
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) '#');
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double19 = grayPaintScale7.getLowerBound();
        double double20 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) (byte) 100);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double15 = grayPaintScale2.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) (byte) -1);
        double double21 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 100);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (byte) 100);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (-1L));
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        double double23 = grayPaintScale7.getUpperBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale7.getClass();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj26 = grayPaintScale2.clone();
        double double27 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) ' ');
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) (short) 10);
        double double16 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale8.getPaint((double) 10.0f);
        java.lang.Object obj19 = grayPaintScale8.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '#');
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(35.0d);
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getLowerBound();
        double double21 = grayPaintScale14.getLowerBound();
        java.lang.Object obj22 = grayPaintScale14.clone();
        double double23 = grayPaintScale14.getUpperBound();
        double double24 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        java.awt.Paint paint29 = grayPaintScale27.getPaint(35.0d);
        double double30 = grayPaintScale27.getLowerBound();
        boolean boolean31 = grayPaintScale14.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint(100.0d);
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) (short) 10);
        double double14 = grayPaintScale6.getLowerBound();
        java.lang.Object obj15 = grayPaintScale6.clone();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getUpperBound();
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 100.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        java.awt.Paint paint19 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double23 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (-1L));
        double double28 = grayPaintScale22.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 32.0d + "'", double28 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        double double23 = grayPaintScale2.getLowerBound();
        double double24 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1L));
        boolean boolean27 = grayPaintScale12.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj28 = grayPaintScale12.clone();
        java.awt.Paint paint30 = grayPaintScale12.getPaint((double) 100);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) 'a');
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Class<?> wildcardClass8 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((-1.0d));
        double double11 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint24 = grayPaintScale15.getPaint(0.0d);
        java.lang.Object obj25 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        double double13 = grayPaintScale5.getUpperBound();
        double double14 = grayPaintScale5.getUpperBound();
        double double15 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (byte) 100);
        double double11 = grayPaintScale5.getLowerBound();
        double double12 = grayPaintScale5.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 32.0d);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 0);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (-1.0f));
        double double19 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getLowerBound();
        double double25 = grayPaintScale22.getUpperBound();
        double double26 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint32 = grayPaintScale22.getPaint(1.0d);
        boolean boolean33 = grayPaintScale15.equals((java.lang.Object) paint32);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 35.0d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 0);
        boolean boolean29 = grayPaintScale23.equals((java.lang.Object) grayPaintScale26);
        double double30 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale23.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double36 = grayPaintScale35.getLowerBound();
        double double37 = grayPaintScale35.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale35.getPaint((double) (byte) 10);
        boolean boolean40 = grayPaintScale23.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint42 = grayPaintScale23.getPaint(0.0d);
        boolean boolean43 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj44 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj9 = grayPaintScale5.clone();
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass11 = grayPaintScale5.getClass();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 100L);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 100.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 10);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getUpperBound();
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getUpperBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) 100L);
        double double12 = grayPaintScale6.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double14 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double27 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint((double) (short) 100);
        java.awt.Paint paint31 = grayPaintScale26.getPaint((double) (-1L));
        boolean boolean32 = grayPaintScale17.equals((java.lang.Object) grayPaintScale26);
        java.awt.Paint paint34 = grayPaintScale17.getPaint((double) (byte) 0);
        boolean boolean36 = grayPaintScale17.equals((java.lang.Object) (byte) 1);
        boolean boolean37 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) (short) 100);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 100L);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale14.getClass();
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint(100.0d);
        double double29 = grayPaintScale23.getUpperBound();
        boolean boolean30 = grayPaintScale10.equals((java.lang.Object) double29);
        java.awt.Paint paint32 = grayPaintScale10.getPaint((double) (short) 0);
        double double33 = grayPaintScale10.getUpperBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) 100);
        double double18 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale6.getPaint(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double13 = grayPaintScale10.getLowerBound();
        double double14 = grayPaintScale10.getUpperBound();
        java.lang.Class<?> wildcardClass15 = grayPaintScale10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (byte) 100);
        double double11 = grayPaintScale5.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 0L);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires lowerBound < upperBound.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) 0);
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) grayPaintScale19);
        boolean boolean23 = grayPaintScale11.equals((java.lang.Object) grayPaintScale14);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) boolean23);
        java.awt.Paint paint26 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double15 = grayPaintScale5.getLowerBound();
        java.lang.Object obj16 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 10);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        java.lang.Object obj20 = grayPaintScale17.clone();
        double double21 = grayPaintScale17.getUpperBound();
        boolean boolean23 = grayPaintScale17.equals((java.lang.Object) 100);
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 10);
        double double26 = grayPaintScale17.getLowerBound();
        java.lang.Class<?> wildcardClass27 = grayPaintScale17.getClass();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 10);
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(97.0d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double10 = grayPaintScale5.getLowerBound();
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) -1);
        double double20 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) '#');
        java.lang.Class<?> wildcardClass3 = grayPaintScale2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 1.0f);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1.0f));
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint17 = grayPaintScale11.getPaint((double) (byte) 100);
        double double18 = grayPaintScale11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double6 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) (short) 100);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) paint10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(32.0d);
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        double double20 = grayPaintScale16.getLowerBound();
        java.lang.Object obj21 = grayPaintScale16.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) 0);
        boolean boolean30 = grayPaintScale24.equals((java.lang.Object) grayPaintScale27);
        double double31 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale24.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double37 = grayPaintScale36.getLowerBound();
        double double38 = grayPaintScale36.getUpperBound();
        java.awt.Paint paint40 = grayPaintScale36.getPaint((double) (byte) 10);
        boolean boolean41 = grayPaintScale24.equals((java.lang.Object) grayPaintScale36);
        double double42 = grayPaintScale36.getLowerBound();
        boolean boolean43 = grayPaintScale16.equals((java.lang.Object) grayPaintScale36);
        boolean boolean44 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        java.awt.Paint paint46 = grayPaintScale16.getPaint((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) 100L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 0);
        boolean boolean29 = grayPaintScale23.equals((java.lang.Object) grayPaintScale26);
        double double30 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale23.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double36 = grayPaintScale35.getLowerBound();
        double double37 = grayPaintScale35.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale35.getPaint((double) (byte) 10);
        boolean boolean40 = grayPaintScale23.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint42 = grayPaintScale23.getPaint(0.0d);
        boolean boolean43 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        double double44 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) '4');
    }
}

