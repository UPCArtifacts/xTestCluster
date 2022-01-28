import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.awt.Paint paint0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.jfree.chart.plot.Plot plot0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart(plot0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        float float0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.awt.Image image0 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE;
        org.junit.Assert.assertNull(image0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jfree.chart.plot.Plot plot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart("", plot1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jfree.chart.plot.Plot plot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart("hi!", plot1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jfree.chart.ui.ProjectInfo projectInfo0 = org.jfree.chart.JFreeChart.INFO;
        java.lang.Class<?> wildcardClass1 = projectInfo0.getClass();
        org.junit.Assert.assertNotNull(projectInfo0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.awt.Font font0 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.Plot plot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", font1, plot2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

