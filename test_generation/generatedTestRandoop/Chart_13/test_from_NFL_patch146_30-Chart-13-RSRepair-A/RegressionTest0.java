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
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range1 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass1 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrange(blockContainer1, graphics2D2, rectangleConstraint3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.jfree.chart.block.Block block4 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block4, (java.lang.Object) borderArrangement5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.jfree.chart.block.Block block4 = null;
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block4, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrange(blockContainer2, graphics2D3, rectangleConstraint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (byte) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        java.lang.Class<?> wildcardClass9 = range5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        java.lang.Class<?> wildcardClass10 = range6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        double double13 = range10.getLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) double13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrange(blockContainer5, graphics2D6, rectangleConstraint7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        java.lang.Class<?> wildcardClass7 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrange(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        java.lang.Class<?> wildcardClass6 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        boolean boolean13 = range11.contains((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        java.lang.Class<?> wildcardClass4 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        double double7 = range5.constrain((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        boolean boolean10 = range2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block11 = null;
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = range14.equals(obj15);
        boolean boolean19 = range14.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range22.constrain(10.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range14, range22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) range14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D32 = borderArrangement0.arrange(blockContainer29, graphics2D30, rectangleConstraint31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block8 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) "Range[97.0,107.0]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 1L);
        org.jfree.chart.block.Block block5 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block5, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (double) (byte) 0, 100.0d);
        java.lang.Class<?> wildcardClass9 = range5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrange(blockContainer3, graphics2D4, rectangleConstraint5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) (short) -1);
        java.lang.Class<?> wildcardClass13 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrange(blockContainer5, graphics2D6, rectangleConstraint7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = range9.equals(obj10);
        boolean boolean12 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (double) 100L, true);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) range22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block2 = null;
        org.jfree.data.Range range5 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double6 = range5.getCentralValue();
        double double7 = range5.getLowerBound();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range5, range10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block2, (java.lang.Object) range16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = range9.equals(obj10);
        boolean boolean12 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        org.jfree.data.Range range4 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double5 = range4.getLength();
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range4, (double) (short) 10);
        double double8 = range7.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) 100L);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        boolean boolean17 = range10.equals((java.lang.Object) range13);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range10, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 10);
        double double17 = range16.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) range16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1L));
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass30 = range9.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        double double18 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass19 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        double double14 = range10.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double20 = range18.constrain(10.0d);
        boolean boolean23 = range18.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str24 = range18.toString();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Range[0.0,10.0]" + "'", str24, "Range[0.0,10.0]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrange(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        java.lang.Class<?> wildcardClass10 = range9.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range4, 100.0d, (double) 100);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block1, (java.lang.Object) range9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (short) 1, (double) (-1L));
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (-9899.0d));
        double double18 = range14.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        boolean boolean11 = range2.contains((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (-1.0d));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        java.lang.String str6 = range5.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.Block block3 = null;
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = range6.equals(obj7);
        boolean boolean11 = range6.intersects(1.0d, (double) (short) 10);
        double double12 = range6.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block3, (java.lang.Object) double12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (double) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass7 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block31 = null;
        org.jfree.data.Range range34 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = range34.equals(obj35);
        boolean boolean39 = range34.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range42 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range42.constrain(10.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range34, range42);
        org.jfree.data.Range range48 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double49 = range48.getLength();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 10);
        double double52 = range51.getLowerBound();
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range51, (double) 100L);
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range57, 100.0d, (double) 100);
        boolean boolean61 = range54.equals((java.lang.Object) range57);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range54, (double) 100);
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range45, range63);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block31, (java.lang.Object) range63);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range64);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) (short) 10);
        double double23 = range22.getLowerBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) 100L);
        boolean boolean28 = range25.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 10);
        double double35 = range34.getLowerBound();
        boolean boolean37 = range34.contains((double) (byte) 0);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range34, (double) 1.0f, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range25, range40);
        double double42 = range41.getLength();
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range45.constrain(10.0d);
        boolean boolean50 = range45.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str51 = range45.toString();
        boolean boolean52 = range41.equals((java.lang.Object) range45);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) boolean52);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Range[0.0,10.0]" + "'", str51, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = range9.equals(obj10);
        boolean boolean12 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrange(blockContainer6, graphics2D7, rectangleConstraint8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range10, (double) 10.0f);
        boolean boolean18 = range15.intersects((double) (byte) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) 10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) (short) 100, false);
        double double17 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range9, (double) '4');
        double double12 = range11.getLength();
        double double13 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 51.0d + "'", double12 == 51.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 26.5d + "'", double13 == 26.5d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        double double9 = range5.getLength();
        double double10 = range5.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        boolean boolean20 = range18.contains((double) (byte) 10);
        java.lang.Class<?> wildcardClass21 = range18.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getUpperBound();
        java.lang.String str7 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,10.0]" + "'", str7, "Range[0.0,10.0]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (-1.0d));
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getLength();
        double double12 = range9.constrain(0.0d);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range9, (double) (short) 1, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range9, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, (double) (byte) 1, (double) (-1));
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) range25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D30 = borderArrangement0.arrange(blockContainer27, graphics2D28, rectangleConstraint29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,10.0]" + "'", str13, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean25 = range20.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        boolean boolean35 = range20.equals((java.lang.Object) 100L);
        double double36 = range20.getLength();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) range20);
        org.jfree.chart.block.BlockContainer blockContainer38 = null;
        java.awt.Graphics2D graphics2D39 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D41 = borderArrangement0.arrange(blockContainer38, graphics2D39, rectangleConstraint40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) range15);
        borderArrangement11.clear();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean23 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.Block block27 = null;
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getCentralValue();
        boolean boolean33 = range30.contains((double) (byte) 0);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range30, (double) 100.0f, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block27, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5.0d + "'", double31 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D32 = borderArrangement7.arrange(blockContainer29, graphics2D30, rectangleConstraint31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 10);
        double double17 = range16.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) 100L);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, 100.0d, (double) 100);
        boolean boolean26 = range19.equals((java.lang.Object) range22);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range19, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range19, (-1.0d), 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1L));
        borderArrangement19.clear();
        boolean boolean23 = range18.equals((java.lang.Object) borderArrangement19);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.Block block25 = null;
        org.jfree.data.Range range28 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, 0.0d, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement19.add(block25, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement7.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block6 = null;
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range9, (double) (short) 10);
        double double13 = range12.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, 100.0d, (double) 100);
        boolean boolean22 = range15.equals((java.lang.Object) range18);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range15, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range15, (double) 100.0f);
        double double28 = range15.getCentralValue();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) range15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 50.0d + "'", double28 == 50.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range18, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range18, (double) 'a');
        boolean boolean25 = range18.equals((java.lang.Object) 10);
        boolean boolean27 = range18.contains((double) 1.0f);
        double double28 = range18.getUpperBound();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range8, range18);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.0d + "'", double19 == 5.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        boolean boolean11 = range9.contains((double) 0L);
        double double13 = range9.constrain(50.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range9, (double) 1.0f);
        java.lang.Class<?> wildcardClass16 = range9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range10, (double) 10.0f);
        double double16 = range10.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        double double30 = range9.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 142.0d + "'", double30 == 142.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.Block block27 = null;
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getCentralValue();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range30, (double) 'a');
        boolean boolean37 = range35.equals((java.lang.Object) 100);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range35, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block27, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5.0d + "'", double31 == 5.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        double double7 = range5.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range5, 1.0d);
        java.lang.String str10 = range9.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9899.0d) + "'", double7 == (-9899.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[-9899.0,10000.0]" + "'", str10, "Range[-9899.0,10000.0]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        double double10 = range6.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = range13.equals(obj14);
        boolean boolean18 = range13.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range21.constrain(10.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range13, range21);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range6, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range6, 10.0d, false);
        double double29 = range6.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 530.0d + "'", double29 == 530.0d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) (short) -1);
        boolean boolean14 = range12.contains(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) (short) 100, false);
        boolean boolean19 = range2.intersects((double) '#', (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range2, (double) 0, 26.5d);
        boolean boolean25 = range22.intersects((double) (byte) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = range11.equals(obj12);
        boolean boolean16 = range11.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range11, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range11, (double) (short) -1);
        double double23 = range21.constrain(50.5d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block8, (java.lang.Object) range21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) '#');
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.5d + "'", double3 == 67.5d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement3.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 265.0d);
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double15 = range14.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 37.0d + "'", double15 == 37.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range38, (double) (-1));
        double double43 = range42.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 49.0d + "'", double43 == 49.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 67.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D33 = borderArrangement3.arrange(blockContainer30, graphics2D31, rectangleConstraint32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean25 = range20.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        boolean boolean35 = range20.equals((java.lang.Object) 100L);
        double double36 = range20.getLength();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) range20);
        java.lang.Object obj38 = null;
        boolean boolean39 = borderArrangement0.equals(obj38);
        org.jfree.chart.block.Block block40 = null;
        org.jfree.data.Range range43 = new org.jfree.data.Range(50.5d, (double) ' ');
        java.lang.Class<?> wildcardClass44 = range43.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block40, (java.lang.Object) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (double) '4');
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) 1.0f);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement13.equals(obj21);
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) range28);
        borderArrangement24.clear();
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = range33.equals(obj34);
        boolean boolean36 = borderArrangement24.equals(obj34);
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean39 = borderArrangement13.equals((java.lang.Object) borderArrangement24);
        boolean boolean40 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BlockContainer blockContainer41 = null;
        java.awt.Graphics2D graphics2D42 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D44 = borderArrangement7.arrange(blockContainer41, graphics2D42, rectangleConstraint43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        boolean boolean8 = range2.intersects((double) 'a', (-9899.0d));
        double double10 = range2.constrain((double) 10L);
        double double11 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.0d + "'", double11 == 99.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) range13);
        borderArrangement9.clear();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = range18.equals(obj19);
        boolean boolean21 = borderArrangement9.equals(obj19);
        boolean boolean22 = range8.equals(obj19);
        double double23 = range8.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.5d + "'", double23 == 50.5d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        boolean boolean14 = range2.contains(142.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrange(blockContainer5, graphics2D6, rectangleConstraint7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, 11.0d);
        java.lang.String str11 = range10.toString();
        java.lang.Class<?> wildcardClass12 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[-989.0,121.0]" + "'", str11, "Range[-989.0,121.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double16 = range14.constrain((double) (short) -1);
        double double18 = range14.constrain((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range7.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass10 = range7.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range23.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        double double8 = range7.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range5 = org.jfree.data.Range.expand(range0, 150.0d, 99.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        java.lang.String str5 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[100.0,1.0]" + "'", str5, "Range[100.0,1.0]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, 530.0d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) range21);
        borderArrangement17.clear();
        borderArrangement17.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(1.0d, (double) (short) 10);
        double double8 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass9 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) 'a');
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) range15);
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        org.jfree.chart.block.Block block41 = null;
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, (double) (-1));
        double double47 = range46.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block41, (java.lang.Object) double47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.0d + "'", double47 == 99.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getLowerBound();
        boolean boolean8 = range2.intersects((double) (byte) 0, 0.0d);
        double double10 = range2.constrain((double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        java.lang.String str13 = range2.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,10.0]" + "'", str13, "Range[0.0,10.0]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D37 = borderArrangement7.arrange(blockContainer34, graphics2D35, rectangleConstraint36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[11.0,-1.0]" + "'", str32, "Range[11.0,-1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (byte) 0, (double) (-1L));
        double double23 = range19.getUpperBound();
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        boolean boolean35 = range32.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 10);
        double double42 = range41.getLowerBound();
        boolean boolean44 = range41.contains((double) (byte) 0);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range41, (double) 1.0f, false);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range32, range47);
        double double49 = range48.getLength();
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double54 = range52.constrain(10.0d);
        boolean boolean57 = range52.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str58 = range52.toString();
        boolean boolean59 = range48.equals((java.lang.Object) range52);
        boolean boolean60 = range19.equals((java.lang.Object) range52);
        boolean boolean61 = range13.equals((java.lang.Object) range52);
        boolean boolean62 = borderArrangement3.equals((java.lang.Object) range13);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range13, 52.0d, 9.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Range[0.0,10.0]" + "'", str58, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(range65);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 19899.0d + "'", double7 == 19899.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.5d + "'", double8 == 50.5d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = range37.equals(obj38);
        boolean boolean42 = range37.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) 100L);
        boolean boolean52 = range37.equals((java.lang.Object) 100L);
        boolean boolean54 = range37.contains((double) (byte) 100);
        double double55 = range37.getUpperBound();
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range34, range37);
        java.lang.Class<?> wildcardClass57 = range34.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.Range range2 = new org.jfree.data.Range(265.0d, (double) '#');
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean25 = range20.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        boolean boolean35 = range20.equals((java.lang.Object) 100L);
        double double36 = range20.getLength();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) range20);
        java.lang.String str38 = range20.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Range[0.0,10.0]" + "'", str38, "Range[0.0,10.0]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double8 = range7.getLowerBound();
        java.lang.String str9 = range7.toString();
        boolean boolean12 = range7.intersects((double) '#', 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[0.0,10.0]" + "'", str9, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        boolean boolean9 = range2.contains((double) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getLength();
        double double9 = range6.constrain(0.0d);
        java.lang.String str10 = range6.toString();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range6, (double) (short) 1, true);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range6, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range16, (double) 0L, false);
        boolean boolean23 = range2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,10.0]" + "'", str10, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) (short) 100, false);
        boolean boolean19 = range2.intersects((double) '#', (double) 0.0f);
        boolean boolean22 = range2.intersects(5.0d, 142.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = range37.equals(obj38);
        boolean boolean42 = range37.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) 100L);
        boolean boolean52 = range37.equals((java.lang.Object) 100L);
        boolean boolean54 = range37.contains((double) (byte) 100);
        double double55 = range37.getUpperBound();
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range34, range37);
        double double57 = range37.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range27.getLength();
        double double30 = range27.constrain(0.0d);
        java.lang.String str31 = range27.toString();
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range27, (double) (short) 1, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range27, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range37, (double) 0L, false);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range8, range43);
        double double45 = range8.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[0.0,10.0]" + "'", str31, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        boolean boolean5 = range2.intersects((double) (byte) 0, (double) (byte) 100);
        boolean boolean7 = range2.contains(52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str8 = range2.toString();
        double double10 = range2.constrain((double) 100L);
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        org.jfree.data.Range range41 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range41, 100.0d, (double) 100);
        boolean boolean45 = range38.equals((java.lang.Object) range41);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range38, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range38, (double) 100.0f);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range38, range53);
        boolean boolean55 = borderArrangement3.equals((java.lang.Object) range54);
        org.jfree.chart.block.BlockContainer blockContainer56 = null;
        java.awt.Graphics2D graphics2D57 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D59 = borderArrangement3.arrange(blockContainer56, graphics2D57, rectangleConstraint58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        boolean boolean15 = range5.intersects((double) 100.0f, 1.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 100.0d, (double) 100);
        boolean boolean31 = range24.equals((java.lang.Object) range27);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range24, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range24, (double) 100.0f);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        boolean boolean41 = range5.equals((java.lang.Object) range40);
        double double42 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-9899.0d) + "'", double42 == (-9899.0d));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        double double7 = range5.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range5, 1.0d);
        boolean boolean11 = range9.contains(35.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9899.0d) + "'", double7 == (-9899.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) range15);
        borderArrangement11.clear();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean23 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D30 = borderArrangement11.arrange(blockContainer27, graphics2D28, rectangleConstraint29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        double double16 = range8.getUpperBound();
        double double17 = range8.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range8, (double) 100);
        java.lang.Class<?> wildcardClass18 = range17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain((double) '#');
        double double13 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 19899.0d + "'", double13 == 19899.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        java.lang.Object obj44 = new java.lang.Object();
        boolean boolean45 = borderArrangement0.equals(obj44);
        org.jfree.chart.block.Block block46 = null;
        org.jfree.data.Range range49 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double50 = range49.getLength();
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range49, (double) (short) 10);
        double double53 = range49.getUpperBound();
        double double55 = range49.constrain((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block46, (java.lang.Object) range49);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) 100L, true);
        org.jfree.data.Range range14 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (double) 1.0f, false);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range14, 0.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range8, range19);
        double double21 = range19.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 26.0d + "'", double21 == 26.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 100.0d, (double) 100);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) range37);
        org.jfree.chart.block.BlockContainer blockContainer39 = null;
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D42 = borderArrangement0.arrange(blockContainer39, graphics2D40, rectangleConstraint41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrange(blockContainer6, graphics2D7, rectangleConstraint8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        java.lang.Object obj44 = new java.lang.Object();
        boolean boolean45 = borderArrangement0.equals(obj44);
        org.jfree.chart.block.BlockContainer blockContainer46 = null;
        java.awt.Graphics2D graphics2D47 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D49 = borderArrangement0.arrange(blockContainer46, graphics2D47, rectangleConstraint48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D31 = borderArrangement13.arrange(blockContainer28, graphics2D29, rectangleConstraint30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (-1));
        double double8 = range5.getLength();
        boolean boolean10 = range5.equals((java.lang.Object) "Range[0.0,100.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double26 = range24.constrain(10.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range16, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range2, range16);
        double double29 = range16.getLowerBound();
        boolean boolean32 = range16.intersects((double) (short) 10, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) range15);
        borderArrangement11.clear();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean23 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.Block block27 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean33 = borderArrangement28.equals((java.lang.Object) range32);
        borderArrangement28.clear();
        borderArrangement28.clear();
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getCentralValue();
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range38, (double) 1);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range38, (double) 'a');
        boolean boolean44 = borderArrangement28.equals((java.lang.Object) range43);
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement11.add(block27, (java.lang.Object) range46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5.0d + "'", double39 == 5.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        double double8 = range7.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 132.0d + "'", double8 == 132.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-99.0d), 50.5d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getLowerBound();
        boolean boolean8 = range2.intersects((double) (byte) 0, 0.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) 0, true);
        double double12 = range2.getCentralValue();
        double double14 = range2.constrain((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        boolean boolean19 = range2.contains(35.0d);
        double double20 = range2.getLowerBound();
        java.lang.String str21 = range2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Range[0.0,10.0]" + "'", str21, "Range[0.0,10.0]");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.Block block27 = null;
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 10);
        double double34 = range33.getLowerBound();
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range33, (double) 100L);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range36, (double) 100L, true);
        java.lang.Class<?> wildcardClass40 = range36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block27, (java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) (-1));
        double double7 = range6.getUpperBound();
        boolean boolean10 = range6.intersects(50.0d, 5.0d);
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 10);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range6, range13);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range6, (double) (byte) 10);
        double double21 = range19.constrain(11.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block1, (java.lang.Object) range19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 19.0d + "'", double21 == 19.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (short) 1, (double) (-1L));
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range17.constrain(10.0d);
        boolean boolean22 = range17.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str23 = range17.toString();
        double double25 = range17.constrain((double) 100L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range14, range17);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, (double) 100);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = range31.equals(obj32);
        boolean boolean36 = range31.intersects(5.0d, (double) 100L);
        double double37 = range31.getLength();
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range31, 0.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range28, range31);
        java.lang.Class<?> wildcardClass41 = range28.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[0.0,10.0]" + "'", str23, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (double) ' ', 1.0d);
        java.lang.String str36 = range35.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Range[-6400.0,400.0]" + "'", str36, "Range[-6400.0,400.0]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) range15);
        borderArrangement11.clear();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean23 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D31 = borderArrangement0.arrange(blockContainer28, graphics2D29, rectangleConstraint30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block45 = null;
        org.jfree.data.Range range48 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double49 = range48.getCentralValue();
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range48, (double) 0L, (double) '4');
        boolean boolean55 = range52.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean57 = range52.contains((double) 0.0f);
        double double59 = range52.constrain((double) (byte) 100);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range52, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block45, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5.0d + "'", double49 == 5.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertNotNull(range61);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        boolean boolean17 = range14.contains((double) (byte) 0);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (double) (short) 1, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block8, (java.lang.Object) range20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) (short) -1);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getLength();
        double double18 = range15.constrain(0.0d);
        java.lang.String str19 = range15.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range15, (double) (short) 1, true);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) '4');
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range2, range24);
        double double26 = range25.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,10.0]" + "'", str19, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 26.0d + "'", double26 == 26.0d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range10.getCentralValue();
        boolean boolean17 = range10.intersects((double) 100L, (double) (short) 0);
        boolean boolean19 = range10.contains((double) (short) 1);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) range10);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (double) (-1));
        double double26 = range25.getUpperBound();
        boolean boolean29 = range25.intersects(50.0d, 5.0d);
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        java.lang.Class<?> wildcardClass37 = range25.getClass();
        boolean boolean38 = range10.equals((java.lang.Object) wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 99.0d + "'", double26 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (byte) 0, (double) (-1L));
        double double23 = range19.getUpperBound();
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        boolean boolean35 = range32.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 10);
        double double42 = range41.getLowerBound();
        boolean boolean44 = range41.contains((double) (byte) 0);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range41, (double) 1.0f, false);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range32, range47);
        double double49 = range48.getLength();
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double54 = range52.constrain(10.0d);
        boolean boolean57 = range52.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str58 = range52.toString();
        boolean boolean59 = range48.equals((java.lang.Object) range52);
        boolean boolean60 = range19.equals((java.lang.Object) range52);
        boolean boolean61 = range13.equals((java.lang.Object) range52);
        boolean boolean62 = borderArrangement3.equals((java.lang.Object) range13);
        org.jfree.chart.block.BlockContainer blockContainer63 = null;
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D66 = borderArrangement3.arrange(blockContainer63, graphics2D64, rectangleConstraint65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Range[0.0,10.0]" + "'", str58, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double36 = range35.getLength();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) (short) 10);
        double double39 = range35.getUpperBound();
        double double40 = range35.getLength();
        boolean boolean41 = range32.equals((java.lang.Object) double40);
        java.lang.Class<?> wildcardClass42 = range32.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        borderArrangement0.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) 26.5d);
        org.jfree.chart.block.BlockContainer blockContainer44 = null;
        java.awt.Graphics2D graphics2D45 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D47 = borderArrangement0.arrange(blockContainer44, graphics2D45, rectangleConstraint46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        double double29 = range26.constrain(0.0d);
        java.lang.String str30 = range26.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) (short) 1, true);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) '4');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range8, range33);
        java.lang.String str37 = range36.toString();
        java.lang.Class<?> wildcardClass38 = range36.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[0.0,10.0]" + "'", str30, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[0.0,100.0]" + "'", str37, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.chart.block.Block block10 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block6 = null;
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range9, (double) 0L, (double) '4');
        boolean boolean16 = range13.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean18 = range13.contains((double) 0.0f);
        double double20 = range13.constrain((double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range13, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) '4', false);
        java.lang.Class<?> wildcardClass17 = range16.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range15, (double) 0L, (double) '4');
        boolean boolean22 = range19.intersects((double) 0L, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) range19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 330.0d, true);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        boolean boolean15 = range12.contains((double) (byte) 0);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range12, (double) 100.0f, (double) 10.0f);
        boolean boolean19 = range2.equals((java.lang.Object) range12);
        double double20 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, 0.0d);
        double double11 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass12 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        double double18 = range2.getCentralValue();
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range21.getLength();
        double double24 = range21.constrain(0.0d);
        java.lang.String str25 = range21.toString();
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range21, (double) (short) 1, true);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range21, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range31, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range2, range31);
        java.lang.Class<?> wildcardClass36 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Range[0.0,10.0]" + "'", str25, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 100L, (double) (short) 0);
        boolean boolean11 = range2.contains((double) (short) 1);
        double double12 = range2.getUpperBound();
        boolean boolean15 = range2.intersects(107.0d, (double) 100.0f);
        java.lang.String str16 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,10.0]" + "'", str16, "Range[0.0,10.0]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1, (-6400.0d));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrange(blockContainer24, graphics2D25, rectangleConstraint26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        double double4 = range2.constrain((double) 100L);
        java.lang.String str5 = range2.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[1.0,10.0]" + "'", str5, "Range[1.0,10.0]");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = range10.equals(obj11);
        boolean boolean15 = range10.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean25 = range10.equals((java.lang.Object) 100L);
        boolean boolean27 = range10.contains((double) (byte) 100);
        double double28 = range10.getLowerBound();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) double28);
        org.jfree.chart.block.Block block30 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (short) 1, (double) (-1L));
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range17.constrain(10.0d);
        boolean boolean22 = range17.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str23 = range17.toString();
        double double25 = range17.constrain((double) 100L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range14, range17);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, 52.0d, false);
        double double30 = range29.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[0.0,10.0]" + "'", str23, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        double double5 = range4.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range4, (double) 1, true);
        double double9 = range8.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 55.0d + "'", double9 == 55.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (byte) 0, (double) (-1L));
        double double23 = range19.getUpperBound();
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        boolean boolean35 = range32.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 10);
        double double42 = range41.getLowerBound();
        boolean boolean44 = range41.contains((double) (byte) 0);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range41, (double) 1.0f, false);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range32, range47);
        double double49 = range48.getLength();
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double54 = range52.constrain(10.0d);
        boolean boolean57 = range52.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str58 = range52.toString();
        boolean boolean59 = range48.equals((java.lang.Object) range52);
        boolean boolean60 = range19.equals((java.lang.Object) range52);
        boolean boolean61 = range13.equals((java.lang.Object) range52);
        boolean boolean62 = borderArrangement3.equals((java.lang.Object) range13);
        org.jfree.data.Range range65 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double66 = range65.getLength();
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range65, (double) (short) 10);
        double double69 = range68.getLowerBound();
        org.jfree.data.Range range71 = org.jfree.data.Range.expandToInclude(range68, (double) 100L);
        boolean boolean74 = range71.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range77 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double78 = range77.getLength();
        org.jfree.data.Range range80 = org.jfree.data.Range.expandToInclude(range77, (double) (short) 10);
        double double81 = range80.getLowerBound();
        boolean boolean83 = range80.contains((double) (byte) 0);
        org.jfree.data.Range range86 = org.jfree.data.Range.shift(range80, (double) 1.0f, false);
        org.jfree.data.Range range87 = org.jfree.data.Range.combine(range71, range86);
        org.jfree.data.Range range90 = org.jfree.data.Range.shift(range71, (double) 0.0f, false);
        boolean boolean91 = borderArrangement3.equals((java.lang.Object) range90);
        org.jfree.chart.block.BlockContainer blockContainer92 = null;
        java.awt.Graphics2D graphics2D93 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D95 = borderArrangement3.arrange(blockContainer92, graphics2D93, rectangleConstraint94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Range[0.0,10.0]" + "'", str58, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertNotNull(range87);
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.Range range2 = new org.jfree.data.Range(19899.0d, 42.0d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        boolean boolean11 = range2.intersects((double) '4', (double) (short) -1);
        double double12 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer42 = null;
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D45 = borderArrangement0.arrange(blockContainer42, graphics2D43, rectangleConstraint44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        double double29 = range26.constrain(0.0d);
        java.lang.String str30 = range26.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) (short) 1, true);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) '4');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range8, range33);
        java.lang.String str37 = range36.toString();
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, 330.0d, false);
        java.lang.Class<?> wildcardClass41 = range36.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[0.0,10.0]" + "'", str30, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[0.0,100.0]" + "'", str37, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        java.lang.Class<?> wildcardClass9 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (double) ' ', 1.0d);
        java.lang.String str36 = range32.toString();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range32, (double) 1L);
        double double39 = range32.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Range[0.0,200.0]" + "'", str36, "Range[0.0,200.0]");
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean11 = range6.contains((double) 0.0f);
        boolean boolean13 = range6.equals((java.lang.Object) (-1));
        boolean boolean16 = range6.intersects(200.0d, (double) 0L);
        double double17 = range6.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 265.0d + "'", double17 == 265.0d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (-1L), 54.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range20.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean25 = range20.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        boolean boolean35 = range20.equals((java.lang.Object) 100L);
        double double36 = range20.getLength();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) range20);
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean43 = borderArrangement41.equals((java.lang.Object) (-1L));
        borderArrangement41.clear();
        boolean boolean45 = range40.equals((java.lang.Object) borderArrangement41);
        org.jfree.chart.block.Block block46 = null;
        java.lang.Object obj47 = null;
        borderArrangement41.add(block46, obj47);
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double52 = range51.getLength();
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range51, (double) (short) 10);
        double double55 = range54.getLowerBound();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range54, (double) 100L);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range57, (double) 100L, true);
        boolean boolean61 = borderArrangement41.equals((java.lang.Object) 100L);
        boolean boolean62 = borderArrangement0.equals((java.lang.Object) boolean61);
        org.jfree.chart.block.BlockContainer blockContainer63 = null;
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D66 = borderArrangement0.arrange(blockContainer63, graphics2D64, rectangleConstraint65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        boolean boolean16 = range2.intersects(43.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain(54.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getCentralValue();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range15, (double) 'a');
        boolean boolean22 = range15.equals((java.lang.Object) 10);
        boolean boolean24 = range15.contains((double) 1.0f);
        double double25 = range15.getUpperBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range5, range15);
        java.lang.Class<?> wildcardClass27 = range15.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 54.0d + "'", double12 == 54.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        double double10 = range9.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 142.0d + "'", double10 == 142.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        java.lang.String str9 = range2.toString();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) 0);
        double double12 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[0.0,10.0]" + "'", str9, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-9899.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range4, (double) (-1L), 5.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        org.jfree.chart.block.BlockContainer blockContainer43 = null;
        java.awt.Graphics2D graphics2D44 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D46 = borderArrangement0.arrange(blockContainer43, graphics2D44, rectangleConstraint45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (-1));
        double double8 = range5.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 330.0d);
        double double11 = range10.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 335.0d + "'", double11 == 335.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        double double5 = range2.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range33.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range33, (double) (short) 10);
        double double37 = range36.getLowerBound();
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range36, (double) 100L);
        boolean boolean42 = range39.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        boolean boolean51 = range48.contains((double) (byte) 0);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range48, (double) 1.0f, false);
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range39, range54);
        double double56 = range55.getLength();
        org.jfree.data.Range range59 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 10);
        double double63 = range62.getLowerBound();
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range62, (double) 100L);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range65, (double) 100L, true);
        boolean boolean69 = range55.equals((java.lang.Object) range65);
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range65, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block30, (java.lang.Object) range71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(range71);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.Range range2 = new org.jfree.data.Range(132.0d, (double) 100L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.Range range2 = new org.jfree.data.Range(19.0d, 50.5d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 100.0d, (double) 100);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) range37);
        org.jfree.chart.block.Block block39 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean42 = borderArrangement40.equals((java.lang.Object) (-1L));
        boolean boolean44 = borderArrangement40.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block39, (java.lang.Object) boolean44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = range23.equals(obj24);
        boolean boolean28 = range23.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range31.constrain(10.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range23, range31);
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = range37.equals(obj38);
        boolean boolean42 = range37.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range45.constrain(10.0d);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range37, range45);
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range23, range37);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) range23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range49);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = range10.equals(obj11);
        boolean boolean15 = range10.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean25 = range10.equals((java.lang.Object) 100L);
        boolean boolean27 = range10.contains((double) (byte) 100);
        double double28 = range10.getLowerBound();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) double28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D33 = borderArrangement0.arrange(blockContainer30, graphics2D31, rectangleConstraint32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range8, 0.0d);
        java.lang.String str27 = range26.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[0.0,100.0]" + "'", str27, "Range[0.0,100.0]");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double26 = range24.constrain(10.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range16, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range2, range16);
        double double29 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (-9899.0d));
        double double3 = range2.getLowerBound();
        java.lang.String str4 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[10.0,-9899.0]" + "'", str4, "Range[10.0,-9899.0]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement3.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-6500.0d), (double) 100);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(1.0d, (double) (short) 10);
        double double8 = range2.getUpperBound();
        double double10 = range2.constrain(10.0d);
        java.lang.String str11 = range2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,10.0]" + "'", str11, "Range[0.0,10.0]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.Range range2 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0);
        double double6 = range4.constrain((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        double double10 = range2.constrain(9.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double16 = range12.constrain((double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 330.0d, false);
        double double20 = range19.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1340.0d + "'", double20 == 1340.0d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        double double5 = range2.getCentralValue();
        boolean boolean7 = range2.contains((double) (-1));
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        double double15 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        java.lang.Class<?> wildcardClass17 = range13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.5d + "'", double5 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range8, (double) 10, false);
        double double22 = range8.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) 0L, 15.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        double double14 = range10.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        boolean boolean7 = range2.contains(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (double) (byte) 0, (double) (-1L));
        double double18 = range14.getUpperBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) range25);
        borderArrangement21.clear();
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = range30.equals(obj31);
        boolean boolean33 = borderArrangement21.equals(obj31);
        boolean boolean34 = range20.equals(obj31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block11, obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double33 = range32.getUpperBound();
        org.jfree.data.Range range36 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double37 = range36.getCentralValue();
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range36, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range39);
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range39, (double) '4');
        boolean boolean46 = borderArrangement3.equals((java.lang.Object) '4');
        borderArrangement3.clear();
        org.jfree.chart.block.BlockContainer blockContainer48 = null;
        java.awt.Graphics2D graphics2D49 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D51 = borderArrangement3.arrange(blockContainer48, graphics2D49, rectangleConstraint50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.0d + "'", double37 == 5.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 16.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) range34);
        borderArrangement30.clear();
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = range39.equals(obj40);
        boolean boolean42 = borderArrangement30.equals(obj40);
        boolean boolean43 = range9.equals((java.lang.Object) borderArrangement30);
        org.jfree.chart.block.BlockContainer blockContainer44 = null;
        java.awt.Graphics2D graphics2D45 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D47 = borderArrangement30.arrange(blockContainer44, graphics2D45, rectangleConstraint46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (double) 0L, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range10, (double) ' ');
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean25 = range20.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        boolean boolean35 = range20.equals((java.lang.Object) 100L);
        double double36 = range20.getLength();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) range20);
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean43 = borderArrangement41.equals((java.lang.Object) (-1L));
        borderArrangement41.clear();
        boolean boolean45 = range40.equals((java.lang.Object) borderArrangement41);
        org.jfree.chart.block.Block block46 = null;
        java.lang.Object obj47 = null;
        borderArrangement41.add(block46, obj47);
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double52 = range51.getLength();
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range51, (double) (short) 10);
        double double55 = range54.getLowerBound();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range54, (double) 100L);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range57, (double) 100L, true);
        boolean boolean61 = borderArrangement41.equals((java.lang.Object) 100L);
        boolean boolean62 = borderArrangement0.equals((java.lang.Object) boolean61);
        org.jfree.chart.block.Block block63 = null;
        org.jfree.data.Range range66 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double67 = range66.getLength();
        org.jfree.data.Range range69 = org.jfree.data.Range.expandToInclude(range66, (double) (short) 10);
        double double70 = range69.getLowerBound();
        boolean boolean72 = range69.contains((double) (byte) 0);
        double double73 = range69.getLength();
        boolean boolean76 = range69.intersects(19899.0d, (double) 100);
        java.lang.Class<?> wildcardClass77 = range69.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block63, (java.lang.Object) range69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 330.0d, true);
        java.lang.Class<?> wildcardClass10 = range9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) 100L, true);
        org.jfree.data.Range range14 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (double) 1.0f, false);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range14, 0.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range8, range19);
        java.lang.String str21 = range8.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Range[0.0,100.0]" + "'", str21, "Range[0.0,100.0]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.data.Range range36 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = range36.equals(obj37);
        boolean boolean41 = range36.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range36, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range36, (double) (short) -1);
        boolean boolean47 = borderArrangement7.equals((java.lang.Object) range36);
        org.jfree.chart.block.BlockContainer blockContainer48 = null;
        java.awt.Graphics2D graphics2D49 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D51 = borderArrangement7.arrange(blockContainer48, graphics2D49, rectangleConstraint50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[11.0,-1.0]" + "'", str32, "Range[11.0,-1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 0.0d);
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, (double) 1.0f, true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.data.Range range23 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean25 = range23.contains((double) 1L);
        boolean boolean28 = range23.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range23, 265.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range23, 9999.0d, (double) 0.0f);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) range33);
        org.jfree.chart.block.Block block35 = null;
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 10);
        double double42 = range41.getLowerBound();
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range41, (double) 100L);
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, 100.0d, (double) 100);
        boolean boolean51 = range44.equals((java.lang.Object) range47);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range44, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range44, (double) 100.0f);
        double double57 = range44.getCentralValue();
        boolean boolean59 = range44.equals((java.lang.Object) 0);
        org.jfree.data.Range range62 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double63 = range62.getLength();
        double double65 = range62.constrain(0.0d);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range62, (double) (short) 1, true);
        org.jfree.data.Range range71 = org.jfree.data.Range.expandToInclude(range69, (double) '4');
        org.jfree.data.Range range72 = org.jfree.data.Range.combine(range44, range69);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block35, (java.lang.Object) range69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 50.0d + "'", double57 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[0.0,10.0]" + "'", str66, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range72);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 5097.5d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range8, (double) 100);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range20.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range20, (double) (short) 10);
        double double24 = range23.getLowerBound();
        boolean boolean26 = range23.contains((double) (byte) 0);
        boolean boolean27 = range8.equals((java.lang.Object) boolean26);
        double double29 = range8.constrain((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-6400.0d));
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6500.0d) + "'", double3 == (-6500.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        java.lang.String str9 = range2.toString();
        double double10 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[0.0,10.0]" + "'", str9, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 10);
        org.jfree.data.Range range11 = new org.jfree.data.Range(11.0d, (-1.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range8, range11);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, 16.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[1.0,100.0]" + "'", str13, "Range[1.0,100.0]");
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        double double7 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        double double12 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        org.jfree.data.Range range12 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) 0);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range5, range12);
        boolean boolean17 = range5.contains(50.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) '#', 99.0d);
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        java.lang.Class<?> wildcardClass13 = range5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        java.lang.String str8 = range2.toString();
        double double9 = range2.getCentralValue();
        double double11 = range2.constrain(0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range2, (double) (-1L));
        double double14 = range13.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[1.0,100.0]" + "'", str8, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.5d + "'", double9 == 50.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        double double14 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 265.0d, (double) '4');
        double double6 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (short) 1, (double) (-1L));
        double double16 = range11.constrain(107.0d);
        double double17 = range11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.0d + "'", double16 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain(54.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getCentralValue();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range15, (double) 'a');
        boolean boolean22 = range15.equals((java.lang.Object) 10);
        boolean boolean24 = range15.contains((double) 1.0f);
        double double25 = range15.getUpperBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range5, range15);
        double double27 = range26.getLowerBound();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (-1));
        double double33 = range32.getUpperBound();
        boolean boolean36 = range32.intersects(50.0d, 5.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double40 = range39.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range39, (double) (short) 10);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range39);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range26, range39);
        boolean boolean47 = range44.intersects((double) (short) 10, 19899.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 54.0d + "'", double12 == 54.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9899.0d) + "'", double27 == (-9899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.0d + "'", double33 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 10);
        double double17 = range16.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (double) 100L, true);
        boolean boolean23 = borderArrangement3.equals((java.lang.Object) 100L);
        borderArrangement3.clear();
        org.jfree.chart.block.Block block25 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block25, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        boolean boolean19 = range2.contains(35.0d);
        double double20 = range2.getLowerBound();
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range23.getCentralValue();
        double double25 = range23.getLowerBound();
        double double26 = range23.getLowerBound();
        double double27 = range23.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range23, 330.0d, true);
        java.lang.String str31 = range30.toString();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range2, range30);
        boolean boolean35 = range30.intersects(5.5d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5.0d + "'", double24 == 5.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[330.0,340.0]" + "'", str31, "Range[330.0,340.0]");
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 100L, (double) (short) 0);
        double double10 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (double) (byte) 10);
        org.jfree.data.Range range15 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range15);
        java.lang.String str17 = range15.toString();
        java.lang.String str18 = range15.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[100.0,100.0]" + "'", str17, "Range[100.0,100.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[100.0,100.0]" + "'", str18, "Range[100.0,100.0]");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement7.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement7.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double5 = range4.getCentralValue();
        double double6 = range4.getLowerBound();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getCentralValue();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range9, (double) (short) 10);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range4, range9);
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) range4);
        double double17 = range4.getLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        double double9 = range2.constrain(0.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 0.0f, (double) ' ');
        double double13 = range12.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean17 = range12.equals((java.lang.Object) range16);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (-1));
        double double23 = range22.getUpperBound();
        double double24 = range22.getCentralValue();
        double double25 = range22.getLowerBound();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range28.constrain(10.0d);
        double double31 = range28.getUpperBound();
        java.lang.String str32 = range28.toString();
        boolean boolean33 = range22.equals((java.lang.Object) str32);
        double double34 = range22.getLowerBound();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range16, range22);
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range16, 19899.0d);
        double double39 = range37.constrain((-6500.0d));
        java.lang.String str40 = range37.toString();
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (short) 10);
        double double47 = range46.getLowerBound();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) 100L);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, 100.0d, (double) 100);
        boolean boolean56 = range49.equals((java.lang.Object) range52);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range49, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range49, (double) 100.0f);
        double double62 = range49.getCentralValue();
        boolean boolean64 = range49.equals((java.lang.Object) 0);
        org.jfree.data.Range range67 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double68 = range67.getLength();
        double double70 = range67.constrain(0.0d);
        java.lang.String str71 = range67.toString();
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range67, (double) (short) 1, true);
        org.jfree.data.Range range76 = org.jfree.data.Range.expandToInclude(range74, (double) '4');
        org.jfree.data.Range range77 = org.jfree.data.Range.combine(range49, range74);
        double double78 = range77.getCentralValue();
        boolean boolean79 = range37.equals((java.lang.Object) double78);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 330.0d + "'", double13 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.0d + "'", double23 == 99.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 54.0d + "'", double24 == 54.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.0d + "'", double25 == 9.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[0.0,10.0]" + "'", str32, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.0d + "'", double34 == 9.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 142.0d + "'", double39 == 142.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Range[142.0,19899.0]" + "'", str40, "Range[142.0,19899.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 50.0d + "'", double62 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Range[0.0,10.0]" + "'", str71, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 50.0d + "'", double78 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean14 = range12.contains((double) 1L);
        boolean boolean17 = range12.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 265.0d);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 265.0d);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = range10.equals(obj11);
        boolean boolean15 = range10.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean25 = range10.equals((java.lang.Object) 100L);
        boolean boolean27 = range10.contains((double) (byte) 100);
        double double28 = range10.getLowerBound();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) double28);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) range34);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double41 = range40.getCentralValue();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range40, (double) 'a');
        boolean boolean46 = borderArrangement30.equals((java.lang.Object) range45);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (-1));
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double53 = range52.getLength();
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range52, (double) (short) 10);
        double double56 = range55.getLowerBound();
        org.jfree.data.Range range58 = org.jfree.data.Range.expandToInclude(range55, (double) 100L);
        boolean boolean61 = range58.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range64 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double65 = range64.getLength();
        org.jfree.data.Range range67 = org.jfree.data.Range.expandToInclude(range64, (double) (short) 10);
        double double68 = range67.getLowerBound();
        boolean boolean70 = range67.contains((double) (byte) 0);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range67, (double) 1.0f, false);
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range58, range73);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range58, (double) 0.0f, false);
        java.lang.String str78 = range58.toString();
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range58, 530.0d, false);
        org.jfree.data.Range range83 = org.jfree.data.Range.shift(range81, (double) 10L);
        boolean boolean84 = borderArrangement0.equals((java.lang.Object) range81);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5.0d + "'", double41 == 5.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Range[0.0,100.0]" + "'", str78, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.Range range2 = new org.jfree.data.Range(200.0d, 49.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = range10.equals(obj11);
        boolean boolean15 = range10.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean25 = range10.equals((java.lang.Object) 100L);
        boolean boolean27 = range10.contains((double) (byte) 100);
        double double28 = range10.getLowerBound();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) double28);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) range34);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double41 = range40.getCentralValue();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range40, (double) 'a');
        boolean boolean46 = borderArrangement30.equals((java.lang.Object) range45);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (-1));
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj53 = new java.lang.Object();
        boolean boolean54 = range52.equals(obj53);
        boolean boolean57 = range52.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range60 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double62 = range60.constrain(10.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range52, range60);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range52, (double) 100L, true);
        boolean boolean67 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.data.Range range70 = new org.jfree.data.Range((-9899.0d), 5.0d);
        boolean boolean71 = borderArrangement0.equals((java.lang.Object) 5.0d);
        org.jfree.chart.block.BlockContainer blockContainer72 = null;
        java.awt.Graphics2D graphics2D73 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D75 = borderArrangement0.arrange(blockContainer72, graphics2D73, rectangleConstraint74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5.0d + "'", double41 == 5.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement7.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        boolean boolean8 = range2.intersects((double) 'a', (-9899.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) (-1.0f), true);
        java.lang.Class<?> wildcardClass12 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        java.lang.String str7 = range2.toString();
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 100.0d, (double) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) ' ');
        boolean boolean16 = range2.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,10.0]" + "'", str7, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        java.lang.String str8 = range2.toString();
        java.lang.Class<?> wildcardClass9 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[1.0,100.0]" + "'", str8, "Range[1.0,100.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.Range range2 = new org.jfree.data.Range(530.0d, (double) (byte) 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, (double) (byte) -1, (double) (short) 10);
        boolean boolean12 = range2.contains((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (byte) 0, (double) (-1L));
        double double15 = range11.getUpperBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean27 = range24.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 10);
        double double34 = range33.getLowerBound();
        boolean boolean36 = range33.contains((double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range33, (double) 1.0f, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        double double41 = range40.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range44.constrain(10.0d);
        boolean boolean49 = range44.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str50 = range44.toString();
        boolean boolean51 = range40.equals((java.lang.Object) range44);
        boolean boolean52 = range11.equals((java.lang.Object) range44);
        boolean boolean53 = range5.equals((java.lang.Object) range44);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range44, (double) (byte) 0);
        double double56 = range55.getCentralValue();
        double double57 = range55.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[0.0,10.0]" + "'", str50, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5.0d + "'", double56 == 5.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        boolean boolean7 = range2.contains(49.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 15.0d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1011.0d, (double) '4');
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 54.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        double double18 = range2.getLength();
        boolean boolean21 = range2.intersects((double) (byte) 1, 335.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean14 = range12.contains((double) 1L);
        boolean boolean17 = range12.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 265.0d);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 265.0d);
        org.jfree.chart.block.Block block21 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) 150.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        borderArrangement7.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range32.constrain(10.0d);
        boolean boolean37 = range32.intersects((double) 10.0f, (double) (-1.0f));
        double double39 = range32.constrain(0.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range32, (double) 0.0f, (double) ' ');
        double double43 = range42.getUpperBound();
        org.jfree.data.Range range46 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean47 = range42.equals((java.lang.Object) range46);
        boolean boolean48 = borderArrangement7.equals((java.lang.Object) boolean47);
        org.jfree.chart.block.Block block49 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block49, (java.lang.Object) (-6500.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 330.0d + "'", double43 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        double double5 = range2.getCentralValue();
        boolean boolean7 = range2.contains((double) (-1));
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        double double15 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) 1.0f);
        double double20 = range13.constrain(50.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.5d + "'", double5 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range19.constrain(10.0d);
        boolean boolean24 = range19.intersects((double) 10.0f, (double) (-1.0f));
        boolean boolean26 = range19.contains((double) 0);
        double double27 = range19.getCentralValue();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range19);
        java.lang.Class<?> wildcardClass29 = range19.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 42.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        double double9 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        org.jfree.chart.block.Block block41 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean47 = borderArrangement42.equals((java.lang.Object) range46);
        borderArrangement42.clear();
        boolean boolean50 = borderArrangement42.equals((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass51 = borderArrangement42.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block41, (java.lang.Object) borderArrangement42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1L));
        borderArrangement19.clear();
        boolean boolean23 = range18.equals((java.lang.Object) borderArrangement19);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement19.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range7.equals((java.lang.Object) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range7, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range7, (double) (short) -1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, 11.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (double) (byte) 0, (double) (-1L));
        double double39 = range35.getUpperBound();
        org.jfree.data.Range range42 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double43 = range42.getLength();
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range42, (double) (short) 10);
        double double46 = range45.getLowerBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) 100L);
        boolean boolean51 = range48.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range54 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double55 = range54.getLength();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range54, (double) (short) 10);
        double double58 = range57.getLowerBound();
        boolean boolean60 = range57.contains((double) (byte) 0);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range57, (double) 1.0f, false);
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range48, range63);
        double double65 = range64.getLength();
        org.jfree.data.Range range68 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double70 = range68.constrain(10.0d);
        boolean boolean73 = range68.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str74 = range68.toString();
        boolean boolean75 = range64.equals((java.lang.Object) range68);
        boolean boolean76 = range35.equals((java.lang.Object) range68);
        boolean boolean77 = range29.equals((java.lang.Object) range68);
        org.jfree.data.Range range78 = null;
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range68, range78);
        boolean boolean81 = range79.equals((java.lang.Object) 0L);
        boolean boolean82 = borderArrangement0.equals((java.lang.Object) range79);
        org.jfree.chart.block.Block block83 = null;
        org.jfree.data.Range range86 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double87 = range86.getCentralValue();
        org.jfree.data.Range range89 = org.jfree.data.Range.shift(range86, (double) 1);
        org.jfree.data.Range range91 = org.jfree.data.Range.expandToInclude(range86, 50.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block83, (java.lang.Object) range86);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Range[0.0,10.0]" + "'", str74, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 5.0d + "'", double87 == 5.0d);
        org.junit.Assert.assertNotNull(range89);
        org.junit.Assert.assertNotNull(range91);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        double double10 = range9.getLowerBound();
        double double11 = range9.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (double) ' ', 1.0d);
        boolean boolean37 = range32.contains((-1.0d));
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range32, 0.0d);
        boolean boolean42 = range32.intersects((double) (-1.0f), 530.0d);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range32, 54.0d);
        java.lang.Class<?> wildcardClass45 = range44.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.Range range2 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0);
        double double5 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-12.0d) + "'", double5 == (-12.0d));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (-1L));
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 11.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range6);
        java.lang.Class<?> wildcardClass10 = range9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean14 = range12.contains((double) 1L);
        boolean boolean17 = range12.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 265.0d);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement0.add(block27, obj28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D33 = borderArrangement0.arrange(blockContainer30, graphics2D31, rectangleConstraint32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        double double29 = range26.constrain(0.0d);
        java.lang.String str30 = range26.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) (short) 1, true);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) '4');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range8, range33);
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = range39.equals(obj40);
        boolean boolean44 = range39.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range39, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range39, (double) (byte) 10);
        org.jfree.data.Range range52 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range39, range52);
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range33, range52);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range33, 265.0d, 142.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[0.0,10.0]" + "'", str30, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = range2.intersects((double) (byte) 1, 5.0d);
        double double6 = range2.getLength();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        double double5 = range2.getCentralValue();
        boolean boolean7 = range2.contains((double) (-1));
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        double double15 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) (-1L));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 49.0d, 10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range2, range19);
        org.jfree.data.Range range26 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean28 = range26.contains((double) 1L);
        boolean boolean31 = range26.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, 265.0d);
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range26, range34);
        boolean boolean36 = range2.equals((java.lang.Object) range35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.5d + "'", double5 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        double double5 = range4.getUpperBound();
        boolean boolean8 = range4.intersects(50.0d, 5.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range4, range11);
        double double16 = range4.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(1.0d, (double) (short) 10);
        double double8 = range2.getUpperBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, (double) (byte) 0);
        java.lang.Object obj11 = null;
        boolean boolean12 = range2.equals(obj11);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range2, 5.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1L));
        borderArrangement10.clear();
        boolean boolean14 = range9.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (-1));
        double double23 = range22.getUpperBound();
        boolean boolean26 = range22.intersects(50.0d, 5.0d);
        org.jfree.data.Range range29 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range29.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) (short) 10);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range22, range29);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range22, (double) (byte) 10);
        boolean boolean36 = borderArrangement10.equals((java.lang.Object) range22);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double40 = range39.getUpperBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getCentralValue();
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range43, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range39, range46);
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range46, (double) '4');
        boolean boolean53 = borderArrangement10.equals((java.lang.Object) '4');
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.data.Range range57 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj58 = new java.lang.Object();
        boolean boolean59 = range57.equals(obj58);
        boolean boolean62 = range57.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range65 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double67 = range65.constrain(10.0d);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range57, range65);
        org.jfree.data.Range range71 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj72 = new java.lang.Object();
        boolean boolean73 = range71.equals(obj72);
        boolean boolean76 = range71.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range79 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double81 = range79.constrain(10.0d);
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range71, range79);
        org.jfree.data.Range range83 = org.jfree.data.Range.combine(range57, range71);
        boolean boolean84 = borderArrangement10.equals((java.lang.Object) range57);
        org.jfree.chart.block.BlockContainer blockContainer85 = null;
        java.awt.Graphics2D graphics2D86 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D88 = borderArrangement10.arrange(blockContainer85, graphics2D86, rectangleConstraint87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.0d + "'", double23 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5.0d + "'", double44 == 5.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double8 = range7.getUpperBound();
        double double9 = range7.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        double double43 = range41.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 135.0d + "'", double43 == 135.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        boolean boolean8 = range2.intersects((double) 'a', (-9899.0d));
        double double9 = range2.getCentralValue();
        boolean boolean12 = range2.intersects((double) 0L, 31.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.5d + "'", double9 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (short) 1, (double) (-1L));
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range17.constrain(10.0d);
        boolean boolean22 = range17.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str23 = range17.toString();
        double double25 = range17.constrain((double) 100L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range14, range17);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, (double) 100);
        double double29 = range28.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[0.0,10.0]" + "'", str23, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.5d + "'", double29 == 45.5d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.Range range2 = new org.jfree.data.Range(55.0d, 330.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (double) ' ', 1.0d);
        boolean boolean38 = range32.intersects((double) 1L, (double) (byte) 1);
        org.jfree.data.Range range41 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range41, (double) 0);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range32, range43);
        double double45 = range44.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 200.0d + "'", double45 == 200.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) 132.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (-1));
        double double8 = range5.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 330.0d);
        double double12 = range5.constrain((double) 10);
        double double13 = range5.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range5, (double) (-1L), false);
        boolean boolean18 = range5.contains((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.Range range2 = new org.jfree.data.Range(52.0d, 97.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        java.lang.String str9 = range2.toString();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        double double15 = range12.constrain(0.0d);
        java.lang.String str16 = range12.toString();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, (double) (short) 1, true);
        boolean boolean21 = range19.contains((double) 0L);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range2, range19);
        java.lang.String str23 = range2.toString();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range2, (double) 'a', false);
        java.lang.String str27 = range2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[0.0,10.0]" + "'", str9, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,10.0]" + "'", str16, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[0.0,10.0]" + "'", str23, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[0.0,10.0]" + "'", str27, "Range[0.0,10.0]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 1.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        java.lang.String str33 = range13.toString();
        double double34 = range13.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Range[0.0,10.0]" + "'", str33, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        boolean boolean15 = range5.intersects((double) 100.0f, 1.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 100.0d, (double) 100);
        boolean boolean31 = range24.equals((java.lang.Object) range27);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range24, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range24, (double) 100.0f);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        boolean boolean41 = range5.equals((java.lang.Object) range40);
        double double42 = range40.getLowerBound();
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range40, (double) 0L, 11.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(range45);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-6400.0d));
        double double3 = range2.getLength();
        java.lang.Class<?> wildcardClass4 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6500.0d) + "'", double3 == (-6500.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.Range range2 = new org.jfree.data.Range(49.0d, (double) (byte) 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range38, (double) (-1));
        double double43 = range38.getLowerBound();
        double double44 = range38.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        boolean boolean19 = range2.contains(35.0d);
        double double20 = range2.getLowerBound();
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range23.getCentralValue();
        double double25 = range23.getLowerBound();
        double double26 = range23.getLowerBound();
        double double27 = range23.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range23, 330.0d, true);
        java.lang.String str31 = range30.toString();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range2, range30);
        double double34 = range2.constrain(26.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5.0d + "'", double24 == 5.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[330.0,340.0]" + "'", str31, "Range[330.0,340.0]");
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean11 = range6.contains((double) 0.0f);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        double double15 = range13.constrain(0.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) (byte) 0, false);
        double double19 = range13.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 530.0d + "'", double19 == 530.0d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range12, (double) (byte) 1, (double) (-1));
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range21.getLength();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) (short) 10);
        double double25 = range24.getLowerBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) 100L);
        boolean boolean30 = range27.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range33.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range33, (double) (short) 10);
        double double37 = range36.getLowerBound();
        boolean boolean39 = range36.contains((double) (byte) 0);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) 1.0f, false);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range27, range42);
        double double44 = range43.getLength();
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double48 = range47.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) (short) 10);
        double double51 = range50.getLowerBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range50, (double) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 100L, true);
        boolean boolean57 = range43.equals((java.lang.Object) range53);
        double double58 = range53.getCentralValue();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range18, range53);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range53, (-6400.0d), true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 50.0d + "'", double58 == 50.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range62);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) range15);
        borderArrangement11.clear();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = range20.equals(obj21);
        boolean boolean23 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.Block block27 = null;
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = range30.equals(obj31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block27, (java.lang.Object) range30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) (short) -1);
        org.jfree.data.Range range15 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        double double17 = range15.constrain((double) 100L);
        boolean boolean18 = range2.equals((java.lang.Object) range15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (double) (byte) 0, (double) (-1L));
        double double28 = range24.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 10);
        double double35 = range34.getLowerBound();
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range34, (double) 100L);
        boolean boolean40 = range37.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (short) 10);
        double double47 = range46.getLowerBound();
        boolean boolean49 = range46.contains((double) (byte) 0);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range46, (double) 1.0f, false);
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range37, range52);
        double double54 = range53.getLength();
        org.jfree.data.Range range57 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double59 = range57.constrain(10.0d);
        boolean boolean62 = range57.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str63 = range57.toString();
        boolean boolean64 = range53.equals((java.lang.Object) range57);
        boolean boolean65 = range24.equals((java.lang.Object) range57);
        boolean boolean66 = range8.equals((java.lang.Object) range24);
        boolean boolean68 = range24.contains(9.0d);
        double double69 = range24.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[0.0,10.0]" + "'", str63, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 99.0d + "'", double69 == 99.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double16 = range12.constrain((double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 330.0d, false);
        double double20 = range19.getLowerBound();
        java.lang.String str21 = range19.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-670.0d) + "'", double20 == (-670.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Range[-670.0,1340.0]" + "'", str21, "Range[-670.0,1340.0]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        boolean boolean8 = range2.intersects((double) 'a', (-9899.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) (byte) -1, true);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range2, 37.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range2, (double) 1.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 10);
        org.jfree.data.Range range11 = new org.jfree.data.Range(11.0d, (-1.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range8, range11);
        java.lang.String str13 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[1.0,100.0]" + "'", str13, "Range[1.0,100.0]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-6500.0d));
        java.lang.String str11 = range8.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[-1000.0,110.0]" + "'", str11, "Range[-1000.0,110.0]");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range20.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range20, (double) (short) 10);
        double double24 = range23.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) (-1L));
        boolean boolean29 = borderArrangement25.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = range23.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean36 = borderArrangement31.equals((java.lang.Object) range35);
        borderArrangement31.clear();
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = range40.equals(obj41);
        boolean boolean43 = borderArrangement31.equals(obj41);
        boolean boolean44 = borderArrangement25.equals((java.lang.Object) borderArrangement31);
        boolean boolean46 = borderArrangement25.equals((java.lang.Object) 50.0d);
        borderArrangement25.clear();
        boolean boolean48 = range2.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BlockContainer blockContainer49 = null;
        java.awt.Graphics2D graphics2D50 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D52 = borderArrangement25.arrange(blockContainer49, graphics2D50, rectangleConstraint51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        org.jfree.chart.block.Block block43 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean49 = borderArrangement44.equals((java.lang.Object) range48);
        borderArrangement44.clear();
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block43, (java.lang.Object) borderArrangement44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) (-1.0f));
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range5, (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1.0f, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 100L, true);
        java.lang.Class<?> wildcardClass9 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5048.5d, (double) (short) 10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        double double10 = range6.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = range13.equals(obj14);
        boolean boolean18 = range13.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range21.constrain(10.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range13, range21);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range6, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range6, 10.0d, false);
        double double30 = range28.constrain(97.0d);
        double double31 = range28.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 540.0d + "'", double31 == 540.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-6500.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, 110.0d, true);
        double double15 = range8.constrain(132.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 110.0d + "'", double15 == 110.0d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        org.jfree.chart.block.Block block44 = null;
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double48 = range47.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) (short) 10);
        double double51 = range50.getLowerBound();
        boolean boolean53 = range50.contains((double) (byte) 0);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range50, (double) 1.0f, false);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (double) (short) 1, (double) (-1L));
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (-9899.0d));
        double double63 = range62.getCentralValue();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block44, (java.lang.Object) double63);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-4949.0d) + "'", double63 == (-4949.0d));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain(54.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getCentralValue();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range15, (double) 'a');
        boolean boolean22 = range15.equals((java.lang.Object) 10);
        boolean boolean24 = range15.contains((double) 1.0f);
        double double25 = range15.getUpperBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range5, range15);
        double double27 = range26.getLowerBound();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (-1));
        double double33 = range32.getUpperBound();
        boolean boolean36 = range32.intersects(50.0d, 5.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double40 = range39.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range39, (double) (short) 10);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range39);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range26, range39);
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double48 = range47.getLength();
        double double50 = range47.constrain(0.0d);
        java.lang.String str51 = range47.toString();
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range47, (double) (short) 1, true);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range47, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range57, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range57, (double) (byte) 1, (double) (-1));
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range63, (double) (-1L), true);
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range44, range66);
        double double68 = range44.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 54.0d + "'", double12 == 54.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9899.0d) + "'", double27 == (-9899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.0d + "'", double33 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Range[0.0,10.0]" + "'", str51, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10000.0d + "'", double68 == 10000.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (-9899.0d));
        java.lang.String str3 = range2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,-9899.0]" + "'", str3, "Range[10.0,-9899.0]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range9, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range14, (double) 10);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range2, range16);
        boolean boolean20 = range2.intersects(150.0d, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range2, (double) 100, 19.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range2, (double) (byte) 0, false);
        double double28 = range26.constrain(1010.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getLowerBound();
        boolean boolean8 = range2.intersects((double) (byte) 0, 0.0d);
        double double10 = range2.constrain((double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        double double13 = range12.getUpperBound();
        double double14 = range12.getLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) 'a');
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) range15);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 100.0d, (double) 100);
        boolean boolean25 = range19.intersects((double) 'a', (-9899.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range19, (double) (-1.0f), true);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range33.getCentralValue();
        double double35 = range33.getLowerBound();
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getCentralValue();
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range38, (double) 1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 10);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range33, range38);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range44, (double) '#', false);
        double double48 = range47.getLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) range47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.0d + "'", double34 == 5.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5.0d + "'", double39 == 5.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (-1));
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 135.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        boolean boolean20 = range18.contains((double) (byte) 10);
        double double22 = range18.constrain((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range7.equals((java.lang.Object) 100);
        double double11 = range7.constrain((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (-1));
        boolean boolean9 = range5.contains(0.0d);
        java.lang.Class<?> wildcardClass10 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        double double5 = range4.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range4, (double) 1, true);
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range8, (-1.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        borderArrangement7.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double18 = range17.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range17, (double) (short) 10);
        double double21 = range20.getLowerBound();
        boolean boolean23 = range20.contains((double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range20, (double) 1.0f, false);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (double) (short) 1, (double) (-1L));
        double double30 = range29.getLength();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block14, (java.lang.Object) double30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        java.lang.String str25 = range23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Range[1.0,11.0]" + "'", str25, "Range[1.0,11.0]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getUpperBound();
        boolean boolean11 = range2.intersects((double) (-1.0f), 540.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-9899.0d));
        double double5 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (byte) 0, (double) (-1L));
        double double15 = range11.getUpperBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean27 = range24.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 10);
        double double34 = range33.getLowerBound();
        boolean boolean36 = range33.contains((double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range33, (double) 1.0f, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        double double41 = range40.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range44.constrain(10.0d);
        boolean boolean49 = range44.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str50 = range44.toString();
        boolean boolean51 = range40.equals((java.lang.Object) range44);
        boolean boolean52 = range11.equals((java.lang.Object) range44);
        boolean boolean53 = range5.equals((java.lang.Object) range44);
        double double54 = range5.getLowerBound();
        java.lang.String str55 = range5.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[0.0,10.0]" + "'", str50, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Range[0.0,10.0]" + "'", str55, "Range[0.0,10.0]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range24.getLength();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, (double) 100L, true);
        boolean boolean38 = range24.equals((java.lang.Object) range34);
        boolean boolean40 = range34.contains((double) 0.0f);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean44 = range34.equals((java.lang.Object) range43);
        java.lang.Class<?> wildcardClass45 = range34.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block32 = null;
        org.jfree.data.Range range35 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = range35.equals(obj36);
        boolean boolean40 = range35.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range43.constrain(10.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range35, range43);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range35, (double) (short) 100, false);
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range49, (double) 1);
        double double52 = range51.getLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block32, (java.lang.Object) range51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 101.0d + "'", double52 == 101.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        java.lang.String str8 = range2.toString();
        double double9 = range2.getCentralValue();
        double double11 = range2.constrain(0.0d);
        double double12 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[1.0,100.0]" + "'", str8, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.5d + "'", double9 == 50.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        double double25 = range8.constrain((double) (byte) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range8, (-670.0d), (-99.0d));
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range28, (double) (byte) 10, false);
        double double32 = range31.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9790.0d) + "'", double32 == (-9790.0d));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement3.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range19.constrain(10.0d);
        boolean boolean24 = range19.intersects((double) 10.0f, (double) (-1.0f));
        boolean boolean26 = range19.contains((double) 0);
        double double27 = range19.getCentralValue();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range19);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D33 = borderArrangement0.arrange(blockContainer30, graphics2D31, rectangleConstraint32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.data.Range range23 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block26 = null;
        org.jfree.data.Range range29 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range29.getCentralValue();
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range29, (double) 1);
        double double33 = range32.getLength();
        double double34 = range32.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block26, (java.lang.Object) double34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5.0d + "'", double30 == 5.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 11.0d + "'", double34 == 11.0d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 100L, (double) (short) 0);
        double double10 = range2.getUpperBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getCentralValue();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range13, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) 'a');
        boolean boolean20 = range13.equals((java.lang.Object) 10);
        boolean boolean22 = range13.contains((double) 1.0f);
        boolean boolean25 = range13.intersects(10.0d, (double) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range2, range13);
        double double27 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        borderArrangement0.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) 26.5d);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean46 = borderArrangement44.equals((java.lang.Object) (-1L));
        boolean boolean48 = borderArrangement44.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block49 = null;
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, 10.0d);
        borderArrangement44.add(block49, (java.lang.Object) range50);
        org.jfree.data.Range range56 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean58 = range56.contains((double) 1L);
        boolean boolean61 = range56.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range56, 265.0d);
        boolean boolean64 = borderArrangement44.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean68 = borderArrangement44.equals((java.lang.Object) (byte) 100);
        boolean boolean69 = borderArrangement0.equals((java.lang.Object) borderArrangement44);
        org.jfree.chart.block.Block block70 = null;
        org.jfree.data.Range range73 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double74 = range73.getCentralValue();
        double double75 = range73.getLowerBound();
        org.jfree.data.Range range78 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double79 = range78.getCentralValue();
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range78, (double) 1);
        org.jfree.data.Range range83 = org.jfree.data.Range.expandToInclude(range78, (double) (short) 10);
        org.jfree.data.Range range84 = org.jfree.data.Range.combine(range73, range78);
        org.jfree.data.Range range86 = org.jfree.data.Range.shift(range84, 330.0d);
        org.jfree.data.Range range89 = org.jfree.data.Range.shift(range84, (double) (byte) 10, false);
        double double91 = range84.constrain((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement44.add(block70, (java.lang.Object) double91);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 5.0d + "'", double74 == 5.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 5.0d + "'", double79 == 5.0d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertNotNull(range89);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        org.jfree.data.Range range46 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range46.getLength();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) (short) 10);
        double double50 = range46.getUpperBound();
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range46, 0.0d);
        double double53 = range52.getCentralValue();
        org.jfree.data.Range range56 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement57 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean59 = borderArrangement57.equals((java.lang.Object) (-1L));
        borderArrangement57.clear();
        boolean boolean61 = range56.equals((java.lang.Object) borderArrangement57);
        org.jfree.chart.block.Block block62 = null;
        java.lang.Object obj63 = null;
        borderArrangement57.add(block62, obj63);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range67, (double) (-1));
        double double70 = range69.getUpperBound();
        boolean boolean73 = range69.intersects(50.0d, 5.0d);
        org.jfree.data.Range range76 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double77 = range76.getLength();
        org.jfree.data.Range range79 = org.jfree.data.Range.expandToInclude(range76, (double) (short) 10);
        org.jfree.data.Range range80 = org.jfree.data.Range.combine(range69, range76);
        org.jfree.data.Range range82 = org.jfree.data.Range.shift(range69, (double) (byte) 10);
        boolean boolean83 = borderArrangement57.equals((java.lang.Object) range69);
        boolean boolean84 = range52.equals((java.lang.Object) boolean83);
        boolean boolean85 = borderArrangement0.equals((java.lang.Object) range52);
        org.jfree.data.Range range88 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        org.jfree.data.Range range91 = org.jfree.data.Range.expand(range88, 265.0d, (double) '4');
        boolean boolean92 = borderArrangement0.equals((java.lang.Object) range91);
        org.jfree.chart.block.BlockContainer blockContainer93 = null;
        java.awt.Graphics2D graphics2D94 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint95 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D96 = borderArrangement0.arrange(blockContainer93, graphics2D94, rectangleConstraint95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5.0d + "'", double53 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 99.0d + "'", double70 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(range91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 5.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        boolean boolean14 = range12.contains((double) (byte) -1);
        double double16 = range12.constrain((double) 0.0f);
        double double17 = range12.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 150.5d + "'", double17 == 150.5d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getLength();
        double double12 = range9.constrain(0.0d);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range9, (double) (short) 1, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range9, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, (double) (byte) 1, (double) (-1));
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) range25);
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement0.equals(obj27);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range31, (double) 0L, (double) '4');
        boolean boolean38 = range35.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean40 = range35.contains((double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range35, 10.0d);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range35);
        org.jfree.chart.block.BlockContainer blockContainer44 = null;
        java.awt.Graphics2D graphics2D45 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D47 = borderArrangement0.arrange(blockContainer44, graphics2D45, rectangleConstraint46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,10.0]" + "'", str13, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5.0d + "'", double32 == 5.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9899.0d), 5.0d);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9904.0d + "'", double3 == 9904.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) 'a');
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) range15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range20.getLength();
        double double23 = range20.constrain(0.0d);
        java.lang.String str24 = range20.toString();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range20, (double) (short) 1, true);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range20, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) ' ');
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range30, (double) '4');
        double double35 = range30.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) double35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Range[0.0,10.0]" + "'", str24, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1010.0d + "'", double35 == 1010.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.Range range2 = new org.jfree.data.Range(19757.0d, (-9790.0d));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.Range range7 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = range11.equals(obj12);
        boolean boolean16 = range11.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range11, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (double) (byte) 10);
        org.jfree.data.Range range24 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range11, range24);
        java.lang.String str26 = range24.toString();
        double double27 = range24.getCentralValue();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) double27);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D32 = borderArrangement0.arrange(blockContainer29, graphics2D30, rectangleConstraint31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[100.0,100.0]" + "'", str26, "Range[100.0,100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 142.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 82.5d, 9999.0d);
        java.lang.Class<?> wildcardClass6 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        double double9 = range2.constrain(0.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 0.0f, (double) ' ');
        double double13 = range12.getUpperBound();
        double double15 = range12.constrain((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 330.0d + "'", double13 == 330.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (-1));
        double double8 = range5.getLength();
        boolean boolean10 = range5.contains(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, 5097.5d);
        java.lang.Class<?> wildcardClass15 = range12.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        borderArrangement7.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range32.constrain(10.0d);
        boolean boolean37 = range32.intersects((double) 10.0f, (double) (-1.0f));
        double double39 = range32.constrain(0.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range32, (double) 0.0f, (double) ' ');
        double double43 = range42.getUpperBound();
        org.jfree.data.Range range46 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean47 = range42.equals((java.lang.Object) range46);
        boolean boolean48 = borderArrangement7.equals((java.lang.Object) boolean47);
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double53 = range51.constrain(10.0d);
        double double54 = range51.getLowerBound();
        boolean boolean57 = range51.intersects((double) (byte) 0, 0.0d);
        double double59 = range51.constrain((double) (byte) -1);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range51, (double) 100);
        double double62 = range51.getUpperBound();
        boolean boolean63 = borderArrangement7.equals((java.lang.Object) double62);
        org.jfree.chart.block.BlockContainer blockContainer64 = null;
        java.awt.Graphics2D graphics2D65 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D67 = borderArrangement7.arrange(blockContainer64, graphics2D65, rectangleConstraint66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 330.0d + "'", double43 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        java.lang.Class<?> wildcardClass41 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (double) '4');
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getLength();
        double double9 = range6.constrain(0.0d);
        java.lang.String str10 = range6.toString();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range6, (double) (short) 1, true);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) '4');
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        double double17 = range13.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,10.0]" + "'", str10, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.0d + "'", double17 == 6.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range9, 43.0d, (double) (short) 10);
        double double34 = range9.constrain((double) (byte) 100);
        double double35 = range9.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 92.5d + "'", double35 == 92.5d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        double double6 = range5.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range5, 82.5d, 43.0d);
        double double10 = range9.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1265.0d + "'", double10 == 1265.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.data.Range range23 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D30 = borderArrangement0.arrange(blockContainer27, graphics2D28, rectangleConstraint29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range9);
        boolean boolean16 = range9.intersects((double) (short) -1, 540.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range12, (double) (byte) 1, (double) (-1));
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range21.getLength();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) (short) 10);
        double double25 = range24.getLowerBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) 100L);
        boolean boolean30 = range27.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range33.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range33, (double) (short) 10);
        double double37 = range36.getLowerBound();
        boolean boolean39 = range36.contains((double) (byte) 0);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) 1.0f, false);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range27, range42);
        double double44 = range43.getLength();
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double48 = range47.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) (short) 10);
        double double51 = range50.getLowerBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range50, (double) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 100L, true);
        boolean boolean57 = range43.equals((java.lang.Object) range53);
        double double58 = range53.getCentralValue();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range18, range53);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, 0.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range59, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) (byte) 1);
        double double66 = range65.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 50.0d + "'", double58 == 50.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range9, 43.0d, (double) (short) 10);
        double double34 = range9.constrain((double) (byte) 100);
        java.lang.Class<?> wildcardClass35 = range9.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        borderArrangement7.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range32.constrain(10.0d);
        boolean boolean37 = range32.intersects((double) 10.0f, (double) (-1.0f));
        double double39 = range32.constrain(0.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range32, (double) 0.0f, (double) ' ');
        double double43 = range42.getUpperBound();
        org.jfree.data.Range range46 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean47 = range42.equals((java.lang.Object) range46);
        boolean boolean48 = borderArrangement7.equals((java.lang.Object) boolean47);
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double53 = range51.constrain(10.0d);
        double double54 = range51.getLowerBound();
        boolean boolean57 = range51.intersects((double) (byte) 0, 0.0d);
        double double59 = range51.constrain((double) (byte) -1);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range51, (double) 100);
        double double62 = range51.getUpperBound();
        boolean boolean63 = borderArrangement7.equals((java.lang.Object) double62);
        org.jfree.chart.block.Block block64 = null;
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range67, 100.0d, (double) 100);
        boolean boolean73 = range67.intersects((double) 'a', (-9899.0d));
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range67, (double) (byte) -1, true);
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range67, 37.0d);
        org.jfree.data.Range range81 = org.jfree.data.Range.expand(range78, 9.0d, 50.0d);
        org.jfree.data.Range range84 = org.jfree.data.Range.shift(range81, 97.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block64, (java.lang.Object) range84);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 330.0d + "'", double43 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range84);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range12, (double) (byte) 1, (double) (-1));
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range18, (double) (-1L), true);
        double double22 = range21.getCentralValue();
        double double23 = range21.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-2006.0d) + "'", double22 == (-2006.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1001.0d) + "'", double23 == (-1001.0d));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 0.0d, 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 10);
        double double35 = range34.getLowerBound();
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range34, (double) 100L);
        boolean boolean40 = range37.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (short) 10);
        double double47 = range46.getLowerBound();
        boolean boolean49 = range46.contains((double) (byte) 0);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range46, (double) 1.0f, false);
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range37, range52);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range37, (double) 0.0f, false);
        java.lang.String str57 = range37.toString();
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range37, 530.0d, false);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range60, (double) 10L);
        boolean boolean63 = borderArrangement0.equals((java.lang.Object) range60);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block65 = null;
        org.jfree.data.Range range68 = new org.jfree.data.Range(49.0d, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block65, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Range[0.0,100.0]" + "'", str57, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 55.0d, 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) 'a');
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) range15);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 100.0d, (double) 100);
        boolean boolean25 = range19.intersects((double) 'a', (-9899.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range19, (double) (-1.0f), true);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block30 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) 540.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, 10000.0d, false);
        double double39 = range34.constrain(132.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (-1L));
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 11.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range6);
        boolean boolean11 = range2.contains(275.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        double double9 = range2.constrain(0.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 0.0f, (double) ' ');
        double double13 = range12.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean17 = range12.equals((java.lang.Object) range16);
        org.jfree.data.Range range20 = new org.jfree.data.Range(11.0d, (-1.0d));
        double double21 = range20.getCentralValue();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range25 = new org.jfree.data.Range(99.0d, (double) (byte) -1);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range25);
        java.lang.Class<?> wildcardClass27 = range26.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 330.0d + "'", double13 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range9, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range14, (double) 10);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range2, range16);
        double double18 = range16.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range16, (double) 100L, true);
        boolean boolean24 = range16.intersects((double) 0L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1.0f, false);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 0.0d);
        boolean boolean9 = range7.contains(275.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, (double) 0.0f, false);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, 51.0d, false);
        double double31 = range30.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getLength();
        double double12 = range9.constrain(0.0d);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range9, (double) (short) 1, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range9, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, (double) (byte) 1, (double) (-1));
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) range25);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double30 = range29.getUpperBound();
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double34 = range33.getCentralValue();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range29, range36);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range25, range29);
        double double42 = range25.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,10.0]" + "'", str13, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.0d + "'", double34 == 5.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-2005.0d) + "'", double42 == (-2005.0d));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) 100L);
        org.jfree.data.Range range54 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range54, 100.0d, (double) 100);
        boolean boolean58 = range51.equals((java.lang.Object) range54);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range51, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range63 = org.jfree.data.Range.expandToInclude(range51, (double) 100.0f);
        java.lang.String str64 = range63.toString();
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range63, (double) (-1.0f));
        double double67 = range63.getLowerBound();
        boolean boolean68 = borderArrangement0.equals((java.lang.Object) double67);
        org.jfree.chart.block.BlockContainer blockContainer69 = null;
        java.awt.Graphics2D graphics2D70 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D72 = borderArrangement0.arrange(blockContainer69, graphics2D70, rectangleConstraint71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.0d + "'", double21 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Range[0.0,100.0]" + "'", str64, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        double double5 = range2.getCentralValue();
        boolean boolean7 = range2.contains((double) (-1));
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        double double15 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) (-1L));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 49.0d, 10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range2, range19);
        boolean boolean25 = range2.contains(19.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.5d + "'", double5 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.Range range2 = new org.jfree.data.Range(275.0d, (-670.0d));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        borderArrangement0.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) 26.5d);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean46 = borderArrangement44.equals((java.lang.Object) (-1L));
        boolean boolean48 = borderArrangement44.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block49 = null;
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, 10.0d);
        borderArrangement44.add(block49, (java.lang.Object) range50);
        org.jfree.data.Range range56 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean58 = range56.contains((double) 1L);
        boolean boolean61 = range56.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range56, 265.0d);
        boolean boolean64 = borderArrangement44.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean68 = borderArrangement44.equals((java.lang.Object) (byte) 100);
        boolean boolean69 = borderArrangement0.equals((java.lang.Object) borderArrangement44);
        org.jfree.chart.block.BlockContainer blockContainer70 = null;
        java.awt.Graphics2D graphics2D71 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D73 = borderArrangement44.arrange(blockContainer70, graphics2D71, rectangleConstraint72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        double double18 = range2.getLength();
        double double19 = range2.getLowerBound();
        double double20 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.Range range2 = new org.jfree.data.Range(530.0d, (double) (short) 10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        double double6 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, (double) 100.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 10);
        java.lang.String str13 = range10.toString();
        double double14 = range10.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[101.0,111.0]" + "'", str13, "Range[101.0,111.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (byte) 0, (double) (-1L));
        double double15 = range11.getUpperBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean27 = range24.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 10);
        double double34 = range33.getLowerBound();
        boolean boolean36 = range33.contains((double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range33, (double) 1.0f, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        double double41 = range40.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range44.constrain(10.0d);
        boolean boolean49 = range44.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str50 = range44.toString();
        boolean boolean51 = range40.equals((java.lang.Object) range44);
        boolean boolean52 = range11.equals((java.lang.Object) range44);
        boolean boolean53 = range5.equals((java.lang.Object) range44);
        org.jfree.data.Range range54 = null;
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range44, range54);
        java.lang.String str56 = range55.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[0.0,10.0]" + "'", str50, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Range[0.0,10.0]" + "'", str56, "Range[0.0,10.0]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, (double) 0.0f, false);
        java.lang.String str28 = range8.toString();
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range8, 530.0d, false);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) 10L);
        boolean boolean35 = range31.contains(265.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,100.0]" + "'", str28, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range10.getCentralValue();
        boolean boolean17 = range10.intersects((double) 100L, (double) (short) 0);
        boolean boolean19 = range10.contains((double) (short) 1);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) range10);
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range23.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range23, (double) (short) 10);
        double double27 = range26.getLowerBound();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) 100L);
        double double30 = range29.getUpperBound();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) double30);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement0.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        double double16 = range14.constrain((double) (short) 1);
        boolean boolean18 = range14.contains((double) '4');
        double double19 = range14.getLowerBound();
        double double21 = range14.constrain(54.0d);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getCentralValue();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range24, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range24, (double) 'a');
        boolean boolean31 = range24.equals((java.lang.Object) 10);
        boolean boolean33 = range24.contains((double) 1.0f);
        double double34 = range24.getUpperBound();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range14, range24);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range39, (double) (-1));
        double double42 = range41.getUpperBound();
        boolean boolean45 = range41.intersects(50.0d, 5.0d);
        org.jfree.data.Range range48 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double49 = range48.getLength();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 10);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range41, range48);
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range35, range48);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) range53);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9899.0d) + "'", double19 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 54.0d + "'", double21 == 54.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.0d + "'", double25 == 5.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9899.0d) + "'", double36 == (-9899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 99.0d + "'", double42 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.Range range2 = new org.jfree.data.Range(31.0d, 530.0d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 10.0d);
        double double3 = range2.getLength();
        double double5 = range2.constrain((double) (-1));
        double double7 = range2.constrain((double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 19899.0d);
        double double10 = range2.getLowerBound();
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(1.0d, (double) (short) 10);
        double double8 = range2.getUpperBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, (double) (byte) 0);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range2, (-6400.0d), false);
        double double14 = range13.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-6400.0d) + "'", double14 == (-6400.0d));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(1.0d, (double) (short) 10);
        java.lang.String str8 = range2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range13, (double) '#', false);
        double double17 = range16.getLowerBound();
        double double18 = range16.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        boolean boolean19 = range2.contains(35.0d);
        double double20 = range2.getLowerBound();
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range23.getCentralValue();
        double double25 = range23.getLowerBound();
        double double26 = range23.getLowerBound();
        double double27 = range23.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range23, 330.0d, true);
        java.lang.String str31 = range30.toString();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range2, range30);
        boolean boolean35 = range30.intersects((-99.0d), 107.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5.0d + "'", double24 == 5.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[330.0,340.0]" + "'", str31, "Range[330.0,340.0]");
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 100.0d, (double) 100);
        boolean boolean25 = range18.equals((java.lang.Object) range21);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range18, (double) 1.0f, (double) 'a');
        boolean boolean29 = range9.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range9, 43.0d, (double) (short) 10);
        org.jfree.data.Range range35 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double36 = range35.getLength();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) (short) 10);
        double double39 = range38.getLowerBound();
        boolean boolean41 = range38.contains((double) (byte) 0);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range38, (double) 1.0f, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, (double) (short) 1, (double) (-1L));
        boolean boolean49 = range47.equals((java.lang.Object) 9999.0d);
        boolean boolean50 = range32.equals((java.lang.Object) 9999.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, 10000.0d, false);
        double double38 = range34.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getCentralValue();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range17, (double) 100.0f);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 10);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range10, range24);
        boolean boolean28 = range10.intersects(150.0d, (double) 'a');
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range10, (double) 100, 19.0d);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) range10);
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D36 = borderArrangement0.arrange(blockContainer33, graphics2D34, rectangleConstraint35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        borderArrangement3.clear();
        org.jfree.chart.block.Block block31 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean37 = borderArrangement32.equals((java.lang.Object) range36);
        borderArrangement32.clear();
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (short) 10);
        double double47 = range46.getLowerBound();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) 100L);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, 100.0d, (double) 100);
        boolean boolean56 = range49.equals((java.lang.Object) range52);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range49, (double) 1.0f, (double) 'a');
        boolean boolean60 = borderArrangement32.equals((java.lang.Object) range49);
        borderArrangement32.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block31, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range5, (double) (byte) -1, (double) 100L);
        double double10 = range9.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) ' ');
        java.lang.String str19 = range13.toString();
        boolean boolean20 = range9.equals((java.lang.Object) str19);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10000.0d + "'", double10 == 10000.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[1.0,100.0]" + "'", str19, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range12, (double) 0L, false);
        boolean boolean21 = range18.intersects(9.0d, (double) 100.0f);
        double double23 = range18.constrain(99.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.0d + "'", double23 == 99.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-6400.0d));
        boolean boolean14 = range11.intersects(5097.5d, 10.0d);
        double double15 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 0.0d);
        double double10 = range9.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        boolean boolean4 = range2.contains(142.0d);
        double double5 = range2.getUpperBound();
        double double7 = range2.constrain(5097.5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range32, (double) (short) 10);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) 100L);
        double double39 = range38.getUpperBound();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) range38);
        borderArrangement0.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) 26.5d);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean46 = borderArrangement44.equals((java.lang.Object) (-1L));
        boolean boolean48 = borderArrangement44.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block49 = null;
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, 10.0d);
        borderArrangement44.add(block49, (java.lang.Object) range50);
        org.jfree.data.Range range56 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean58 = range56.contains((double) 1L);
        boolean boolean61 = range56.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range56, 265.0d);
        boolean boolean64 = borderArrangement44.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean68 = borderArrangement44.equals((java.lang.Object) (byte) 100);
        boolean boolean69 = borderArrangement0.equals((java.lang.Object) borderArrangement44);
        org.jfree.chart.block.Block block70 = null;
        org.jfree.data.Range range73 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double74 = range73.getCentralValue();
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range73, (double) 1);
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range73, (double) 'a');
        boolean boolean80 = range78.equals((java.lang.Object) 100);
        org.jfree.data.Range range82 = org.jfree.data.Range.shift(range78, 0.0d);
        double double83 = range82.getLowerBound();
        double double84 = range82.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block70, (java.lang.Object) range82);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 5.0d + "'", double74 == 5.0d);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 97.0d + "'", double83 == 97.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 107.0d + "'", double84 == 107.0d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 142.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 82.5d, 9999.0d);
        boolean boolean7 = range2.contains(99.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) (byte) -1);
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain(54.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getCentralValue();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range15, (double) 'a');
        boolean boolean22 = range15.equals((java.lang.Object) 10);
        boolean boolean24 = range15.contains((double) 1.0f);
        double double25 = range15.getUpperBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range5, range15);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range5, 26.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 54.0d + "'", double12 == 54.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        double double17 = range11.constrain((double) (-1.0f));
        boolean boolean20 = range11.intersects((-10.0d), (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 1, (double) (-1));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 1);
        boolean boolean7 = range2.intersects(26.0d, 200.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-9790.0d), true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer47 = null;
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D50 = borderArrangement0.arrange(blockContainer47, graphics2D48, rectangleConstraint49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        java.lang.String str8 = range2.toString();
        double double9 = range2.getCentralValue();
        double double11 = range2.constrain(0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 100.0d, (double) 100);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range19, (double) ' ');
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 10.0d);
        boolean boolean29 = range24.intersects((double) 1L, 1.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range24, 55.0d, false);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range14, range32);
        boolean boolean34 = range2.equals((java.lang.Object) range33);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[1.0,100.0]" + "'", str8, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.5d + "'", double9 == 50.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        boolean boolean8 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 1.0f, false);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range5, (double) '4', false);
        org.jfree.data.Range range17 = new org.jfree.data.Range(50.5d, (double) ' ');
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range14, range17);
        double double19 = range18.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 62.0d + "'", double19 == 62.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, (double) 0.0f, false);
        java.lang.String str28 = range8.toString();
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range8, 530.0d, false);
        double double32 = range8.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,100.0]" + "'", str28, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.Range range2 = new org.jfree.data.Range(82.5d, (double) (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        boolean boolean8 = range5.intersects(142.0d, 50.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, 1.0d, true);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range5, 1340.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        boolean boolean15 = range13.contains((double) (short) 10);
        double double17 = range13.constrain((double) 0.0f);
        double double18 = range13.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1340.0d, 1010.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        boolean boolean11 = range6.contains((double) 0.0f);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        double double14 = range13.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, (double) 100, false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 530.0d + "'", double14 == 530.0d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range24.getLength();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range28.constrain(10.0d);
        boolean boolean33 = range28.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str34 = range28.toString();
        boolean boolean35 = range24.equals((java.lang.Object) range28);
        boolean boolean37 = range24.contains(1010.0d);
        java.lang.Class<?> wildcardClass38 = range24.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Range[0.0,10.0]" + "'", str34, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-670.0d), 26.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) (short) -1);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getLength();
        double double18 = range15.constrain(0.0d);
        java.lang.String str19 = range15.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range15, (double) (short) 1, true);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) '4');
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range2, range24);
        double double26 = range24.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,10.0]" + "'", str19, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 26.5d + "'", double26 == 26.5d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, 330.0d);
        boolean boolean17 = range13.contains(1010.0d);
        double double18 = range13.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.Range range7 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 100L, (double) (short) 0);
        double double10 = range2.getUpperBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getCentralValue();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range13, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) 'a');
        boolean boolean20 = range13.equals((java.lang.Object) 10);
        boolean boolean22 = range13.contains((double) 1.0f);
        boolean boolean25 = range13.intersects(10.0d, (double) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range2, range13);
        java.lang.Class<?> wildcardClass27 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (-1));
        double double8 = range5.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 330.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 10000.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 50.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 100.0d, (double) 100);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) range37);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block40 = null;
        org.jfree.data.Range range41 = null;
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range44.getCentralValue();
        double double46 = range44.getLowerBound();
        double double47 = range44.getLowerBound();
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range44, 142.0d, false);
        org.jfree.data.Range range51 = org.jfree.data.Range.combine(range41, range44);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block40, (java.lang.Object) range44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5.0d + "'", double45 == 5.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range51);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range7.equals((java.lang.Object) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range7, 0.0d);
        double double12 = range11.getLowerBound();
        double double13 = range11.getUpperBound();
        double double15 = range11.constrain(67.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 107.0d + "'", double13 == 107.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 10.0d);
        double double3 = range2.getLength();
        double double5 = range2.constrain((double) (-1));
        boolean boolean7 = range2.contains(55.0d);
        boolean boolean10 = range2.intersects((double) (byte) 100, 630.0d);
        double double11 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range17, 108.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range17, (double) 0L, false);
        boolean boolean35 = range33.contains(19757.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        boolean boolean19 = range2.contains(35.0d);
        double double20 = range2.getLowerBound();
        boolean boolean23 = range2.intersects(19.0d, 9.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range5, (double) (byte) 10, 26.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range(100.0d, (-6400.0d));
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 100.0d, false);
        java.lang.String str20 = range15.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range15, 0.0d);
        boolean boolean23 = range5.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6500.0d) + "'", double16 == (-6500.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[100.0,-6400.0]" + "'", str20, "Range[100.0,-6400.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (-1.0f), (double) '#');
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 265.0d, false);
        boolean boolean8 = range6.contains(1265.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (short) -1);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (double) (short) 0);
        boolean boolean14 = range10.equals((java.lang.Object) (-9899.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) (short) 100, false);
        boolean boolean19 = range2.intersects((double) '#', (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range2, 10000.0d, 1011.0d);
        double double23 = range2.getCentralValue();
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range26.constrain(10.0d);
        boolean boolean31 = range26.intersects((double) 10.0f, (double) (-1.0f));
        double double33 = range26.constrain(0.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range26, (double) 0.0f, (double) ' ');
        double double37 = range36.getUpperBound();
        org.jfree.data.Range range40 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean41 = range36.equals((java.lang.Object) range40);
        org.jfree.data.Range range44 = new org.jfree.data.Range(11.0d, (-1.0d));
        double double45 = range44.getCentralValue();
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range36, range44);
        org.jfree.data.Range range49 = new org.jfree.data.Range(99.0d, (double) (byte) -1);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range44, range49);
        double double51 = range49.getLength();
        org.jfree.data.Range range54 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double55 = range54.getLength();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range54, (double) (short) 10);
        double double58 = range57.getLowerBound();
        boolean boolean60 = range57.contains((double) (byte) 0);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range57, (double) 1.0f, false);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range57, (double) '4', false);
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range49, range66);
        boolean boolean68 = range2.equals((java.lang.Object) range67);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5.0d + "'", double23 == 5.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 330.0d + "'", double37 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5.0d + "'", double45 == 5.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-100.0d) + "'", double51 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.Range range2 = new org.jfree.data.Range(142.0d, 630.0d);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 488.0d + "'", double3 == 488.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) (short) 10);
        double double19 = range18.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, 100.0d, (double) 100);
        boolean boolean28 = range21.equals((java.lang.Object) range24);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range21, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range21, (double) 100.0f);
        double double34 = range21.getCentralValue();
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (double) (byte) 0, (double) (-1L));
        double double41 = range37.getUpperBound();
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range44.getLength();
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range44, (double) (short) 10);
        double double48 = range47.getLowerBound();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) 100L);
        boolean boolean53 = range50.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range56 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double57 = range56.getLength();
        org.jfree.data.Range range59 = org.jfree.data.Range.expandToInclude(range56, (double) (short) 10);
        double double60 = range59.getLowerBound();
        boolean boolean62 = range59.contains((double) (byte) 0);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range59, (double) 1.0f, false);
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range50, range65);
        double double67 = range66.getLength();
        org.jfree.data.Range range70 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double72 = range70.constrain(10.0d);
        boolean boolean75 = range70.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str76 = range70.toString();
        boolean boolean77 = range66.equals((java.lang.Object) range70);
        boolean boolean78 = range37.equals((java.lang.Object) range70);
        boolean boolean79 = range21.equals((java.lang.Object) range37);
        boolean boolean80 = borderArrangement7.equals((java.lang.Object) range37);
        java.lang.Class<?> wildcardClass81 = range37.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 50.0d + "'", double34 == 50.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Range[0.0,10.0]" + "'", str76, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        boolean boolean6 = range4.contains(16.0d);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range4, 142.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, 100.0d, (double) 100);
        boolean boolean15 = range9.intersects((double) 'a', (-9899.0d));
        boolean boolean16 = range6.equals((java.lang.Object) (-9899.0d));
        boolean boolean18 = range6.contains(49.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double9 = range2.constrain(10.0d);
        double double10 = range2.getLength();
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range12, range20);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range23, range41);
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) range23);
        org.jfree.data.Range range46 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range46.getLength();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) (short) 10);
        double double50 = range46.getUpperBound();
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range46, 0.0d);
        double double53 = range52.getCentralValue();
        org.jfree.data.Range range56 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement57 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean59 = borderArrangement57.equals((java.lang.Object) (-1L));
        borderArrangement57.clear();
        boolean boolean61 = range56.equals((java.lang.Object) borderArrangement57);
        org.jfree.chart.block.Block block62 = null;
        java.lang.Object obj63 = null;
        borderArrangement57.add(block62, obj63);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range67, (double) (-1));
        double double70 = range69.getUpperBound();
        boolean boolean73 = range69.intersects(50.0d, 5.0d);
        org.jfree.data.Range range76 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double77 = range76.getLength();
        org.jfree.data.Range range79 = org.jfree.data.Range.expandToInclude(range76, (double) (short) 10);
        org.jfree.data.Range range80 = org.jfree.data.Range.combine(range69, range76);
        org.jfree.data.Range range82 = org.jfree.data.Range.shift(range69, (double) (byte) 10);
        boolean boolean83 = borderArrangement57.equals((java.lang.Object) range69);
        boolean boolean84 = range52.equals((java.lang.Object) boolean83);
        boolean boolean85 = borderArrangement0.equals((java.lang.Object) range52);
        org.jfree.chart.block.BlockContainer blockContainer86 = null;
        java.awt.Graphics2D graphics2D87 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint88 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D89 = borderArrangement0.arrange(blockContainer86, graphics2D87, rectangleConstraint88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5.0d + "'", double53 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 99.0d + "'", double70 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1L));
        borderArrangement19.clear();
        boolean boolean23 = range18.equals((java.lang.Object) borderArrangement19);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement19.add(block25, obj26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 100.0d);
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement0.equals(obj31);
        org.jfree.chart.block.Block block33 = null;
        org.jfree.data.Range range36 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double38 = range36.constrain(10.0d);
        boolean boolean41 = range36.intersects((double) 10.0f, (double) (-1.0f));
        double double43 = range36.constrain(0.0d);
        double double45 = range36.constrain((double) (short) 10);
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range36, (-6400.0d));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block33, (java.lang.Object) (-6400.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        double double9 = range2.constrain(0.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 0.0f, (double) ' ');
        double double13 = range12.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean17 = range12.equals((java.lang.Object) range16);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (-1));
        double double23 = range22.getUpperBound();
        double double24 = range22.getCentralValue();
        double double25 = range22.getLowerBound();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range28.constrain(10.0d);
        double double31 = range28.getUpperBound();
        java.lang.String str32 = range28.toString();
        boolean boolean33 = range22.equals((java.lang.Object) str32);
        double double34 = range22.getLowerBound();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range16, range22);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 37.0d, true);
        double double39 = range38.getUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 330.0d + "'", double13 == 330.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.0d + "'", double23 == 99.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 54.0d + "'", double24 == 54.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.0d + "'", double25 == 9.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[0.0,10.0]" + "'", str32, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.0d + "'", double34 == 9.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 136.0d + "'", double39 == 136.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-6400.0d), 107.0d);
        boolean boolean5 = range2.intersects((double) 0.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        double double29 = range26.constrain(0.0d);
        java.lang.String str30 = range26.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) (short) 1, true);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) '4');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range8, range33);
        java.lang.String str37 = range36.toString();
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, 330.0d, false);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range36, (-1001.0d), false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[0.0,10.0]" + "'", str30, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[0.0,100.0]" + "'", str37, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double16 = range12.constrain((double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 330.0d, false);
        double double21 = range19.constrain(45.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 45.5d + "'", double21 == 45.5d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        double double8 = range2.getLength();
        java.lang.String str9 = range2.toString();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) 0);
        boolean boolean13 = range2.contains(51.0d);
        double double14 = range2.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[0.0,10.0]" + "'", str9, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range5, (double) (byte) -1, (double) 100L);
        double double11 = range5.constrain((double) (short) -1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, (double) 0.0f, false);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range8, (double) 10L, (double) '#');
        double double31 = range8.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 10);
        double double9 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.5d + "'", double9 == 50.5d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        boolean boolean15 = range13.contains((double) (short) 10);
        double double17 = range13.constrain((double) 0.0f);
        double double18 = range13.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        java.lang.String str3 = range2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[100.0,101.0]" + "'", str3, "Range[100.0,101.0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range10.getCentralValue();
        boolean boolean17 = range10.intersects((double) 100L, (double) (short) 0);
        boolean boolean19 = range10.contains((double) (short) 1);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) range10);
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range23.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range23, (double) (short) 10);
        double double27 = range26.getLowerBound();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) 100L);
        double double30 = range29.getUpperBound();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) double30);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean38 = borderArrangement33.equals((java.lang.Object) range37);
        borderArrangement33.clear();
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range44.getLength();
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range44, (double) (short) 10);
        double double48 = range47.getLowerBound();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) 100L);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, 100.0d, (double) 100);
        boolean boolean57 = range50.equals((java.lang.Object) range53);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range50, (double) 1.0f, (double) 'a');
        boolean boolean61 = borderArrangement33.equals((java.lang.Object) range50);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range50, 108.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block32, (java.lang.Object) 108.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range63);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, 0.0d);
        double double9 = range8.getCentralValue();
        double double10 = range8.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range8, 67.5d, (double) '4');
        boolean boolean16 = range13.intersects(54.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double6 = range5.getLowerBound();
        double double7 = range5.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range5, 1.0d);
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = range12.equals(obj13);
        boolean boolean17 = range12.intersects(5.0d, (double) 100L);
        double double18 = range12.getLength();
        java.lang.String str19 = range12.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range12, (double) 0);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (double) 100L, true);
        org.jfree.data.Range range36 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range36, (double) 1.0f, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range36, 0.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range30, range41);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range21, range42);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range5, range42);
        boolean boolean46 = range44.contains((double) 10L);
        java.lang.Class<?> wildcardClass47 = range44.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9899.0d) + "'", double6 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9899.0d) + "'", double7 == (-9899.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,10.0]" + "'", str19, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-6400.0d));
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        double double15 = range2.constrain((double) (byte) 1);
        double double16 = range2.getCentralValue();
        double double17 = range2.getCentralValue();
        double double18 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, (double) 0L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean4 = range2.contains((double) 1L);
        boolean boolean7 = range2.intersects((-1.0d), (double) (byte) 10);
        boolean boolean9 = range2.contains(42.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.chart.block.Block block29 = null;
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = range32.equals(obj33);
        boolean boolean37 = range32.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double41 = range40.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.expandToInclude(range40, (double) (short) 10);
        double double44 = range43.getLowerBound();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) 100L);
        boolean boolean47 = range32.equals((java.lang.Object) 100L);
        double double48 = range32.getCentralValue();
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double52 = range51.getLength();
        double double54 = range51.constrain(0.0d);
        java.lang.String str55 = range51.toString();
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range51, (double) (short) 1, true);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range51, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range64 = org.jfree.data.Range.expand(range61, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range65 = org.jfree.data.Range.combine(range32, range61);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block29, (java.lang.Object) range32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 5.0d + "'", double48 == 5.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Range[0.0,10.0]" + "'", str55, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range65);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.data.Range range14 = new org.jfree.data.Range(1.0d, (double) 10L);
        double double15 = range14.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block11, (java.lang.Object) range14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range3.getCentralValue();
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range3, (double) 0L, (double) '4');
        boolean boolean10 = range7.intersects((double) (short) 1, (double) 0.0f);
        double double11 = range7.getLowerBound();
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = range14.equals(obj15);
        boolean boolean19 = range14.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range22.constrain(10.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range14, range22);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range7, range25);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range7, 10.0d, false);
        double double30 = range7.getCentralValue();
        double double31 = range7.getCentralValue();
        double double32 = range7.getLength();
        boolean boolean35 = range7.intersects(0.0d, 335.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range0, range7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 265.0d + "'", double30 == 265.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 265.0d + "'", double31 == 265.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 530.0d + "'", double32 == 530.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        double double8 = range2.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) (byte) 10, true);
        double double12 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.0d + "'", double12 == 99.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 3310.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range24.getLength();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, (double) 100L, true);
        boolean boolean38 = range24.equals((java.lang.Object) range34);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range24, (double) (short) -1, false);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range24, 54.0d, 5346.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.chart.block.Block block29 = null;
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = range32.equals(obj33);
        boolean boolean37 = range32.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double42 = range40.constrain(10.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range40);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block29, (java.lang.Object) range32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean14 = range12.contains((double) 1L);
        boolean boolean17 = range12.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 265.0d);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) range31);
        borderArrangement27.clear();
        borderArrangement27.clear();
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double38 = range37.getCentralValue();
        org.jfree.data.Range range41 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double42 = range41.getCentralValue();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, (double) 1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range44, (double) 100.0f);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range49, (double) 10);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range37, range51);
        boolean boolean55 = range37.intersects(150.0d, (double) 'a');
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range37, (double) 100, 19.0d);
        boolean boolean59 = borderArrangement27.equals((java.lang.Object) range37);
        boolean boolean60 = borderArrangement0.equals((java.lang.Object) boolean59);
        org.jfree.data.Range range63 = new org.jfree.data.Range(530.0d, (double) '#');
        org.jfree.data.Range range66 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj67 = new java.lang.Object();
        boolean boolean68 = range66.equals(obj67);
        boolean boolean71 = range66.intersects(5.0d, (double) 100L);
        double double73 = range66.constrain(10.0d);
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range63, range66);
        java.lang.Class<?> wildcardClass75 = range63.getClass();
        boolean boolean76 = borderArrangement0.equals((java.lang.Object) wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 5.0d + "'", double38 == 5.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5.0d + "'", double42 == 5.0d);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1L, 0.0d);
        double double9 = range7.constrain(50.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        double double12 = range5.constrain((double) '#');
        double double14 = range5.constrain((double) (short) -1);
        double double15 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9899.0d) + "'", double15 == (-9899.0d));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 0.0f);
        double double3 = range2.getUpperBound();
        double double4 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 1, (double) (-1));
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }
}

