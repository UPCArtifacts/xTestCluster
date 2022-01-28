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
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (byte) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (short) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) 100.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        java.lang.Class<?> wildcardClass9 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5.5d, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.Class<?> wildcardClass18 = range17.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        java.lang.Class<?> wildcardClass20 = range17.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        java.lang.Class<?> wildcardClass14 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        java.lang.Class<?> wildcardClass6 = range5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (-10.0d), 0.0d);
        double double9 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        boolean boolean6 = range2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        double double20 = range17.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 168.0d + "'", double20 == 168.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        java.lang.String str10 = range9.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[-1.0,91.0]" + "'", str10, "Range[-1.0,91.0]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        double double7 = range4.getLength();
        java.lang.Class<?> wildcardClass8 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-109.0d) + "'", double7 == (-109.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-71.0d), (double) (short) -1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) 100L, (-71.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass4 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5d + "'", double3 == 5.5d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        java.lang.String str7 = range2.toString();
        double double8 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str3 = range2.toString();
        java.lang.Class<?> wildcardClass4 = range2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        double double11 = range7.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (double) 100);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        java.lang.Class<?> wildcardClass7 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        boolean boolean20 = range11.contains((double) 100.0f);
        java.lang.Class<?> wildcardClass21 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        java.lang.Class<?> wildcardClass36 = range22.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        java.lang.Class<?> wildcardClass11 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range11, 45.0d);
        double double23 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-71.0d) + "'", double23 == (-71.0d));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        double double27 = range11.getCentralValue();
        java.lang.Class<?> wildcardClass28 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 50.5d + "'", double27 == 50.5d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        double double12 = range10.constrain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        java.lang.Class<?> wildcardClass18 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range11, range14);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        double double31 = range29.constrain(1.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range17, range29);
        boolean boolean33 = range5.equals((java.lang.Object) range17);
        boolean boolean35 = range17.contains((-485.0d));
        java.lang.Class<?> wildcardClass36 = range17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-899.0d) + "'", double31 == (-899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 37189.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        java.lang.Class<?> wildcardClass15 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        java.lang.Class<?> wildcardClass27 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        boolean boolean10 = range4.contains(50.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        org.jfree.data.Range range10 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (double) (byte) -1);
        org.jfree.data.Range range15 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double16 = range15.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range10, range15);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range17, (double) (-1), false);
        boolean boolean22 = range17.contains((double) '#');
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range17, 91.0d, true);
        boolean boolean26 = range7.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        java.lang.String str46 = range29.toString();
        java.lang.Class<?> wildcardClass47 = range29.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Range[10.0,10.0]" + "'", str46, "Range[10.0,10.0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean16 = range13.intersects((-1.0d), 0.0d);
        java.lang.Class<?> wildcardClass17 = range13.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        double double9 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double22 = range21.getLength();
        double double23 = range21.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5548.0d + "'", double3 == 5548.0d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        double double13 = range8.getLength();
        java.lang.Class<?> wildcardClass14 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        java.lang.Class<?> wildcardClass13 = range9.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, 44.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double16 = range14.constrain(0.0d);
        double double17 = range14.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37189.0d + "'", double17 == 37189.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getLowerBound();
        double double22 = range11.getCentralValue();
        java.lang.Class<?> wildcardClass23 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-485.0d) + "'", double22 == (-485.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range4, (double) 100L);
        boolean boolean49 = range4.equals((java.lang.Object) 61.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        boolean boolean30 = range26.contains((-799.0d));
        boolean boolean33 = range26.intersects((-2342.5d), 37189.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        double double11 = range10.getLength();
        double double12 = range10.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (-828.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.Range.shift(range0, (-899.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 100.0f, true);
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (-9.0d));
        double double4 = range2.constrain((double) (short) 10);
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        double double19 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-71.0d) + "'", double19 == (-71.0d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        double double8 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        double double8 = range4.getLength();
        java.lang.Class<?> wildcardClass9 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-109.0d) + "'", double8 == (-109.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 110.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 11.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        double double13 = range3.getLowerBound();
        double double14 = range3.getUpperBound();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 5.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        double double18 = range17.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 45.0d + "'", double18 == 45.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 90.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, 55.0d);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        double double8 = range2.constrain((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        double double16 = range15.getCentralValue();
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 17.5d + "'", double16 == 17.5d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.0d + "'", double5 == 55.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range10, range13);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range19, (-9.0d), (double) 100L);
        double double30 = range28.constrain(1.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range16, range28);
        boolean boolean32 = range2.equals((java.lang.Object) range31);
        boolean boolean35 = range2.intersects((-10.0d), (double) 0.0f);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-899.0d) + "'", double30 == (-899.0d));
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (-9.0d), 20.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 45.0d, (-9.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (-1.0d));
        java.lang.Class<?> wildcardClass20 = range19.getClass();
        boolean boolean21 = range2.equals((java.lang.Object) range19);
        java.lang.String str22 = range19.toString();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-72.0,-900.0]" + "'", str22, "Range[-72.0,-900.0]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        java.lang.Class<?> wildcardClass10 = range7.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double14 = range11.constrain((double) (-1));
        double double16 = range11.constrain(5548.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5.5d, (double) 10.0f);
        double double3 = range2.getLowerBound();
        double double4 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5d + "'", double3 == 5.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        boolean boolean23 = range11.intersects((-71.0d), (double) '#');
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        double double11 = range10.getLength();
        double double13 = range10.constrain(50.5d);
        boolean boolean16 = range10.intersects((-449.0d), 90.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range11, range14);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        double double31 = range29.constrain(1.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range17, range29);
        boolean boolean33 = range5.equals((java.lang.Object) range17);
        boolean boolean35 = range5.contains(61.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-899.0d) + "'", double31 == (-899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        double double16 = range11.getLength();
        java.lang.Class<?> wildcardClass17 = range11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        java.lang.Class<?> wildcardClass28 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        double double37 = range35.constrain((double) (short) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        java.lang.String str9 = range5.toString();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[1.0,-899.0]" + "'", str9, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getUpperBound();
        double double12 = range8.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        boolean boolean34 = range21.intersects((double) (-1), 91.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range17.getLength();
        java.lang.Class<?> wildcardClass19 = range17.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 72.0d + "'", double18 == 72.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        double double36 = range33.constrain((double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range33, 32.0d, 61.0d);
        java.lang.Class<?> wildcardClass40 = range33.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        double double39 = range18.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range18, (-900.0d), true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-109.0d) + "'", double39 == (-109.0d));
        org.junit.Assert.assertNotNull(range42);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 10, (-0.5d));
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        double double39 = range18.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range18, 232.75d, false);
        java.lang.Class<?> wildcardClass43 = range18.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-109.0d) + "'", double39 == (-109.0d));
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean7 = range2.contains(5.5d);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (-4.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) (byte) -1);
        org.jfree.data.Range range17 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double18 = range17.getUpperBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range12, range17);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (double) (-1), false);
        boolean boolean24 = range19.contains((double) '#');
        double double26 = range19.constrain((double) 100L);
        boolean boolean27 = range2.equals((java.lang.Object) double26);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9.0d) + "'", double18 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        double double46 = range4.getCentralValue();
        double double48 = range4.constrain(5548.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 44.5d + "'", double46 == 44.5d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-10.0d) + "'", double48 == (-10.0d));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        org.jfree.data.Range range23 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (double) 10L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        boolean boolean28 = range26.contains((double) (short) 1);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 5.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (-900.0d));
        java.lang.Class<?> wildcardClass42 = range38.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        java.lang.Class<?> wildcardClass14 = range11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 45.0d);
        boolean boolean15 = range11.contains((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        double double32 = range21.getCentralValue();
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, 5.5d);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, 5.5d, (double) 10.0f);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (double) (byte) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass53 = range49.getClass();
        boolean boolean54 = range21.equals((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 45.0d + "'", double32 == 45.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range17.getLength();
        boolean boolean21 = range17.intersects((-799.0d), (double) (byte) -1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 72.0d + "'", double18 == 72.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        java.lang.Class<?> wildcardClass21 = range9.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        boolean boolean9 = range7.equals((java.lang.Object) (-9138.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range2.getLowerBound();
        boolean boolean12 = range2.intersects((double) (-1L), (double) 10L);
        double double13 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, 72.0d, true);
        double double57 = range56.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-9.0d) + "'", double57 == (-9.0d));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double16 = range14.constrain(0.0d);
        java.lang.Class<?> wildcardClass17 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.Range range2 = new org.jfree.data.Range(107.25d, 61.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range5, 90.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, 10999.0d, true);
        double double37 = range35.constrain(37189.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10989.0d + "'", double37 == 10989.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean22 = range11.equals((java.lang.Object) 10.0f);
        double double23 = range11.getUpperBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, 0.0d);
        boolean boolean27 = range25.contains(5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-899.0d) + "'", double23 == (-899.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        java.lang.Class<?> wildcardClass39 = range38.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range11, (double) (-1), (-899.0d));
        double double24 = range22.constrain(171.0d);
        double double25 = range22.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 171.0d + "'", double24 == 171.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 743473.0d + "'", double25 == 743473.0d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        boolean boolean58 = range53.contains((-0.5d));
        double double59 = range53.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 5.5d + "'", double59 == 5.5d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        double double21 = range14.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 55.0d + "'", double21 == 55.0d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (short) 10, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 21871.0d);
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        double double18 = range8.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9.0d) + "'", double18 == (-9.0d));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, 45.0d, (-828.0d));
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        boolean boolean11 = range8.intersects(15.5d, (double) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        double double9 = range4.getCentralValue();
        double double10 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, (-0.5d), true);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range5, (double) 1L, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        boolean boolean10 = range5.intersects((-9138.5d), (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 55.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 100, 0.0d);
        java.lang.String str8 = range2.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[10999.0,100.0]" + "'", str8, "Range[10999.0,100.0]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        java.lang.Class<?> wildcardClass16 = range12.getClass();
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range7.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range7, (-9.0d), (double) 100L);
        double double18 = range16.constrain(1.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range16, (double) 'a');
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-1.0d), (-9.0d));
        boolean boolean26 = range2.equals((java.lang.Object) range16);
        java.lang.Class<?> wildcardClass27 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (-10.0d));
        boolean boolean18 = range8.equals((java.lang.Object) range17);
        double double19 = range17.getCentralValue();
        boolean boolean20 = range2.equals((java.lang.Object) double19);
        double double21 = range2.getLength();
        java.lang.Class<?> wildcardClass22 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-900.0d), true);
        boolean boolean12 = range7.contains(61.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, (double) (short) -1, false);
        boolean boolean28 = range10.equals((java.lang.Object) range27);
        boolean boolean31 = range10.intersects((double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        boolean boolean17 = range10.intersects((double) (byte) 100, 6553.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        java.lang.Class<?> wildcardClass9 = range8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range11, (double) (-1), (-899.0d));
        double double24 = range22.constrain(171.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range22, 743473.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 171.0d + "'", double24 == 171.0d);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-942.0d), 4488.5d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        java.lang.Class<?> wildcardClass8 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        boolean boolean38 = range25.intersects((-485.0d), 10999.0d);
        boolean boolean40 = range25.contains(17.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range49, 45.0d, false);
        org.jfree.data.Range range56 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-1.0d), (double) (byte) 100);
        boolean boolean62 = range56.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range56, (-9.0d), (double) 100L);
        double double67 = range65.constrain(1.0d);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range65, (double) (byte) 100);
        org.jfree.data.Range range71 = org.jfree.data.Range.expandToInclude(range65, (double) 'a');
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range65, (-1.0d), (-9.0d));
        java.lang.Class<?> wildcardClass75 = range65.getClass();
        boolean boolean76 = range49.equals((java.lang.Object) wildcardClass75);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-899.0d) + "'", double67 == (-899.0d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9.0d), (-31328.0d));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        java.lang.Object obj8 = null;
        boolean boolean9 = range7.equals(obj8);
        boolean boolean11 = range7.contains(37189.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        double double28 = range25.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) (byte) -1);
        double double35 = range33.constrain((double) 0L);
        boolean boolean37 = range33.contains(168.0d);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (-109.0d));
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (-10.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range49, range52);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-1.0d), (double) (byte) 100);
        boolean boolean64 = range58.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range58, (-9.0d), (double) 100L);
        double double69 = range67.constrain(1.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range55, range67);
        boolean boolean71 = range43.equals((java.lang.Object) range55);
        boolean boolean73 = range55.contains((-485.0d));
        boolean boolean74 = range33.equals((java.lang.Object) (-485.0d));
        boolean boolean75 = range25.equals((java.lang.Object) (-485.0d));
        java.lang.Class<?> wildcardClass76 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-10.0d) + "'", double35 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-899.0d) + "'", double69 == (-899.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 45.0d);
        java.lang.String str14 = range11.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[0.0,11.0]" + "'", str14, "Range[0.0,11.0]");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.0d) + "'", double3 == (-10.0d));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, 0.0d);
        double double10 = range6.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean22 = range11.equals((java.lang.Object) 10.0f);
        double double23 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-71.0d) + "'", double23 == (-71.0d));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        boolean boolean11 = range9.contains((double) 100);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        boolean boolean7 = range2.contains((-0.5d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        double double17 = range11.constrain(16.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 16.5d + "'", double17 == 16.5d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double23 = range18.constrain((double) 0);
        double double25 = range18.constrain((double) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        boolean boolean58 = range53.contains((-0.5d));
        double double59 = range53.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        boolean boolean22 = range11.contains(5.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        java.lang.Class<?> wildcardClass36 = range35.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        java.lang.String str17 = range11.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[-71.0,-899.0]" + "'", str17, "Range[-71.0,-899.0]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        boolean boolean10 = range8.contains((-4.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        double double8 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 46.0d + "'", double8 == 46.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 1, 46.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        java.lang.Class<?> wildcardClass57 = range56.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        double double46 = range4.getCentralValue();
        double double47 = range4.getLength();
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range50, (-1.0d), (double) (byte) 100);
        boolean boolean56 = range50.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range50, (-9.0d), (double) 100L);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range59, (double) 1);
        org.jfree.data.Range range64 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range64, (double) (byte) -1);
        boolean boolean69 = range66.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range59, range66);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range59, (double) (short) -1, false);
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range59, (double) 100, true);
        org.jfree.data.Range range77 = org.jfree.data.Range.combine(range4, range76);
        org.jfree.data.Range range80 = org.jfree.data.Range.shift(range76, 5.0d, true);
        java.lang.Class<?> wildcardClass81 = range80.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 44.5d + "'", double46 == 44.5d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-109.0d) + "'", double47 == (-109.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 110.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        boolean boolean12 = range9.contains(0.0d);
        double double13 = range9.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 99.0d + "'", double13 == 99.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, 45.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) (byte) 100, true);
        double double20 = range19.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-30636.0d) + "'", double20 == (-30636.0d));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 107.25d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.Range range2 = new org.jfree.data.Range(232.75d, 11044.5d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        double double7 = range2.getLength();
        boolean boolean9 = range2.equals((java.lang.Object) (-109.0d));
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        java.lang.String str10 = range7.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[-1.0,91.0]" + "'", str10, "Range[-1.0,91.0]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        boolean boolean9 = range6.intersects((double) (short) 10, 15.5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 5.5d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, 1.0d, true);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        boolean boolean32 = range22.equals((java.lang.Object) range31);
        boolean boolean33 = range17.equals((java.lang.Object) range31);
        double double34 = range17.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range2, range17);
        boolean boolean37 = range35.contains((-9173.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-485.0d) + "'", double34 == (-485.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.Range range2 = new org.jfree.data.Range(20.0d, (-828.0d));
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range11, (double) (-1), (-899.0d));
        boolean boolean25 = range11.intersects(52.0d, 72.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (-109.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-71.0d), (-828.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range11, range23);
        boolean boolean27 = range11.intersects((-818.0d), 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (double) (-1L));
        boolean boolean5 = range2.intersects((double) 0L, (double) 1);
        double double7 = range2.constrain((double) 1L);
        boolean boolean9 = range2.contains(33.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, 99.0d, true);
        java.lang.Class<?> wildcardClass11 = range10.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        double double12 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.0d + "'", double12 == 99.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-900.0d), 10989.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        double double8 = range6.constrain((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        boolean boolean29 = range25.contains((-485.0d));
        java.lang.Class<?> wildcardClass30 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double4 = range2.constrain(72.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1L, 55.0d);
        java.lang.String str8 = range7.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[189.0,-4884.0]" + "'", str8, "Range[189.0,-4884.0]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        double double54 = range53.getLowerBound();
        double double56 = range53.constrain(44.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 20.0d + "'", double54 == 20.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 44.5d + "'", double56 == 44.5d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        double double6 = range2.getLowerBound();
        boolean boolean9 = range2.intersects(17.5d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, 72.0d);
        double double31 = range30.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 172.0d + "'", double31 == 172.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range37.intersects((double) (byte) 10, 10.0d);
        boolean boolean41 = range27.equals((java.lang.Object) boolean40);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range27, (double) (byte) 100, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range27, 100.0d, (-0.5d));
        java.lang.String str48 = range47.toString();
        double double49 = range47.getLowerBound();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range52, (double) 10.0f, false);
        boolean boolean60 = range58.contains((double) 1L);
        double double61 = range58.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range47, range58);
        boolean boolean63 = range5.equals((java.lang.Object) range58);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range58, (-109.0d));
        double double66 = range58.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[10999.0,44.5]" + "'", str48, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10999.0d + "'", double49 == 10999.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 11.0d + "'", double61 == 11.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 15.5d + "'", double66 == 15.5d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (-109.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-71.0d), (-828.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range11, range23);
        boolean boolean26 = range24.contains((double) 0.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 1);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        java.lang.String str9 = range5.toString();
        java.lang.String str10 = range5.toString();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range5, 13.0d, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[1.0,-899.0]" + "'", str9, "Range[1.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[1.0,-899.0]" + "'", str10, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.Range range2 = new org.jfree.data.Range(484.0d, (-26442.5d));
        boolean boolean4 = range2.contains((double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-4.0d), (-9.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean10 = range8.equals((java.lang.Object) 100L);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range16.intersects((double) (byte) 10, 10.0d);
        java.lang.String str20 = range16.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range8, range16);
        double double22 = range16.getCentralValue();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range2, range16);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[1.0,-899.0]" + "'", str20, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-449.0d) + "'", double22 == (-449.0d));
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        double double8 = range5.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range5, 17.5d);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        double double24 = range22.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, (double) (byte) 100);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range22, (double) 'a');
        double double29 = range22.getLength();
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean33 = range22.equals((java.lang.Object) 10.0f);
        double double34 = range22.getUpperBound();
        boolean boolean35 = range10.equals((java.lang.Object) double34);
        boolean boolean37 = range10.contains((double) 100);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-899.0d) + "'", double24 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-828.0d) + "'", double29 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-899.0d) + "'", double34 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 15.5d);
        java.lang.Class<?> wildcardClass16 = range13.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        java.lang.String str9 = range5.toString();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) 1);
        double double12 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[1.0,-899.0]" + "'", str9, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-899.0d) + "'", double12 == (-899.0d));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range20, (-2342.5d), true);
        double double67 = range20.getUpperBound();
        double double68 = range20.getCentralValue();
        double double69 = range20.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-898.0d) + "'", double67 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-484.0d) + "'", double68 == (-484.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-898.0d) + "'", double69 == (-898.0d));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, 5.5d);
        double double33 = range29.constrain((double) (short) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range29, (double) 1);
        double double36 = range29.getLength();
        java.lang.String str37 = range29.toString();
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range29, (double) (-1), (-899.0d));
        double double42 = range40.constrain(171.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range11, range40);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-899.0d) + "'", double33 == (-899.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-828.0d) + "'", double36 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[-71.0,-899.0]" + "'", str37, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 171.0d + "'", double42 == 171.0d);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        java.lang.Class<?> wildcardClass46 = range45.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range10, range13);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range19, (-9.0d), (double) 100L);
        double double30 = range28.constrain(1.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range16, range28);
        boolean boolean32 = range2.equals((java.lang.Object) range31);
        java.lang.Object obj33 = null;
        boolean boolean34 = range2.equals(obj33);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-899.0d) + "'", double30 == (-899.0d));
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 0.0d, 0.0d);
        double double19 = range17.constrain((-933.0d));
        boolean boolean21 = range17.contains((-485.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLength();
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        java.lang.String str22 = range20.toString();
        double double23 = range20.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range20, (double) (byte) 1);
        java.lang.String str26 = range20.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,0.0]" + "'", str22, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 71.0d + "'", double23 == 71.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[-71.0,0.0]" + "'", str26, "Range[-71.0,0.0]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLength();
        double double6 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10999.0d, true);
        double double8 = range7.getCentralValue();
        java.lang.Class<?> wildcardClass9 = range7.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11044.5d + "'", double8 == 11044.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        double double28 = range25.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) (byte) -1);
        double double35 = range33.constrain((double) 0L);
        boolean boolean37 = range33.contains(168.0d);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (-109.0d));
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (-10.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range49, range52);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-1.0d), (double) (byte) 100);
        boolean boolean64 = range58.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range58, (-9.0d), (double) 100L);
        double double69 = range67.constrain(1.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range55, range67);
        boolean boolean71 = range43.equals((java.lang.Object) range55);
        boolean boolean73 = range55.contains((-485.0d));
        boolean boolean74 = range33.equals((java.lang.Object) (-485.0d));
        boolean boolean75 = range25.equals((java.lang.Object) (-485.0d));
        double double76 = range25.getLength();
        java.lang.Class<?> wildcardClass77 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-10.0d) + "'", double35 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-899.0d) + "'", double69 == (-899.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 90.0d + "'", double76 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getUpperBound();
        java.lang.Class<?> wildcardClass19 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 44.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-942.0d), (double) (byte) 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (-9173.5d));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        double double12 = range11.getLength();
        double double13 = range11.getLength();
        java.lang.Class<?> wildcardClass14 = range11.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-942.0d) + "'", double12 == (-942.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-942.0d) + "'", double13 == (-942.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, 37189.0d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37189.0d + "'", double3 == 37189.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        boolean boolean17 = range2.equals((java.lang.Object) range7);
        double double19 = range2.constrain(11044.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        double double7 = range5.constrain((double) 100);
        double double9 = range5.constrain((-13662.0d));
        boolean boolean11 = range5.contains((-1.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 91.0d + "'", double7 == 91.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        boolean boolean11 = range7.contains((-449.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 107.25d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        boolean boolean14 = range5.contains((double) (short) 100);
        java.lang.Class<?> wildcardClass15 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double8 = range7.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, (double) 10.0f, false);
        boolean boolean19 = range17.contains((double) 1L);
        double double21 = range17.constrain((double) (byte) 0);
        double double22 = range17.getLength();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean27 = range25.equals((java.lang.Object) 100L);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range33.intersects((double) (byte) 10, 10.0d);
        java.lang.String str37 = range33.toString();
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range25, range33);
        boolean boolean39 = range17.equals((java.lang.Object) range33);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range7, range17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.0d) + "'", double22 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[1.0,-899.0]" + "'", str37, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        double double14 = range5.constrain(1.0d);
        java.lang.String str15 = range5.toString();
        boolean boolean18 = range5.intersects((double) (-1.0f), 5.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,91.0]" + "'", str15, "Range[1.0,91.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-4.0d));
        boolean boolean10 = range7.intersects((-30636.0d), (-942.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range17.getLength();
        boolean boolean20 = range17.contains(37289.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range17, (double) 'a', (double) (byte) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 72.0d + "'", double18 == 72.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        double double17 = range14.constrain((-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 464.5d + "'", double17 == 464.5d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range37.intersects((double) (byte) 10, 10.0d);
        boolean boolean41 = range27.equals((java.lang.Object) boolean40);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range27, (double) (byte) 100, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range27, 100.0d, (-0.5d));
        java.lang.String str48 = range47.toString();
        double double49 = range47.getLowerBound();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range52, (double) 10.0f, false);
        boolean boolean60 = range58.contains((double) 1L);
        double double61 = range58.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range47, range58);
        boolean boolean63 = range5.equals((java.lang.Object) range58);
        org.jfree.data.Range range66 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double67 = range66.getLength();
        double double68 = range66.getLowerBound();
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range66, (-799.0d));
        java.lang.String str71 = range70.toString();
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range70, 0.0d);
        boolean boolean74 = range5.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[10999.0,44.5]" + "'", str48, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10999.0d + "'", double49 == 10999.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 11.0d + "'", double61 == 11.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-9.0d) + "'", double67 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Range[0.0,0.0]" + "'", str71, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 11.0d, false);
        double double18 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 494.0d + "'", double18 == 494.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-71.0d));
        java.lang.String str18 = range17.toString();
        java.lang.String str19 = range17.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,190.0]" + "'", str18, "Range[-71.0,190.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,190.0]" + "'", str19, "Range[-71.0,190.0]");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        java.lang.Class<?> wildcardClass28 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range16, (-109.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-71.0d), (-828.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) 100L);
        double double25 = range24.getLength();
        double double27 = range24.constrain(50.5d);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range12, range24);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range28);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double3 = range2.getUpperBound();
        double double4 = range2.getUpperBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 11.0d, true);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, 5.5d, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (double) 1.0f, false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        double double8 = range5.getUpperBound();
        double double10 = range5.constrain((double) (byte) 10);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-899.0d) + "'", double8 == (-899.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-899.0d) + "'", double10 == (-899.0d));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range18, (double) (-1.0f), (-109.0d));
        double double42 = range18.getCentralValue();
        java.lang.Class<?> wildcardClass43 = range18.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 44.5d + "'", double42 == 44.5d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        double double46 = range14.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 232.75d + "'", double46 == 232.75d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        double double7 = range4.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range4, (double) '4');
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 44.5d + "'", double7 == 44.5d);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range29, 10974.5d, false);
        boolean boolean51 = range48.intersects(15.5d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        double double26 = range24.constrain(1.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range24, (double) (byte) 100);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range24, (double) 'a');
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range24, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range24, 0.0d, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range12, range36);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        double double42 = range40.getLowerBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range37, range40);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range7, range40);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, 45.0d, 51.0d);
        java.lang.String str48 = range47.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-899.0d) + "'", double26 == (-899.0d));
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[415.0,-458.0]" + "'", str48, "Range[415.0,-458.0]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range6, (-1.0d), (double) (byte) 100);
        boolean boolean12 = range6.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range6, (-9.0d), (double) 100L);
        double double17 = range15.constrain(1.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, (double) (byte) 100);
        org.jfree.data.Range range22 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean23 = range15.equals((java.lang.Object) (-10.0d));
        boolean boolean25 = range15.contains((-9.0d));
        boolean boolean26 = range2.equals((java.lang.Object) range15);
        double double27 = range15.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-899.0d) + "'", double17 == (-899.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-899.0d) + "'", double27 == (-899.0d));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range29, 45.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-799.0d));
        boolean boolean20 = range17.intersects(168.0d, (-822.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range11, 17.5d);
        double double16 = range11.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range11, (double) 0);
        double double29 = range28.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 50.5d + "'", double29 == 50.5d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        double double46 = range29.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range7, 17.5d, 72.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range7, 32.0d);
        double double16 = range15.getLength();
        double double17 = range15.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-41.0d) + "'", double16 == (-41.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.5d + "'", double17 == 11.5d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.Range range2 = new org.jfree.data.Range(18630.0d, (-26442.5d));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        double double14 = range3.constrain((double) 100L);
        boolean boolean16 = range3.contains((double) ' ');
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0.0f, (double) '4');
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.0d + "'", double3 == 26.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 71.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range13, range22);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (-828.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range5, range27);
        boolean boolean31 = range28.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range32 = null;
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range28, range32);
        java.lang.Class<?> wildcardClass34 = range33.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        double double18 = range15.getLength();
        boolean boolean21 = range15.intersects((-899.0d), 90.0d);
        java.lang.String str22 = range15.toString();
        boolean boolean24 = range15.contains((-828.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range10, range15);
        double double26 = range10.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[0.0,90.0]" + "'", str22, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range4.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 37289.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        double double52 = range49.constrain((-942.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 199.0d + "'", double52 == 199.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        org.jfree.data.Range range22 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) (byte) -1);
        boolean boolean27 = range24.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range17, range24);
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range31, (-1.0d), (double) (byte) 100);
        boolean boolean37 = range34.intersects((double) (byte) 10, 10.0d);
        boolean boolean38 = range24.equals((java.lang.Object) boolean37);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range24, (double) (byte) 100, false);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range24, 100.0d, (-0.5d));
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range24, (double) (-1.0f), (-109.0d));
        boolean boolean48 = range5.equals((java.lang.Object) (-109.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        java.lang.String str64 = range48.toString();
        boolean boolean67 = range48.intersects((double) (short) -1, (double) 100.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Range[-71.0,-899.0]" + "'", str64, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getLowerBound();
        java.lang.Class<?> wildcardClass22 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        double double52 = range51.getUpperBound();
        java.lang.String str53 = range51.toString();
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range51, (double) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-393443.0d) + "'", double52 == (-393443.0d));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Range[-1751.0,-393443.0]" + "'", str53, "Range[-1751.0,-393443.0]");
        org.junit.Assert.assertNotNull(range55);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        double double15 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.5d + "'", double15 == 5.5d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean11 = range9.equals((java.lang.Object) 100L);
        double double12 = range9.getLength();
        boolean boolean13 = range2.equals((java.lang.Object) double12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        double double19 = range8.constrain((double) 0L);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.Range range2 = new org.jfree.data.Range(37289.0d, 0.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        double double7 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        org.jfree.data.Range range23 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (double) 10L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        double double27 = range23.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        double double11 = range7.getUpperBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range7, (-30636.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        org.jfree.data.Range range21 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double22 = range21.getUpperBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range16, range21);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (-1), false);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range23, range33);
        org.jfree.data.Range range37 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (double) 10L);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range34, range37);
        boolean boolean41 = range4.equals((java.lang.Object) range40);
        double double42 = range40.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.0d) + "'", double22 == (-9.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) 10L);
        double double20 = range17.getLowerBound();
        double double21 = range17.getCentralValue();
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range17, (-485.0d), (-449.0d));
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range24, range27);
        double double31 = range24.constrain((double) 'a');
        double double32 = range24.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range14, range24);
        double double34 = range14.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5d) + "'", double21 == (-0.5d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-449.0d) + "'", double31 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 484.0d + "'", double32 == 484.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 0.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean26 = range20.equals((java.lang.Object) range25);
        java.lang.Class<?> wildcardClass27 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        java.lang.Class<?> wildcardClass17 = range13.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (-109.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-71.0d), (-828.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (double) 100L);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range2, range16);
        double double21 = range16.constrain((double) 10);
        boolean boolean23 = range16.contains((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double32 = range31.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range31, 1.0d, true);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range38, (-10.0d));
        boolean boolean41 = range31.equals((java.lang.Object) range40);
        double double42 = range31.getLowerBound();
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        boolean boolean51 = range45.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range45, (-9.0d), (double) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range54, (double) 1);
        org.jfree.data.Range range59 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, (double) (byte) -1);
        boolean boolean64 = range61.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range65 = org.jfree.data.Range.combine(range54, range61);
        org.jfree.data.Range range68 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range68, (-1.0d), (double) (byte) 100);
        boolean boolean74 = range71.intersects((double) (byte) 10, 10.0d);
        boolean boolean75 = range61.equals((java.lang.Object) boolean74);
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range61, (double) (byte) 100, false);
        boolean boolean79 = range31.equals((java.lang.Object) range78);
        org.jfree.data.Range range82 = org.jfree.data.Range.shift(range31, 0.0d, false);
        org.jfree.data.Range range85 = org.jfree.data.Range.shift(range82, 72.0d, true);
        java.lang.Class<?> wildcardClass86 = range85.getClass();
        boolean boolean87 = range28.equals((java.lang.Object) range85);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9.0d) + "'", double32 == (-9.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        boolean boolean8 = range4.contains((double) (short) 10);
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-1.0d), (double) (byte) 100);
        boolean boolean18 = range12.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range12, (-9.0d), (double) 100L);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, 5.5d);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, 5.5d, (double) 10.0f);
        boolean boolean28 = range23.contains((double) (byte) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range23);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range4, range23);
        double double32 = range4.constrain((double) 0);
        boolean boolean35 = range4.intersects(5.0d, 5.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        double double26 = range24.constrain(1.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range24, (double) (byte) 100);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range24, (double) 'a');
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range24, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range24, 0.0d, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range12, range36);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        double double42 = range40.getLowerBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range37, range40);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range7, range40);
        boolean boolean46 = range44.contains((-449.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-899.0d) + "'", double26 == (-899.0d));
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range29, 10974.5d, false);
        double double49 = range48.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10984.5d + "'", double49 == 10984.5d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        double double18 = range15.getLength();
        boolean boolean21 = range15.intersects((-899.0d), 90.0d);
        java.lang.String str22 = range15.toString();
        boolean boolean24 = range15.contains((-828.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range10, range15);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range15, 50.5d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range30.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-9.0d), (double) 100L);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range39, (double) 1);
        boolean boolean44 = range41.intersects((-1.0d), 0.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range41, (-485.0d));
        boolean boolean47 = range15.equals((java.lang.Object) (-485.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[0.0,90.0]" + "'", str22, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 'a', true);
        org.jfree.data.Range range59 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, (double) 10L);
        org.jfree.data.Range range64 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range64, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range70 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range72 = org.jfree.data.Range.shift(range70, (-10.0d));
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range67, range70);
        org.jfree.data.Range range76 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range79 = org.jfree.data.Range.expand(range76, (-1.0d), (double) (byte) 100);
        boolean boolean82 = range76.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range85 = org.jfree.data.Range.expand(range76, (-9.0d), (double) 100L);
        double double87 = range85.constrain(1.0d);
        org.jfree.data.Range range88 = org.jfree.data.Range.combine(range73, range85);
        boolean boolean89 = range59.equals((java.lang.Object) range88);
        org.jfree.data.Range range90 = org.jfree.data.Range.combine(range56, range88);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-899.0d) + "'", double87 == (-899.0d));
        org.junit.Assert.assertNotNull(range88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(range90);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.5d), 61.0d);
        boolean boolean4 = range2.contains((-13733.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double50 = range48.constrain(72.0d);
        boolean boolean51 = range29.equals((java.lang.Object) 72.0d);
        java.lang.Class<?> wildcardClass52 = range29.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 11.0d + "'", double50 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range7.getLowerBound();
        java.lang.String str9 = range7.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[-9.0,1.0]" + "'", str9, "Range[-9.0,1.0]");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (byte) 0);
        double double13 = range8.getLength();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean18 = range16.equals((java.lang.Object) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range24.intersects((double) (byte) 10, 10.0d);
        java.lang.String str28 = range24.toString();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range16, range24);
        boolean boolean30 = range8.equals((java.lang.Object) range24);
        double double32 = range24.constrain((-30636.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[1.0,-899.0]" + "'", str28, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        double double4 = range2.getCentralValue();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (-4050.0d), false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5d) + "'", double4 == (-0.5d));
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        double double10 = range2.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) 1.0f);
        java.lang.Class<?> wildcardClass13 = range12.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        double double52 = range51.getUpperBound();
        java.lang.String str53 = range51.toString();
        java.lang.Class<?> wildcardClass54 = range51.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-393443.0d) + "'", double52 == (-393443.0d));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Range[-1751.0,-393443.0]" + "'", str53, "Range[-1751.0,-393443.0]");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range37, (-9.0d), (double) 100L);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 1);
        org.jfree.data.Range range51 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) (byte) -1);
        boolean boolean56 = range53.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        boolean boolean66 = range63.intersects((double) (byte) 10, 10.0d);
        boolean boolean67 = range53.equals((java.lang.Object) boolean66);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range53, (double) (byte) 100, false);
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range53, 100.0d, (-0.5d));
        double double74 = range53.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range53, 232.75d, false);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range11, range77);
        boolean boolean80 = range77.contains((double) 100);
        double double81 = range77.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-109.0d) + "'", double74 == (-109.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-331.75d) + "'", double81 == (-331.75d));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        double double16 = range11.getLength();
        double double18 = range11.constrain(100.0d);
        java.lang.String str19 = range11.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,90.0]" + "'", str19, "Range[0.0,90.0]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        double double19 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double19 = range17.constrain(17.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 17.5d + "'", double19 == 17.5d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 172.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0L);
        double double5 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        org.jfree.data.Range range23 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (double) 10L);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range23, 11045.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        double double15 = range11.constrain((double) 'a');
        double double16 = range11.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 51.0d + "'", double15 == 51.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 62.0d + "'", double16 == 62.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 10L);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range15, 44.5d, (-799.0d));
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range23, (double) (short) 100);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range15, range23);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range15, 743473.0d);
        double double31 = range15.constrain((-35.0d));
        boolean boolean32 = range11.equals((java.lang.Object) (-35.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-942.0d) + "'", double12 == (-942.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.Range range2 = new org.jfree.data.Range(37189.0d, 71.0d);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains(110.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18630.0d + "'", double3 == 18630.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (-10.0d));
        boolean boolean18 = range8.equals((java.lang.Object) range17);
        double double19 = range17.getCentralValue();
        boolean boolean20 = range2.equals((java.lang.Object) double19);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        double double23 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        double double9 = range4.getCentralValue();
        java.lang.String str10 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 45.0d + "'", double9 == 45.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,90.0]" + "'", str10, "Range[0.0,90.0]");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        java.lang.Class<?> wildcardClass46 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '#');
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        java.lang.String str15 = range14.toString();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, 1.0d, true);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (-10.0d));
        boolean boolean28 = range18.equals((java.lang.Object) range27);
        double double29 = range27.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range14, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 45.0d, (double) '#');
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range45, (double) (byte) 100);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range45, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range33, range51);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double56 = range55.getCentralValue();
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 100);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range55, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) 10L);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range33, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range4, range67);
        double double69 = range67.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,-899.0]" + "'", str15, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.0d + "'", double29 == 45.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.5d) + "'", double56 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[10.0,100.0]" + "'", str66, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-405.0d) + "'", double69 == (-405.0d));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        java.lang.String str27 = range11.toString();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (double) 'a');
        double double34 = range30.getLowerBound();
        java.lang.String str35 = range30.toString();
        boolean boolean36 = range11.equals((java.lang.Object) str35);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[1.0,100.0]" + "'", str27, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[10.0,1.0]" + "'", str35, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getUpperBound();
        java.lang.String str10 = range2.toString();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 5.0d);
        double double13 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean15 = range11.equals((java.lang.Object) '4');
        java.lang.String str16 = range11.toString();
        double double17 = range11.getLowerBound();
        boolean boolean19 = range11.contains(494.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range11, (double) (byte) 10);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-71.0,-899.0]" + "'", str16, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-71.0d) + "'", double17 == (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) (short) 100);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range7, 17.5d, 72.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range7, 32.0d);
        double double16 = range15.getLength();
        double double17 = range15.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-41.0d) + "'", double16 == (-41.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range22, (double) 100);
        double double38 = range22.getUpperBound();
        boolean boolean40 = range22.contains((-893.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-10.0d) + "'", double38 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range5, 17.5d, (double) 1);
        double double12 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range2.getLowerBound();
        double double11 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean9 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 99.0d, 44.5d);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) (byte) -1);
        double double21 = range18.getLowerBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range18, 17.5d);
        boolean boolean25 = range18.contains(72.0d);
        boolean boolean26 = range2.equals((java.lang.Object) range18);
        double double28 = range2.constrain(4523.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 72.0d, (double) 10.0f);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (-10.0d));
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range14, range17);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range14, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, (-828.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range2, range28);
        double double30 = range2.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        double double22 = range20.constrain(1.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range4, range20);
        double double26 = range4.getUpperBound();
        boolean boolean28 = range4.contains(0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 90.0d + "'", double26 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 'a', true);
        double double57 = range53.getUpperBound();
        boolean boolean60 = range53.intersects(17.5d, 55.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range53, (double) 0, false);
        double double64 = range63.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.Range range2 = new org.jfree.data.Range(104.5d, 0.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        double double35 = range32.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range45, 11871.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (-9.0d));
        double double4 = range2.constrain((double) (short) 10);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 5.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 72.0d, (double) 10.0f);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) 100, false);
        java.lang.String str12 = range11.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[0.0,100.0]" + "'", str12, "Range[0.0,100.0]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 107.25d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, 5.0d, false);
        double double19 = range15.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-846.375d) + "'", double19 == (-846.375d));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range6.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-101.0d) + "'", double7 == (-101.0d));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, 6553.0d);
        boolean boolean58 = range53.intersects(494.0d, 37289.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range53, (-893.5d), true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(range61);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        double double14 = range12.constrain((-900.0d));
        boolean boolean17 = range12.intersects((double) (byte) 1, 37189.0d);
        java.lang.String str18 = range12.toString();
        double double19 = range12.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[99.0,-10.0]" + "'", str18, "Range[99.0,-10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-109.0d) + "'", double19 == (-109.0d));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range17, (-0.5d));
        double double22 = range17.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-71.0d) + "'", double22 == (-71.0d));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range37, (-9.0d), (double) 100L);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 1);
        org.jfree.data.Range range51 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) (byte) -1);
        boolean boolean56 = range53.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        boolean boolean66 = range63.intersects((double) (byte) 10, 10.0d);
        boolean boolean67 = range53.equals((java.lang.Object) boolean66);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range53, (double) (byte) 100, false);
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range53, 100.0d, (-0.5d));
        double double74 = range53.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range53, 232.75d, false);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range11, range77);
        boolean boolean81 = range77.intersects(5548.0d, 51.0d);
        java.lang.Class<?> wildcardClass82 = range77.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-109.0d) + "'", double74 == (-109.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (-109.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-71.0d), (-828.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (double) 100L);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range2, (-799.0d));
        java.lang.Class<?> wildcardClass22 = range21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 5.5d);
        double double7 = range6.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-828.0d));
        boolean boolean21 = range17.contains(20.0d);
        double double22 = range17.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-109.0d) + "'", double10 == (-109.0d));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        boolean boolean23 = range17.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range17, (-9.0d), (double) 100L);
        double double28 = range26.constrain(1.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range26, (double) (byte) 100);
        boolean boolean33 = range26.intersects(45.0d, (double) (short) 100);
        boolean boolean34 = range14.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-899.0d) + "'", double28 == (-899.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        double double54 = range38.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5521.75d + "'", double54 == 5521.75d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-71.0d));
        java.lang.String str18 = range17.toString();
        double double19 = range17.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,190.0]" + "'", str18, "Range[-71.0,190.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 190.0d + "'", double19 == 190.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        boolean boolean41 = range38.intersects((double) (byte) 0, 91.0d);
        org.jfree.data.Range range44 = new org.jfree.data.Range(20.0d, (-828.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range44, (double) (-1.0f), false);
        boolean boolean48 = range38.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) 1L);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        org.jfree.data.Range range22 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) (byte) -1);
        boolean boolean27 = range24.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range17, range24);
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range31, (-1.0d), (double) (byte) 100);
        boolean boolean37 = range34.intersects((double) (byte) 10, 10.0d);
        boolean boolean38 = range24.equals((java.lang.Object) boolean37);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range24, (double) (byte) 100, false);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range24, 100.0d, (-0.5d));
        java.lang.String str45 = range44.toString();
        double double46 = range44.getLowerBound();
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, (double) 10.0f, false);
        boolean boolean57 = range55.contains((double) 1L);
        double double58 = range55.getUpperBound();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range44, range55);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range55, 32.0d);
        boolean boolean62 = range2.equals((java.lang.Object) range55);
        double double64 = range55.constrain((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Range[10999.0,44.5]" + "'", str45, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10999.0d + "'", double46 == 10999.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 11.0d + "'", double58 == 11.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 20.0d + "'", double64 == 20.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range8, (double) (-1.0f));
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range8, 33.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range8, (double) 100);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLength();
        double double6 = range2.constrain(4488.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 107.25d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, 5.0d, false);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range15, 99.0d);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        double double25 = range23.getLowerBound();
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range23, 10.0d, false);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range28, (-10.0d), false);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range20, range28);
        double double33 = range32.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1800.0d) + "'", double33 == (-1800.0d));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        boolean boolean19 = range17.contains((-13662.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range17, (double) (byte) 10);
        double double23 = range21.constrain((double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range21, 61.0d, 0.0d);
        java.lang.Class<?> wildcardClass27 = range21.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        boolean boolean30 = range26.contains((-799.0d));
        double double31 = range26.getCentralValue();
        org.jfree.data.Range range34 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, (double) (byte) -1);
        double double38 = range36.constrain((double) 0L);
        boolean boolean40 = range36.contains(168.0d);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range43, (-109.0d));
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range55, (-10.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range52, range55);
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range64 = org.jfree.data.Range.expand(range61, (-1.0d), (double) (byte) 100);
        boolean boolean67 = range61.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range61, (-9.0d), (double) 100L);
        double double72 = range70.constrain(1.0d);
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range58, range70);
        boolean boolean74 = range46.equals((java.lang.Object) range58);
        boolean boolean76 = range58.contains((-485.0d));
        boolean boolean77 = range36.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range79 = org.jfree.data.Range.expandToInclude(range36, (double) 100L);
        double double80 = range36.getCentralValue();
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range26, range36);
        org.jfree.data.Range range84 = org.jfree.data.Range.expand(range36, (double) (short) -1, (-893.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 14.5d + "'", double31 == 14.5d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-10.0d) + "'", double38 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9.0d) + "'", double44 == (-9.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-899.0d) + "'", double72 == (-899.0d));
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 44.5d + "'", double80 == 44.5d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range84);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        java.lang.Class<?> wildcardClass9 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (double) (short) 1);
        java.lang.Class<?> wildcardClass38 = range35.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10989.0d, 91.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 32.0d);
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean20 = range11.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-485.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-30636.0d), true);
        double double27 = range25.constrain(2827.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-31535.0d) + "'", double27 == (-31535.0d));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        boolean boolean20 = range16.contains(97.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-13662.0d) + "'", double17 == (-13662.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2342.5d) + "'", double18 == (-2342.5d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, (double) '#');
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        double double22 = range20.getLowerBound();
        double double23 = range20.getUpperBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range20, 37289.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-71.0d) + "'", double22 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 107.25d, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range10, 6553.0d, 0.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range10, (-942.0d));
        double double19 = range10.getUpperBound();
        java.lang.String str20 = range10.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[10.0,1.0]" + "'", str20, "Range[10.0,1.0]");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        double double10 = range4.constrain(484.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean20 = range11.intersects(72.0d, 4488.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 232.75d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        boolean boolean53 = range51.contains((double) (short) 100);
        java.lang.Class<?> wildcardClass54 = range51.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 11.0d);
        double double4 = range2.constrain((-13662.0d));
        java.lang.String str5 = range2.toString();
        boolean boolean8 = range2.intersects((double) 10.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[10.0,11.0]" + "'", str5, "Range[10.0,11.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getUpperBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, (double) 1L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        boolean boolean32 = range26.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range26, (-9.0d), (double) 100L);
        double double37 = range35.constrain(1.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range35, (double) (byte) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range35, (double) 'a');
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range35, (double) 1.0f, false);
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, 5.5d);
        boolean boolean54 = range50.equals((java.lang.Object) 171.0d);
        boolean boolean57 = range50.intersects((-893.5d), (double) 100L);
        double double59 = range50.constrain(1.0d);
        boolean boolean60 = range44.equals((java.lang.Object) range50);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range44, (-9.0d));
        java.lang.String str63 = range44.toString();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range11, range44);
        double double65 = range44.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-899.0d) + "'", double21 == (-899.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-899.0d) + "'", double37 == (-899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[-70.0,-898.0]" + "'", str63, "Range[-70.0,-898.0]");
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-828.0d) + "'", double65 == (-828.0d));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-1.0d), (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 0.0d, true);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range26);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        double double32 = range30.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range27, range30);
        java.lang.String str34 = range33.toString();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Range[-71.0,35.0]" + "'", str34, "Range[-71.0,35.0]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range9, (-393443.0d));
        double double14 = range9.constrain((-9.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-405.0d), false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 0.5d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        double double9 = range2.getCentralValue();
        boolean boolean11 = range2.contains(11871.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 55.0d + "'", double9 == 55.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects(100.0d, (double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (-799.0d));
        java.lang.Class<?> wildcardClass21 = range20.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 11044.5d, (-10.0d));
        double double16 = range15.getUpperBound();
        java.lang.Class<?> wildcardClass17 = range15.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 21.0d, 2.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        double double14 = range12.constrain((-900.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range12, 5.5d);
        boolean boolean18 = range12.contains((-170.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 11044.5d, (-10.0d));
        double double16 = range15.getUpperBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range15, (double) 10L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (-1100799.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 100);
        double double5 = range4.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range4, (-71.0d));
        java.lang.String str8 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.0d + "'", double5 == 110.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[110.0,110.0]" + "'", str8, "Range[110.0,110.0]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getLowerBound();
        double double23 = range11.constrain((-101.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-899.0d) + "'", double23 == (-899.0d));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range7.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range7, (-9.0d), (double) 100L);
        double double18 = range16.constrain(1.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range16, (double) 'a');
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-1.0d), (-9.0d));
        boolean boolean26 = range2.equals((java.lang.Object) range16);
        java.lang.String str27 = range2.toString();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) (byte) -1);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, (-10.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range41, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, (-10.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range41, range50);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, (-828.0d));
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range33, range55);
        boolean boolean59 = range56.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range60 = null;
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range56, range60);
        boolean boolean62 = range2.equals((java.lang.Object) range56);
        double double64 = range56.constrain(15.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[0.0,0.0]" + "'", str27, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 15.5d + "'", double64 == 15.5d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range20, (-2342.5d), true);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range20, 51.0d, true);
        java.lang.String str70 = range20.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Range[-70.0,-898.0]" + "'", str70, "Range[-70.0,-898.0]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range22, (double) 100);
        double double38 = range37.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range30.intersects((double) (byte) -1, (double) (short) -1);
        double double37 = range30.getCentralValue();
        double double38 = range30.getLength();
        double double39 = range30.getLength();
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range25, range30);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        boolean boolean49 = range43.intersects((double) (byte) -1, (double) (short) -1);
        double double50 = range43.getCentralValue();
        double double51 = range43.getLength();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range43, (double) 1.0f);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range43, 5.0d);
        boolean boolean56 = range40.equals((java.lang.Object) range43);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.5d + "'", double37 == 5.5d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9.0d) + "'", double38 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9.0d) + "'", double39 == (-9.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5.5d + "'", double50 == 5.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        boolean boolean16 = range2.intersects(16.5d, 5549.5d);
        java.lang.String str17 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[10.0,1.0]" + "'", str17, "Range[10.0,1.0]");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range49, 1.0d, (double) 100);
        java.lang.Class<?> wildcardClass57 = range56.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        java.lang.Class<?> wildcardClass21 = range20.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 17.5d, false);
        java.lang.String str13 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,1.0]" + "'", str13, "Range[10.0,1.0]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range20, (-2342.5d), true);
        double double67 = range20.getUpperBound();
        double double69 = range20.constrain(11871.0d);
        double double71 = range20.constrain(484.0d);
        org.jfree.data.Range range74 = new org.jfree.data.Range((-109.0d), (-385.0d));
        boolean boolean75 = range20.equals((java.lang.Object) (-385.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-898.0d) + "'", double67 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-898.0d) + "'", double69 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-898.0d) + "'", double71 == (-898.0d));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        double double20 = range17.getUpperBound();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        double double46 = range44.constrain(1.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range32, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.0d), (double) (byte) 100);
        boolean boolean59 = range53.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range53, (-9.0d), (double) 100L);
        double double64 = range62.constrain(1.0d);
        boolean boolean65 = range50.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range47, range50);
        boolean boolean67 = range17.equals((java.lang.Object) range66);
        double double68 = range66.getUpperBound();
        java.lang.String str69 = range66.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-899.0d) + "'", double64 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Range[-71.0,100.0]" + "'", str69, "Range[-71.0,100.0]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        double double22 = range14.constrain(90.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        double double41 = range34.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean45 = range34.equals((java.lang.Object) 10.0f);
        double double46 = range34.getUpperBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range34, 0.0d);
        java.lang.String str49 = range34.toString();
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range14, range34);
        double double51 = range50.getLength();
        boolean boolean54 = range50.intersects((double) 100.0f, 168.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-828.0d) + "'", double41 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[-71.0,-899.0]" + "'", str49, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 171.0d + "'", double51 == 171.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        double double22 = range14.constrain(90.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        double double41 = range34.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean45 = range34.equals((java.lang.Object) 10.0f);
        double double46 = range34.getUpperBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range34, 0.0d);
        java.lang.String str49 = range34.toString();
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range14, range34);
        boolean boolean53 = range34.intersects(50.5d, (-942.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-828.0d) + "'", double41 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[-71.0,-899.0]" + "'", str49, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, 1.0d, (double) ' ');
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range28, (-899.0d));
        double double34 = range33.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-1.0d), (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 0.0d, true);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range26);
        double double28 = range2.getCentralValue();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range2, (double) (short) 10, (-65.5d));
        double double32 = range31.getCentralValue();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 67.0d + "'", double28 == 67.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2483.0d + "'", double32 == 2483.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double4 = range2.constrain(72.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1L, 55.0d);
        double double8 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        double double52 = range51.getUpperBound();
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double56 = range55.getLength();
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range55, (-109.0d));
        boolean boolean60 = range55.contains(1.0d);
        boolean boolean62 = range55.contains((double) (byte) 0);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range55, 99.0d, 44.5d);
        org.jfree.data.Range range68 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range68, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range73 = org.jfree.data.Range.expandToInclude(range71, (double) (byte) -1);
        double double74 = range71.getLowerBound();
        org.jfree.data.Range range76 = org.jfree.data.Range.expandToInclude(range71, 17.5d);
        boolean boolean78 = range71.contains(72.0d);
        boolean boolean79 = range55.equals((java.lang.Object) range71);
        boolean boolean80 = range51.equals((java.lang.Object) range71);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-393443.0d) + "'", double52 == (-393443.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9.0d) + "'", double56 == (-9.0d));
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) 10L);
        double double20 = range17.getLowerBound();
        double double21 = range17.getCentralValue();
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range17, (-485.0d), (-449.0d));
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range24, range27);
        double double31 = range24.constrain((double) 'a');
        double double32 = range24.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range14, range24);
        double double34 = range33.getLength();
        java.lang.String str35 = range33.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5d) + "'", double21 == (-0.5d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-449.0d) + "'", double31 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 484.0d + "'", double32 == 484.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 91.0d + "'", double34 == 91.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[0.0,91.0]" + "'", str35, "Range[0.0,91.0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        boolean boolean8 = range2.intersects(72.0d, 100.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        boolean boolean18 = range13.contains((double) (byte) -1);
        double double19 = range13.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-828.0d) + "'", double19 == (-828.0d));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-1.0d), (double) (byte) 100);
        boolean boolean15 = range9.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range9, (-9.0d), (double) 100L);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 1);
        boolean boolean23 = range18.intersects((double) 100.0f, (double) (byte) 10);
        boolean boolean24 = range2.equals((java.lang.Object) 100.0f);
        double double25 = range2.getLowerBound();
        double double26 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        double double11 = range4.getLength();
        double double12 = range4.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 45.0d + "'", double12 == 45.0d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        boolean boolean38 = range35.intersects(72.0d, (double) 100.0f);
        double double39 = range35.getLength();
        java.lang.Class<?> wildcardClass40 = range35.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 72.0d + "'", double39 == 72.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        boolean boolean10 = range8.contains((-30636.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLength();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getUpperBound();
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range24, 0.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range24, (-10.0d), true);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, 45.0d, (-9.0d));
        double double48 = range47.getUpperBound();
        double double49 = range47.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range32, range47);
        org.jfree.data.Range range51 = org.jfree.data.Range.combine(range11, range32);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-899.0d) + "'", double21 == (-899.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 6553.0d + "'", double48 == 6553.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-30636.0d) + "'", double49 == (-30636.0d));
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range51);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range20, (-2342.5d), true);
        org.jfree.data.Range range69 = org.jfree.data.Range.expand(range66, 72.0d, 10989.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range69);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        double double42 = range38.constrain((-449.0d));
        java.lang.Class<?> wildcardClass43 = range38.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10999.0d + "'", double42 == 10999.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1, (double) 1L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        double double36 = range33.constrain((double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range33, 32.0d, 61.0d);
        double double40 = range39.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range39, (-26442.5d), 11044.5d);
        org.jfree.data.Range range46 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean49 = range46.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range52, (-109.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range55, (-71.0d), (-828.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) 100L);
        double double61 = range60.getLength();
        double double62 = range60.getCentralValue();
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range46, range60);
        boolean boolean64 = range39.equals((java.lang.Object) range60);
        boolean boolean66 = range60.contains(172.0d);
        org.jfree.data.Range range69 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range72 = org.jfree.data.Range.expand(range69, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range72, 5.5d);
        boolean boolean76 = range72.equals((java.lang.Object) 171.0d);
        double double77 = range72.getLowerBound();
        double double78 = range72.getLength();
        boolean boolean79 = range60.equals((java.lang.Object) double78);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 90.0d + "'", double78 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, 0.0d);
        double double12 = range11.getLowerBound();
        double double13 = range11.getLowerBound();
        boolean boolean14 = range7.equals((java.lang.Object) double13);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range7, 107.25d, (-799.0d));
        boolean boolean18 = range2.equals((java.lang.Object) range7);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, 0.0d);
        double double11 = range10.getLowerBound();
        boolean boolean14 = range10.intersects((-9.0d), (double) ' ');
        boolean boolean16 = range10.contains((double) (short) 0);
        boolean boolean17 = range5.equals((java.lang.Object) boolean16);
        double double18 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 91.0d + "'", double18 == 91.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        java.lang.String str19 = range11.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,90.0]" + "'", str19, "Range[0.0,90.0]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 107.25d, (double) 1);
        double double14 = range10.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        java.lang.Class<?> wildcardClass14 = range13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        java.lang.String str15 = range14.toString();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, 1.0d, true);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (-10.0d));
        boolean boolean28 = range18.equals((java.lang.Object) range27);
        double double29 = range27.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range14, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 45.0d, (double) '#');
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range45, (double) (byte) 100);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range45, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range33, range51);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double56 = range55.getCentralValue();
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 100);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range55, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) 10L);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range33, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range4, range67);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range4, 2827.0d, (-37118.0d));
        boolean boolean74 = range71.intersects((-27.75d), 2483.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,-899.0]" + "'", str15, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.0d + "'", double29 == 45.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.5d) + "'", double56 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[10.0,100.0]" + "'", str66, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (-818.0d), 44.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        boolean boolean13 = range11.contains(0.0d);
        double double14 = range11.getUpperBound();
        double double15 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9929.0d) + "'", double14 == (-9929.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.0d + "'", double15 == 99.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        double double27 = range11.getCentralValue();
        double double28 = range11.getUpperBound();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range11, 0.0d, 0.0d);
        boolean boolean34 = range31.intersects((-65.5d), (double) '4');
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 50.5d + "'", double27 == 50.5d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 11.0d, false);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, 10984.5d, true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (short) 1, true);
        boolean boolean29 = range23.intersects((double) '4', 67.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        double double10 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, (double) 0L);
        boolean boolean23 = range20.intersects((-1.0d), (-13662.0d));
        java.lang.Class<?> wildcardClass24 = range20.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        boolean boolean41 = range38.intersects((-484.0d), 50.5d);
        double double42 = range38.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10999.0d + "'", double42 == 10999.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getUpperBound();
        boolean boolean19 = range11.contains(97.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-899.0d) + "'", double17 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getLength();
        double double10 = range5.constrain(199.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-900.0d) + "'", double8 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-899.0d) + "'", double10 == (-899.0d));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean9 = range2.contains((double) (byte) 0);
        boolean boolean12 = range2.intersects((double) (short) 1, 11.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range6, (-13662.0d));
        double double9 = range8.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        double double11 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        double double13 = range8.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range8, 10989.0d);
        double double16 = range8.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        java.lang.String str32 = range21.toString();
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range21, 67.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[0.0,90.0]" + "'", str32, "Range[0.0,90.0]");
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        java.lang.Class<?> wildcardClass12 = range11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d), true);
        double double11 = range10.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        boolean boolean28 = range25.intersects(51.0d, 0.0d);
        boolean boolean31 = range25.intersects((-30636.0d), (double) 10L);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        double double49 = range42.getCentralValue();
        java.lang.Class<?> wildcardClass50 = range42.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 13.0d + "'", double49 == 13.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        double double18 = range8.getCentralValue();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range8, (double) 10L);
        double double21 = range8.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.5d + "'", double18 == 15.5d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 11.0d + "'", double21 == 11.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, 32.0d);
        boolean boolean58 = range55.intersects(6553.0d, (-35.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        double double12 = range10.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, 10.0d, false);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        boolean boolean19 = range16.intersects(0.0d, (-449.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range16, 71.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range20, 11044.5d, true);
        double double24 = range20.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-484.0d) + "'", double24 == (-484.0d));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        double double3 = range2.getLength();
        double double4 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-170.0d) + "'", double3 == (-170.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 86.0d + "'", double4 == 86.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 10L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range29, range32);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range38.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range38, (-9.0d), (double) 100L);
        double double49 = range47.constrain(1.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range35, range47);
        boolean boolean51 = range21.equals((java.lang.Object) range50);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range11, range21);
        boolean boolean54 = range21.contains(46.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-899.0d) + "'", double49 == (-899.0d));
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects(100.0d, (double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (-799.0d));
        boolean boolean22 = range20.contains((double) 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-799.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double21 = range20.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range15, range20);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range15, 44.5d);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 0);
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double34 = range33.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (double) 'a');
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double40 = range39.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range39, 1.0d, true);
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range46, (-10.0d));
        boolean boolean49 = range39.equals((java.lang.Object) range48);
        double double50 = range48.getCentralValue();
        boolean boolean51 = range33.equals((java.lang.Object) double50);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range27, range33);
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double56 = range55.getLength();
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range55, 1.0d, true);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range62, (-10.0d));
        boolean boolean65 = range55.equals((java.lang.Object) range64);
        double double66 = range64.getUpperBound();
        boolean boolean68 = range64.contains((double) (-1.0f));
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range64, 20.0d, false);
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range64, (-828.0d), (-933.0d));
        boolean boolean75 = range27.equals((java.lang.Object) range74);
        boolean boolean76 = range15.equals((java.lang.Object) boolean75);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-9.0d) + "'", double34 == (-9.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-9.0d) + "'", double40 == (-9.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 45.0d + "'", double50 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9.0d) + "'", double56 == (-9.0d));
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 90.0d + "'", double66 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-35.0d), false);
        java.lang.Class<?> wildcardClass14 = range13.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        boolean boolean6 = range2.contains((-449.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, 232.75d);
        double double10 = range2.constrain((double) 100.0f);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10999.0d + "'", double10 == 10999.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100L, (double) 0.0f);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        boolean boolean10 = range5.intersects((double) '4', (double) 'a');
        double double11 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 46.0d + "'", double11 == 46.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        double double27 = range11.getCentralValue();
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range11, (-9173.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 50.5d + "'", double27 == 50.5d);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        boolean boolean23 = range20.contains((-828.0d));
        double double24 = range20.getLowerBound();
        double double25 = range20.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-71.0d) + "'", double24 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-35.5d) + "'", double25 == (-35.5d));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (double) (-1L));
        boolean boolean5 = range2.intersects((double) 0L, (double) 1);
        double double7 = range2.constrain((double) 1L);
        boolean boolean9 = range2.contains(464.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, 104.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range13, 4488.5d, true);
        double double21 = range13.constrain(11045.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-893.5d) + "'", double21 == (-893.5d));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        double double19 = range11.constrain(5.5d);
        double double20 = range11.getLowerBound();
        double double21 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.5d + "'", double19 == 5.5d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 45.0d + "'", double21 == 45.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) 0);
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 15.5d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (-10.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range21, range24);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range21, range30);
        double double34 = range30.getLength();
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range30, (double) 100.0f, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range13, range30);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 90.0d + "'", double34 == 90.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, (double) (short) -1, false);
        boolean boolean28 = range10.equals((java.lang.Object) range27);
        double double30 = range10.constrain((-405.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (-109.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-71.0d), (-828.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (double) 100L);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range2, (-799.0d));
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range24, 90.0d, false);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range24, (double) 100.0f, (double) 100.0f);
        java.lang.String str31 = range24.toString();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range21, range24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[10.0,100.0]" + "'", str31, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.Range range2 = new org.jfree.data.Range(107.25d, (double) (short) 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (-109.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-71.0d), (-828.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 100L);
        double double18 = range17.getLength();
        double double20 = range17.constrain(50.5d);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range17);
        double double22 = range17.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range2, range17);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, 199.0d, (-26442.5d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[10.0,100.0]" + "'", str6, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range15, 1.0d, true);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range9, range19);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range9, (double) 10);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 45.0d);
        boolean boolean15 = range11.contains(17.5d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        double double20 = range18.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, (-799.0d));
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 1);
        boolean boolean39 = range34.intersects((double) 100.0f, (double) (byte) 10);
        boolean boolean40 = range18.equals((java.lang.Object) 100.0f);
        boolean boolean41 = range11.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-65.5d), (-9.0d));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        double double3 = range2.getUpperBound();
        double double4 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        double double27 = range23.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-485.0d) + "'", double27 == (-485.0d));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getCentralValue();
        double double13 = range8.constrain((double) 'a');
        java.lang.String str14 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.5d + "'", double11 == 15.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[20.0,11.0]" + "'", str14, "Range[20.0,11.0]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d), true);
        boolean boolean13 = range2.intersects(0.0d, (-41.0d));
        double double14 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9138.5d), (-449.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-170.0d));
        double double6 = range2.constrain((-846.375d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-846.375d) + "'", double6 == (-846.375d));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        double double7 = range4.getCentralValue();
        double double8 = range4.getLowerBound();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (-10.0d));
        boolean boolean21 = range11.equals((java.lang.Object) range20);
        double double22 = range20.getUpperBound();
        boolean boolean24 = range20.contains((double) (-1.0f));
        boolean boolean25 = range4.equals((java.lang.Object) boolean24);
        double double27 = range4.constrain(0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 44.5d + "'", double7 == 44.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-10.0d) + "'", double27 == (-10.0d));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range11.getLength();
        boolean boolean17 = range11.contains((double) (-1.0f));
        double double18 = range11.getLowerBound();
        double double19 = range11.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-828.0d) + "'", double15 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-71.0d) + "'", double18 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-899.0d) + "'", double19 == (-899.0d));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        double double15 = range4.constrain((double) (-1.0f));
        boolean boolean18 = range4.intersects(7.75d, 199.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str3 = range2.toString();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (-109.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-71.0d), (-828.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) 100L);
        double double15 = range14.getLength();
        double double17 = range14.constrain(50.5d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range2, range14);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (-449.0d));
        double double21 = range18.getLength();
        double double23 = range18.constrain((double) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.0d + "'", double21 == 90.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        double double11 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range4, (double) 100L);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range4, 5548.0d, 104.5d);
        double double51 = range50.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 296715.25d + "'", double51 == 296715.25d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-0.5d));
        org.jfree.data.Range range3 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.combine(range2, range3);
        java.lang.Class<?> wildcardClass5 = range4.getClass();
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (-449.0d), true);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        boolean boolean13 = range2.equals((java.lang.Object) 10999.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range11, (double) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range11, 11871.0d, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        double double28 = range11.getCentralValue();
        double double29 = range11.getLength();
        boolean boolean32 = range11.intersects(168.0d, (double) 1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-485.0d) + "'", double28 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-828.0d) + "'", double29 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        java.lang.String str7 = range2.toString();
        double double9 = range2.constrain((-170.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        java.lang.String str12 = range11.toString();
        boolean boolean14 = range11.contains(17.5d);
        double double16 = range11.constrain(5.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[1.0,100.0]" + "'", str12, "Range[1.0,100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.5d + "'", double16 == 5.5d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        java.lang.String str22 = range20.toString();
        double double23 = range20.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range20, (double) (byte) 1);
        boolean boolean27 = range25.contains(15.5d);
        double double28 = range25.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,0.0]" + "'", str22, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 71.0d + "'", double23 == 71.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean15 = range11.equals((java.lang.Object) '4');
        double double16 = range11.getLowerBound();
        java.lang.Class<?> wildcardClass17 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-71.0d) + "'", double16 == (-71.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range16, (-109.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-71.0d), (-828.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) 100L);
        double double25 = range24.getLength();
        double double27 = range24.constrain(50.5d);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range12, range24);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range28);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range28, 190.0d, (-3240.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 17.5d, false);
        double double13 = range12.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range2, 90.0d, (-1.5d));
        boolean boolean15 = range2.equals((java.lang.Object) (-9173.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-0.5d));
        org.jfree.data.Range range3 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.combine(range2, range3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range7 = org.jfree.data.Range.expand(range3, (-1.539756E7d), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (-10.0d));
        boolean boolean18 = range8.equals((java.lang.Object) range17);
        double double19 = range17.getCentralValue();
        boolean boolean20 = range2.equals((java.lang.Object) double19);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, 6108.5d, true);
        double double26 = range25.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 6109.5d + "'", double26 == 6109.5d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range42, 18595.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.Range range2 = new org.jfree.data.Range(101.0d, 17.5d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-4.0d), 15.5d);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range38, 6553.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range38, 97.0d, (double) (short) 0);
        boolean boolean48 = range46.contains((double) (byte) 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        double double14 = range5.constrain(55.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 55.0d + "'", double14 == 55.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        org.jfree.data.Range range19 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double20 = range19.getUpperBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range14, range19);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range14, (-933.0d));
        double double24 = range23.getLength();
        double double25 = range23.getUpperBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range4, range23);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-942.0d) + "'", double24 == (-942.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-942.0d) + "'", double25 == (-942.0d));
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double6 = range5.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range5, 1.0d, true);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (-10.0d));
        boolean boolean15 = range5.equals((java.lang.Object) range14);
        double double16 = range5.getLowerBound();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range19, (-9.0d), (double) 100L);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range28, (double) 1);
        org.jfree.data.Range range33 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range33, (double) (byte) -1);
        boolean boolean38 = range35.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range28, range35);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (-1.0d), (double) (byte) 100);
        boolean boolean48 = range45.intersects((double) (byte) 10, 10.0d);
        boolean boolean49 = range35.equals((java.lang.Object) boolean48);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range35, (double) (byte) 100, false);
        boolean boolean53 = range5.equals((java.lang.Object) range52);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range5, 0.0d, false);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range56, (double) 'a', true);
        boolean boolean62 = range56.intersects((-818.0d), 21.0d);
        org.jfree.data.Range range65 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range65, (double) (byte) -1);
        boolean boolean70 = range67.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range72 = org.jfree.data.Range.shift(range67, (double) 0.0f);
        boolean boolean74 = range72.contains(15.5d);
        boolean boolean75 = range56.equals((java.lang.Object) boolean74);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range56, (double) (byte) 1);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range2, range77);
        boolean boolean81 = range78.intersects(464.5d, (-101.0d));
        double double82 = range78.getLength();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-9.0d) + "'", double82 == (-9.0d));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        java.lang.Class<?> wildcardClass27 = range23.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range4, (-65.5d), 62.0d);
        double double13 = range12.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 272.5d + "'", double13 == 272.5d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 71.0d, (double) 10);
        double double24 = range20.getCentralValue();
        org.jfree.data.Range range27 = new org.jfree.data.Range((-26442.5d), 4488.5d);
        boolean boolean28 = range20.equals((java.lang.Object) 4488.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2827.0d + "'", double24 == 2827.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range37.intersects((double) (byte) 10, 10.0d);
        boolean boolean41 = range27.equals((java.lang.Object) boolean40);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range27, (double) (byte) 100, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range27, 100.0d, (-0.5d));
        java.lang.String str48 = range47.toString();
        double double49 = range47.getLowerBound();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range52, (double) 10.0f, false);
        boolean boolean60 = range58.contains((double) 1L);
        double double61 = range58.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range47, range58);
        boolean boolean63 = range5.equals((java.lang.Object) range58);
        double double64 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[10999.0,44.5]" + "'", str48, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10999.0d + "'", double49 == 10999.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 11.0d + "'", double61 == 11.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-900.0d) + "'", double64 == (-900.0d));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        boolean boolean28 = range25.intersects(51.0d, 0.0d);
        double double29 = range25.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-828.0d) + "'", double29 == (-828.0d));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getLowerBound();
        double double10 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        double double26 = range24.constrain(1.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range24, (double) (byte) 100);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range24, (double) 'a');
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range24, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range24, 0.0d, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range12, range36);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        double double42 = range40.getLowerBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range37, range40);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range7, range40);
        double double45 = range7.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-899.0d) + "'", double26 == (-899.0d));
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 45.5d + "'", double45 == 45.5d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 232.75d);
        boolean boolean4 = range2.contains(50.5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, 71.0d, (-900.0d));
        double double11 = range7.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.Range range2 = new org.jfree.data.Range(296715.25d, (double) 10L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double22 = range18.getUpperBound();
        double double23 = range18.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0d + "'", double23 == 90.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        double double19 = range11.getLength();
        boolean boolean22 = range11.intersects((double) 1L, (-71.0d));
        java.lang.Class<?> wildcardClass23 = range11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range27, 32.0d);
        double double30 = range27.getCentralValue();
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range27, 55.0d, (double) 10L);
        double double34 = range33.getLowerBound();
        boolean boolean35 = range21.equals((java.lang.Object) range33);
        java.lang.String str36 = range33.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Range[-1.0,-1.0]" + "'", str36, "Range[-1.0,-1.0]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (-1.5d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (-331.75d));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean16 = range13.intersects((-1.0d), 0.0d);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (-109.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-71.0d), (-828.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) 100L);
        double double28 = range27.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range13, range27);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range13, (double) 0L, false);
        boolean boolean35 = range32.intersects(20.0d, (double) (byte) 100);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, 199.0d, true);
        java.lang.Class<?> wildcardClass39 = range32.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        double double17 = range13.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-828.0d) + "'", double17 == (-828.0d));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getUpperBound();
        boolean boolean19 = range11.contains(100.0d);
        java.lang.Class<?> wildcardClass20 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-899.0d) + "'", double17 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-71.0d), 10999.0d);
        org.jfree.data.Range range62 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range62, (double) 10L);
        double double65 = range62.getLowerBound();
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range62, (double) (-1.0f));
        double double68 = range67.getCentralValue();
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range56, range67);
        boolean boolean72 = range67.intersects(11044.5d, (-44.5d));
        java.lang.Class<?> wildcardClass73 = range67.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.5d) + "'", double68 == (-1.5d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        boolean boolean38 = range35.intersects(0.0d, 2827.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        double double14 = range2.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, 45.0d);
        boolean boolean18 = range16.equals((java.lang.Object) "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range2.intersects((double) 10, (double) 0.0f);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        boolean boolean17 = range2.equals((java.lang.Object) range7);
        java.lang.String str18 = range2.toString();
        boolean boolean20 = range2.contains((-10.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[100.0,-9.0]" + "'", str18, "Range[100.0,-9.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, 1.0d, (double) ' ');
        double double32 = range31.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5814.0d + "'", double32 == 5814.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        double double20 = range17.getUpperBound();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        double double46 = range44.constrain(1.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range32, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.0d), (double) (byte) 100);
        boolean boolean59 = range53.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range53, (-9.0d), (double) 100L);
        double double64 = range62.constrain(1.0d);
        boolean boolean65 = range50.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range47, range50);
        boolean boolean67 = range17.equals((java.lang.Object) range66);
        java.lang.Class<?> wildcardClass68 = range66.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-899.0d) + "'", double64 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }
}

